package com.hari.bestmin.mvvm.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hari.bestmin.BR;
import com.hari.bestmin.R;
import com.hari.bestmin.common.util.RecyclerViewHolder;
import com.hari.bestmin.mvvm.model.Product;

import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class OrderStatusListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

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
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.adapter_order_status_list_item, parent, false);
        return new RecyclerViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RecyclerViewHolder){
            Product item = list.get(position);
            RecyclerViewHolder viewHolder = (RecyclerViewHolder) holder;
            viewHolder.getBinding().setVariable(BR.order, item);
            viewHolder.getBinding().executePendingBindings();
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
