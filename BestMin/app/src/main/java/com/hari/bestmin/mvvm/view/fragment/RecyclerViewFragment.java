package com.hari.bestmin.mvvm.view.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hari.bestmin.R;
import com.hari.bestmin.databinding.FragmentRecyclerViewBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class RecyclerViewFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {


    protected FragmentRecyclerViewBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recycler_view, container, false);
        binding.swipeRefreshLayout.setColorSchemeColors(R.color.orange, R.color.green, R.color.blue);
        binding.swipeRefreshLayout.setOnRefreshListener(this);
        return binding.getRoot();
    }

    @Override
    public void onRefresh() {

    }
}
