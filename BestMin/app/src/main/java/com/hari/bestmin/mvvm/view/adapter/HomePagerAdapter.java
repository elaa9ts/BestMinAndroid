package com.hari.bestmin.mvvm.view.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hari.bestmin.mvvm.view.fragment.ProductListFragment;

import java.util.List;

/**
 * Created by ELAA on 06-11-2016.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<String> list;

    public HomePagerAdapter(FragmentManager fm, Context context, List<String> list) {
        super(fm);
        this.context = context;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new ProductListFragment();
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
