package com.hari.bestmin.common.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by ELAA on 06-11-2016.
 */

public class FragmentHelper {

    public static void addFragment(FragmentActivity activity, int containerId, Fragment fragment) {
        FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
        transaction.add(containerId, fragment);
        transaction.commitAllowingStateLoss();
    }

    public static void replaceFragment(FragmentActivity activity, int containerId, Fragment fragment) {
        FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
        transaction.replace(containerId, fragment);
        transaction.commitAllowingStateLoss();
    }

    public static void replaceAndAddFragment(FragmentActivity activity, int containerId, Fragment fragment) {
        FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
        transaction.replace(containerId, fragment);
        transaction.addToBackStack(null);
        transaction.commitAllowingStateLoss();
    }
}
