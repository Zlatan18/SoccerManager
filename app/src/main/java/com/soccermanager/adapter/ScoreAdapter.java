package com.soccermanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.soccermanager.R;
import com.soccermanager.model.Score;

import java.util.List;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHolder>{
    private Context context;
    private List<Score> list;

    public ScoreAdapter(Context context, List<Score> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_score, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Score score = list.get(position);
        if (score==null) return;
        holder.img1.setImageResource(score.getTeam1());
        holder.img2.setImageResource(score.getTeam2());
        holder.name1.setText(score.getNameTeam1());
        holder.name2.setText(score.getNameTeam2());
        holder.goal1.setText(score.getGoal1());
        holder.goal2.setText(score.getGoal2());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //b1
        private ImageView img1,img2;
        private TextView name1, name2, goal1, goal2;

        public ViewHolder(@NonNull View view) {
            super(view);
            img1=view.findViewById(R.id.timage1);
            name1=view.findViewById(R.id.tname1);
            goal1=view.findViewById(R.id.tgoal1);
            goal2=view.findViewById(R.id.tgoal2);
            name2=view.findViewById(R.id.tname2);
            img2=view.findViewById(R.id.timage2);
        }
    }
}
