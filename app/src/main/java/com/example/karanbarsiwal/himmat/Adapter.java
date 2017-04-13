package com.example.karanbarsiwal.himmat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by karan barsiwal on 12-04-2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.TabViewHolder> {
    private LayoutInflater inflater;
    public Adapter(Context context){
        inflater =LayoutInflater.from(context);
    }
    @Override
    public TabViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.tab_cards,parent,false);
        TabViewHolder holder = new TabViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(TabViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
    class TabViewHolder extends RecyclerView.ViewHolder {
        public TabViewHolder(View itemView) {
            super(itemView);
        }
    }
}
