package com.example.hw_3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class FlagViewHolder extends RecyclerView.ViewHolder {

    private TextView tvFlags;

    public FlagViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFlags = itemView.findViewById(R.id.tv_flags);
    }
    public void bind(String flagList) {
        tvFlags.setText(flagList);}
}
