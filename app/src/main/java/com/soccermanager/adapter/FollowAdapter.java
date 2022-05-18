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
import com.soccermanager.model.Follow;

import java.util.List;

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.ViewHolder> {
    Context context;
    List<Follow> arrayListFollow;

    public FollowAdapter(Context context, List<Follow> arrayListFollow) {
        this.context = context;
        this.arrayListFollow = arrayListFollow;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_follow,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Follow follow = arrayListFollow.get(position);
        holder.txtSTT.setText(follow.getStt());
        holder.txtName.setText(follow.getName());
        holder.imgLogo.setImageResource(follow.getImageLogo());
    }

    @Override
    public int getItemCount() {
        return arrayListFollow.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtSTT, txtName;
        ImageView imgLogo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSTT = itemView.findViewById(R.id.tSTT);
            txtName = itemView.findViewById(R.id.tNameTeamFollow);
            imgLogo =itemView.findViewById(R.id.imgLogoFollow);
        }
    }

}
