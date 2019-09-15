package com.zinc.gradlestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.zinc.library.Test;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TestUtils.test();

        Test test = new Test();
        test.show(this);

        int hi = test.hi(1, 4);
        ((TextView) findViewById(R.id.tv_content)).setText("江澎涌 zinc " + hi);

        String name = BuildConfig.name;
        int age = BuildConfig.age;

        ZincPower zincPower = new ZincPower();
        int zinc = zincPower.hi(1, 4);
        zincPower.show(this, zinc+"");

    }
}
