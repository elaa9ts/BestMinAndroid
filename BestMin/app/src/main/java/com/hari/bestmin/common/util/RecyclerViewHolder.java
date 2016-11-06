package com.hari.bestmin.common.util;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ELAA on 06-11-2016.
 */

public class RecyclerViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    private final T binding;

    public RecyclerViewHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public T getBinding() {
        return binding;
    }
}
