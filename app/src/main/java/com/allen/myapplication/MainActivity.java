package com.allen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.allen.okhttp3demo.OkHttpActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnHttp3Demo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        mBtnHttp3Demo = findViewById(R.id.btn_okhttp_demo);
    }

    private void initListener() {
        mBtnHttp3Demo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_okhttp_demo:
                startActivity(new Intent(MainActivity.this, OkHttpActivity.class));
                break;
        }
    }
}
