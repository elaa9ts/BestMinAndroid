package com.hari.bestmin.mvvm.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hari.bestmin.BR;
import com.hari.bestmin.R;
import com.hari.bestmin.common.util.RecyclerViewHolder;
import com.hari.bestmin.databinding.AdapterProductListItemBinding;
import com.hari.bestmin.mvvm.model.Product;

import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class ProductListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private LayoutInflater layoutInflater;
    private Context context;
    private List<Product> list;

    public ProductListAdapter(Context context, List<Product> list) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AdapterProductListItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.adapter_product_list_item, parent, false);
        return new RecyclerViewHolder<>(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof RecyclerViewHolder){
            Product item = list.get(position);
            RecyclerViewHolder viewHolder = (RecyclerViewHolder) holder;
            viewHolder.getBinding().setVariable(BR.product, item);
            viewHolder.getBinding().executePendingBindings();
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
