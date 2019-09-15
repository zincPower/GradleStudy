package com.zinc.gradlestudy;

import android.content.Context;
import android.widget.Toast;

/**
 * author       : zinc
 * time         : 2019-09-15 16:17
 * desc         :
 * version      :
 */
public class ZincPower {

    public void show(Context context,String content) {
        int hi = hi(1, 2);
        Toast.makeText(context, "zinc" + +hi+" "+content, Toast.LENGTH_SHORT).show();
    }

    public int hi(int i, int j) {
        return i + j;
    }

}
