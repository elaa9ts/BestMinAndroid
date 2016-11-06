package com.hari.bestmin.mvvm.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import com.hari.bestmin.R;
import com.hari.bestmin.common.ClickEvents;
import com.hari.bestmin.common.Constants;
import com.hari.bestmin.common.Utility;
import com.hari.bestmin.common.util.FragmentHelper;
import com.hari.bestmin.mvvm.view.fragment.MenuFragment;
import com.hari.bestmin.mvvm.view.fragment.OrderStatusHomeFragment;
import com.hari.bestmin.mvvm.view.fragment.ProductHomeFragment;
import com.hari.bestmin.mvvm.view.fragment.ProductListFragment;

public class MainActivity extends BaseActivity implements ClickEvents.LeftMenuItemListener {

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

        FragmentHelper.addFragment(this, R.id.navigation_view, new MenuFragment());
    }

    @Override
    public void onLeftMenuItemClick(String item, int position, boolean isClosed) {
        if (isClosed)
            drawerLayout.closeDrawers();
        Fragment fragment = null;
        switch (item) {
            case Constants.SectionType.PRODUCT:
                fragment = new ProductHomeFragment();
                break;
            case Constants.SectionType.ORDER:
                fragment = new OrderStatusHomeFragment();
                break;
            case Constants.SectionType.ADD_NEW:
                Utility.showToast(this, "Under Development");
                return;
            case Constants.SectionType.ABOUT:
                Utility.showToast(this, "Under Development");
                return;
        }
        FragmentHelper.replaceFragment(this, R.id.home_container, fragment);
    }
}
