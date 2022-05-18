package com.soccermanager.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.soccermanager.R;
import com.soccermanager.adapter.ScoreAdapter;
import com.soccermanager.model.Score;

import java.util.ArrayList;
import java.util.List;

public class FragmentMatches extends Fragment {
    private ScoreAdapter scoreAdapter;
    private RecyclerView recyclerView;
    private List<Score> list;
    public FragmentMatches() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_matches,container,false);
        list = new ArrayList<>();
        list.add(new Score(R.drawable.ic_cup,R.drawable.ic_cup,"U23 Laos", "U23 Campuchia", "1","2" ));
        list.add(new Score(R.drawable.ic_cup,R.drawable.ic_cup,"U23 VietNam", "U23 Thai", "1","1" ));
        list.add(new Score(R.drawable.ic_cup,R.drawable.ic_cup,"U23 Thai", "U23 VietNam", "2","1" ));
        recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        scoreAdapter = new ScoreAdapter(view.getContext(),list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(scoreAdapter);
        return view;
    }
}
