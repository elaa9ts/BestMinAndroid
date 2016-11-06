package com.hari.bestmin.mvvm.view.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hari.bestmin.common.Constants;
import com.hari.bestmin.common.Utility;
import com.hari.bestmin.common.util.FragmentHelper;
import com.hari.bestmin.mvvm.view.fragment.OrderStatusHomeFragment;
import com.hari.bestmin.mvvm.view.fragment.OrderStatusListFragment;
import com.hari.bestmin.mvvm.view.fragment.ProductHomeFragment;
import com.hari.bestmin.mvvm.view.fragment.ProductListFragment;

import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<String> list;
    private String item;

    public HomePagerAdapter(FragmentManager fm, Context context, List<String> list, String item) {
        super(fm);
        this.context = context;
        this.list = list;
        this.item = item;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (item) {
            case Constants.SectionType.PRODUCT:
                fragment = new ProductListFragment();
                break;
            case Constants.SectionType.ORDER:
                fragment = new OrderStatusListFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
