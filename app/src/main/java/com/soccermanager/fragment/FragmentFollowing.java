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
import com.soccermanager.adapter.FollowAdapter;
import com.soccermanager.model.Follow;

import java.util.ArrayList;
import java.util.List;


public class FragmentFollowing extends Fragment {
    FollowAdapter followAdapter;
    List<Follow> followArrayList;
    RecyclerView recyclerView;
    public FragmentFollowing() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        followArrayList = new ArrayList<>();
        View view =  inflater.inflate(R.layout.fragment_matches,container,false);
        followArrayList.add(new Follow("1","West Ham",R.drawable.ic_liverpool));
        followArrayList.add(new Follow("2","Man City",R.drawable.ic_liverpool));
        followArrayList.add(new Follow("3","Arsenal",R.drawable.ic_liverpool));
        followArrayList.add(new Follow("4","Man United",R.drawable.ic_liverpool));
        recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext(), RecyclerView.VERTICAL,false);
        followAdapter = new FollowAdapter(view.getContext(),followArrayList);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(followAdapter);
        return view;
    }
}
