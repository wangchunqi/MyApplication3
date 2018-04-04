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

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mBackRegister;
    private TextView mLoginRegister;
    private TextView mQhRegister;
    private EditText mPhoneRegister;
    private EditText mYzhmRegister;
    private TextView mTextYzhqRegister;
    private EditText mPwdRegister;
    private EditText mPwd2Register;
    private Button mButRegister;
    private ImageView mLoginWxRegister;
    private ImageView mLoginWbRegister;
    private ImageView mLoginQqRegister;
    private ImageView mLoginLineRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        initView();
    }

    private void initView() {
        mBackRegister = (ImageView) findViewById(R.id.register_back);
        mBackRegister.setOnClickListener(this);
        mLoginRegister = (TextView) findViewById(R.id.register_login);
        mLoginRegister.setOnClickListener(this);
        mQhRegister = (TextView) findViewById(R.id.register_qh);
        mQhRegister.setOnClickListener(this);
        mPhoneRegister = (EditText) findViewById(R.id.register_phone);
        mYzhmRegister = (EditText) findViewById(R.id.register_yzhm);
        mTextYzhqRegister = (TextView) findViewById(R.id.register_text_yzhq);
        mPwdRegister = (EditText) findViewById(R.id.register_pwd);
        mPwd2Register = (EditText) findViewById(R.id.register_pwd2);
        mButRegister = (Button) findViewById(R.id.register_but);
        mButRegister.setOnClickListener(this);
        mLoginWxRegister = (ImageView) findViewById(R.id.register_login_wx);
        mLoginWxRegister.setOnClickListener(this);
        mLoginWbRegister = (ImageView) findViewById(R.id.register_login_wb);
        mLoginWbRegister.setOnClickListener(this);
        mLoginQqRegister = (ImageView) findViewById(R.id.register_login_qq);
        mLoginQqRegister.setOnClickListener(this);
        mLoginLineRegister = (ImageView) findViewById(R.id.register_login_line);
        mLoginLineRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register_back:
                // TODO 18/04/03
                break;
            case R.id.register_login:
                // TODO 18/04/03
                break;
            case R.id.register_qh:
                // TODO 18/04/03
                break;
            case R.id.register_but:
                // TODO 18/04/03
                break;
            case R.id.register_login_wx:
                // TODO 18/04/03
                break;
            case R.id.register_login_wb:
                // TODO 18/04/03
                break;
            case R.id.register_login_qq:
                // TODO 18/04/03
                break;
            case R.id.register_login_line:
                // TODO 18/04/03
                break;
            default:
                break;
        }
    }
}
