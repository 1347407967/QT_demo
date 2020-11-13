package com.example.qt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private FrameLayout fl_body;
    private ImageView iv_main;
    private TextView tv_mian;
    private RelativeLayout rl_main;
    private ImageView iv_sq;
    private TextView tv_sq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        fl_body = findViewById(R.id.fl_body);//界面
        iv_main = findViewById(R.id.iv_main);//首页图片
        //首页文字
        tv_mian = findViewById(R.id.tv_main);
        //首页rl
        rl_main = findViewById(R.id.rl_main);
        //社区图片
        iv_sq = findViewById(R.id.iv_sq);
        //社区文字
        tv_sq = findViewById(R.id.tv_sq);
    }
}
