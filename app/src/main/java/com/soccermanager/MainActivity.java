package com.soccermanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.soccermanager.adapter.ViewPagerAdapter;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        bottomNavigationView = findViewById(R.id.navigation);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), 5);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.matches).setCheckable(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.news).setCheckable(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.cup).setCheckable(true);
                        break;
                    case 3:
                        bottomNavigationView.getMenu().findItem(R.id.following).setCheckable(true);
                        break;
                    case 4:
                        bottomNavigationView.getMenu().findItem(R.id.more).setCheckable(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.matches:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.news:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.cup:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.following:
                        viewPager.setCurrentItem(3);
                        break;
                    case R.id.more:
                        viewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_account, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuAccount:
                break;
            case R.id.menuExit:
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Bạn đã đăng xuất thành công", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}


    // Tool bar: Account + Exit
