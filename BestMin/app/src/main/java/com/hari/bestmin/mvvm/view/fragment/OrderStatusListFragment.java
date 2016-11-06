package com.hari.bestmin.mvvm.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hari.bestmin.mvvm.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class OrderStatusListFragment extends RecyclerViewFragment {

    private List<Product> list = new ArrayList<>();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }
}
