package com.example.hw_3_3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlagAdapter extends RecyclerView.Adapter<FlagViewHolder> {

    public ArrayList<String> flagList;

    public FlagAdapter(ArrayList<String> flagList) {
        this.flagList = flagList;
    }

    @NonNull
    @Override
    public FlagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FlagViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fllag,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull FlagViewHolder holder, int position) {
      holder.bind(flagList.get(position));
    }

    @Override
    public int getItemCount() {
        return flagList.size();
    }
}
