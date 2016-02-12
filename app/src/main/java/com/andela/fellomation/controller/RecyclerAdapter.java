package com.andela.fellomation.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andela.fellomation.R;
import com.andela.fellomation.model.Fellow;
import com.andela.fellomation.model.FellowManager;

import java.util.ArrayList;

/**
 * Created by andela on 2/12/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private ArrayList<Fellow> fellows;

    public RecyclerAdapter() {
        FellowManager fellowManager = new FellowManager();
        fellows = fellowManager.getAllCreatedFellow();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Fellow fellow = fellows.get(position);
        holder.fullname.setText(fellow.getFullname());
        holder.gender.setText(fellow.getGender());
    }

    @Override
    public int getItemCount() {
        return fellows.size();
    }
}
