package com.hari.bestmin.common;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ELAA on 06-11-2016.
 */

public class Utility {

    public static void showToast(Context context, String message) {
        Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
