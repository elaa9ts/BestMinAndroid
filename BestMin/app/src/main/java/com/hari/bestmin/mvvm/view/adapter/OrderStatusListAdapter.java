package com.hari.bestmin.mvvm.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hari.bestmin.mvvm.model.Product;

import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class OrderStatusListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private LayoutInflater layoutInflater;
    private List<Product> list;
    private Context context;

    public OrderStatusListAdapter(Context context, List<Product> list) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
