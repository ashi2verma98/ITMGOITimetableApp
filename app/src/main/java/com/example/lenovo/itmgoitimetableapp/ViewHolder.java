package com.example.lenovo.itmgoitimetableapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mView = itemView;
    }

    public void setDetails(Context ctx , String name, String designation, String contact){

        TextView mNameView = mView.findViewById(R.id.rName);
        TextView mDesignationView = mView.findViewById(R.id.rDesignation);
        TextView mContactView = mView.findViewById(R.id.rContact);

        mNameView.setText(name);
        mDesignationView.setText(designation);
        mContactView.setText(contact);
    }
}
