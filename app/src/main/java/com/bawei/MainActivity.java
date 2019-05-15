package com.bawei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.base.BaseActivity;
import com.youth.banner.Banner;

public class MainActivity extends BaseActivity {


    private Banner banner;

    @Override
    protected void bindView() {
        banner = findViewById(R.id.banner);
    }

    @Override
    protected void bindData() {

    }


    @Override
    protected int bindLayout() {
        return R.layout.activity_main;
    }
}
