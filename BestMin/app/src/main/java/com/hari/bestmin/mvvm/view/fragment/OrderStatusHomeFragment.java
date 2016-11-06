package com.hari.bestmin.mvvm.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;

import com.hari.bestmin.common.Constants;
import com.hari.bestmin.mvvm.model.Product;
import com.hari.bestmin.mvvm.view.adapter.HomePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class OrderStatusHomeFragment extends HomeFrgment {

    private List<String> list = new ArrayList<>();
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadCategoryTitle();
    }

    private void loadCategoryTitle(){
        list.add("Active");
        list.add("Pending");
        list.add("Closed");

        viewPager.setAdapter(new HomePagerAdapter(getChildFragmentManager(), getActivity(), list, Constants.SectionType.ORDER));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
    }
}
