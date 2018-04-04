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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mBackLogin;
    private TextView mRegisterLogin;
    private TextView mQhLogin;
    private EditText mPhoneLogin;
    private EditText mPwdLogin;
    private Button mButLogin;
    private ImageView mWxLogin;
    private ImageView mWbLogin;
    private ImageView mQqLogin;
    private ImageView mLineLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        initView();
    }

    private void initView() {
        mBackLogin = (ImageView) findViewById(R.id.login_back);
        mBackLogin.setOnClickListener(this);
        mRegisterLogin = (TextView) findViewById(R.id.login_register);
        mRegisterLogin.setOnClickListener(this);
        mQhLogin = (TextView) findViewById(R.id.login_qh);
        mPhoneLogin = (EditText) findViewById(R.id.login_phone);
        mPwdLogin = (EditText) findViewById(R.id.login_pwd);
        mButLogin = (Button) findViewById(R.id.login_but);
        mButLogin.setOnClickListener(this);
        mWxLogin = (ImageView) findViewById(R.id.login_wx);
        mWxLogin.setOnClickListener(this);
        mWbLogin = (ImageView) findViewById(R.id.login_wb);
        mWbLogin.setOnClickListener(this);
        mQqLogin = (ImageView) findViewById(R.id.login_qq);
        mQqLogin.setOnClickListener(this);
        mLineLogin = (ImageView) findViewById(R.id.login_line);
        mLineLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_back:
                // TODO 18/04/03
                break;
            case R.id.login_register:
                // TODO 18/04/03
                break;
            case R.id.login_but:
                // TODO 18/04/03
                break;
            case R.id.login_wx:
                // TODO 18/04/03
                break;
            case R.id.login_wb:
                // TODO 18/04/03
                break;
            case R.id.login_qq:
                // TODO 18/04/03
                break;
            case R.id.login_line:
                // TODO 18/04/03
                break;
            case R.id.login_qh:

                break;
            default:
                break;
        }
    }
}
