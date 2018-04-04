package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.adapter.ViewPagerAdapter;
import com.example.administrator.myapplication.view.MainPagerActivity;
import com.example.administrator.myapplication.view.RegisterActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private ViewPagerAdapter vp_adapter;
    private List<ImageView> views=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        pager=findViewById(R.id.pager);
        ImageView imageView1=new ImageView(this);
        ImageView imageView2=new ImageView(this);
        ImageView imageView3=new ImageView(this);
        imageView1.setImageResource(R.drawable.u9);
        imageView2.setImageResource(R.drawable.u10);
        imageView3.setImageResource(R.drawable.u11);
        views.add(imageView1);
        views.add(imageView2);
        views.add(imageView3);
        vp_adapter=new ViewPagerAdapter(views,this);
        pager.setAdapter(vp_adapter);
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
              if (position==2){
                          //Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_LONG).show();
                          startActivity(new Intent(MainActivity.this,MainPagerActivity.class));
              }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
