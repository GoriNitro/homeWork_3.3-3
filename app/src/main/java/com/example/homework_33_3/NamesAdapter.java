package com.example.homework_33_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<NamesVH> {
    private ArrayList<String> nameList;

    public NamesAdapter(ArrayList<String> nameList) {
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public NamesVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NamesVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NamesVH holder, int position) {
        holder.bind(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
