package com.andela.fellomation.controller;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.andela.fellomation.R;

/**
 * Created by andela on 2/12/16.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {
    public TextView fullname, gender;
    public ItemViewHolder(View itemView) {
        super(itemView);
        fullname = (TextView) itemView.findViewById(R.id.fullname);
        gender = (TextView) itemView.findViewById(R.id.gender);
    }
}
