package com.example.administrator.myapplication.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.fragment.HomeFragment;
import com.example.administrator.myapplication.fragment.MyFragment;
import com.example.administrator.myapplication.fragment.RecommendFragment;
import com.example.administrator.myapplication.fragment.SmallFragment;
import com.hjm.bottomtabbar.BottomTabBar;

/**
 * Created by Administrator on 2018/4/3/003.
 */

public class MainPagerActivity extends AppCompatActivity {


    private BottomTabBar bottab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
    }

    private void initView() {
        bottab = (BottomTabBar) findViewById(R.id.bottab);
        bottab.init(getSupportFragmentManager())
                .setImgSize(40,40)
                .setFontSize(17)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.parseColor("#c7977f"),Color.parseColor("#999999"))
                .addTabItem("首页",R.mipmap.home2,R.mipmap.home, HomeFragment.class)
                .addTabItem("微聊",R.mipmap.small2,R.mipmap.small, SmallFragment.class)
                .addTabItem("推荐",R.mipmap.recommend2,R.mipmap.recommend,RecommendFragment.class)
                .addTabItem("我的",R.mipmap.my2,R.mipmap.my, MyFragment.class)
                .isShowDivider(true)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {

                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });
    }

}
