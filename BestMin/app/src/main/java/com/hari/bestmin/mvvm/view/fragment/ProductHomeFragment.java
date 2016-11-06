package com.hari.bestmin.mvvm.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.hari.bestmin.mvvm.view.adapter.HomePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class ProductHomeFragment extends HomeFrgment {

    private static final String TAG = "TAG";
    private List<String> list = new ArrayList<>();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadCategoryTitle();
    }

    private void loadCategoryTitle(){
        list.add("Position 1");
        list.add("Position 2");
        list.add("Position 3");
        list.add("Position 4");

        viewPager.setAdapter(new HomePagerAdapter(getChildFragmentManager(), getActivity(), list));
        tabLayout.setupWithViewPager(viewPager);
    }
}
