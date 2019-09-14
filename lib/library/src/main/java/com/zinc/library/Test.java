package com.zinc.library;

import android.content.Context;
import android.widget.Toast;

/**
 * author       : zinc
 * time         : 2019-09-11 23:20
 * desc         :
 * version      :
 */
public class Test {

    public void show(Context context) {
        int hi = hi(1, 2);
        Toast.makeText(context, "zinc" + hi, Toast.LENGTH_SHORT).show();
    }

    public int hi(int i, int j) {
        return i + j;
    }

}
