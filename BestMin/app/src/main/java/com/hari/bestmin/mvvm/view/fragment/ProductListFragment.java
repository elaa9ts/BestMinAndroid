package com.hari.bestmin.mvvm.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hari.bestmin.mvvm.model.Product;
import com.hari.bestmin.mvvm.view.adapter.ProductListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class ProductListFragment extends RecyclerViewFragment {

    private List<Product> list = new ArrayList<>();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ProductListAdapter adapter = new ProductListAdapter(getContext(), list);
        binding.recyclerView.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        for (int i = 0; i < 15; i++) {
            list.add(new Product("BMW"));
        }
        binding.recyclerView.getAdapter().notifyDataSetChanged();
    }
}
