package com.example.administrator.myapplication.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2018/4/3/003.
 */

public class PhoneActikvity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mBackPhone;
    private TextView mQhPhone;
    private EditText mPhPhone;
    private EditText mYzhmPhone;
    private TextView mTextYzhmPhone;
    private EditText mPwdPhone;
    private EditText mPwd2Phone;
    private Button mButPhone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);
        initView();
    }

    private void initView() {
        mBackPhone = (ImageView) findViewById(R.id.phone_back);
        mBackPhone.setOnClickListener(this);
        mQhPhone = (TextView) findViewById(R.id.phone_qh);
        mQhPhone.setOnClickListener(this);
        mPhPhone = (EditText) findViewById(R.id.phone_ph);
        mYzhmPhone = (EditText) findViewById(R.id.phone_yzhm);
        mTextYzhmPhone = (TextView) findViewById(R.id.phone_text_yzhm);
        mTextYzhmPhone.setOnClickListener(this);
        mPwdPhone = (EditText) findViewById(R.id.phone_pwd);
        mPwd2Phone = (EditText) findViewById(R.id.phone_pwd2);
        mButPhone = (Button) findViewById(R.id.phone_but);
        mButPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.phone_back:
                // TODO 18/04/03
                break;
            case R.id.phone_qh:
                // TODO 18/04/03
                break;
            case R.id.phone_text_yzhm:
                // TODO 18/04/03
                break;
            case R.id.phone_but:
                // TODO 18/04/03
                break;
            default:
                break;
        }
    }
}
