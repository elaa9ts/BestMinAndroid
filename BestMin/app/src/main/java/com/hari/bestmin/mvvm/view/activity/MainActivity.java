package com.hari.bestmin.mvvm.view.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import com.hari.bestmin.R;
import com.hari.bestmin.common.util.FragmentHelper;
import com.hari.bestmin.mvvm.view.fragment.OrderStatusHomeFragment;
import com.hari.bestmin.mvvm.view.fragment.ProductHomeFragment;
import com.hari.bestmin.mvvm.view.fragment.ProductListFragment;

public class MainActivity extends BaseActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerToggle.syncState();
        drawerLayout.addDrawerListener(drawerToggle);

        FragmentHelper.addFragment(this, R.id.home_container, new OrderStatusHomeFragment());
    }
}
