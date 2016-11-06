package com.hari.bestmin.mvvm.view.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hari.bestmin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFrgment extends BaseFragment {

    protected TabLayout tabLayout;
    protected ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_frgment, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        return view;
    }

}
