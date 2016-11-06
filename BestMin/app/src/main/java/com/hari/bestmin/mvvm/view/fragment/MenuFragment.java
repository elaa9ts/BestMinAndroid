package com.hari.bestmin.mvvm.view.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hari.bestmin.R;
import com.hari.bestmin.common.ClickEvents;
import com.hari.bestmin.mvvm.view.adapter.MenuAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<String> list = new ArrayList<>();
    private MenuAdapter adapter;
    private ClickEvents.LeftMenuItemListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (ClickEvents.LeftMenuItemListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_menu, container, false);
        listView = (ListView) view.findViewById(R.id.list_view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        loadMenuData();
        adapter = new MenuAdapter(getContext(), list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        listener.onLeftMenuItemClick(list.get(position), position, true);
    }

    private void loadMenuData(){
        list.add("Product");
        list.add("Orders");
        list.add("Add New Product");
        list.add("About Us");
    }
}
