package com.example.shengyiwuadd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tv_1;
    private TextView tv_2;
    private TextView tv_3;
    private TextView tv_4;
    private TextView tv_renovate;
    private AddDB addDB;
    private TextView tv_11;
    private TextView tv_21;
    private TextView tv_31;
    private TextView tv_41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        putValue();

        tv_renovate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent refreshIntent = getIntent();
                finish();
                startActivity(refreshIntent);
                //putValue();
                //Toast.makeText(MainActivity.this, "刷新圣遗物属性", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        tv_11 = (TextView) findViewById(R.id.tv_11);
        tv_21 = (TextView) findViewById(R.id.tv_21);
        tv_31 = (TextView) findViewById(R.id.tv_31);
        tv_41 = (TextView) findViewById(R.id.tv_41);
        tv_renovate = (TextView) findViewById(R.id.tv_renovate);

    }

    private void initData() {
        addDB = new AddDB();

    }

    private void putValue(){
        int[] ints = addDB.addEntry();
        int a1=ints[0];
        int a2=ints[1];
        int a3=ints[2];
        int a4=ints[3];

        addDB.number2Entry(tv_1,a1);
        addDB.number2Entry(tv_2,a2);
        addDB.number2Entry(tv_3,a3);
        addDB.number2Entry(tv_4,a4);


        addDB.addNumber(tv_11,a1);
        addDB.addNumber(tv_21,a2);
        addDB.addNumber(tv_31,a3);
        addDB.addNumber(tv_41,a4);
    }

}