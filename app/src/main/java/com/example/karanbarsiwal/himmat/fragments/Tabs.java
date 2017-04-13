package com.example.karanbarsiwal.himmat.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.karanbarsiwal.himmat.Adapter;
import com.example.karanbarsiwal.himmat.R;


public class Tabs extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    public Tabs() {
    }
    public static Tabs newInstance() {
        Tabs fragment = new Tabs();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_tabs, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new Adapter(getContext());
        recyclerView.setAdapter(adapter);
        return layout;
    }
}
