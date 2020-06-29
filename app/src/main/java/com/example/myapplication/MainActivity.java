package com.example.myapplication;

import java.text.SimpleDateFormat;
import android.os.Bundle;
import android.app.Activity;
import java.util.*;
import android.widget.TextView;


public class MainActivity extends Activity {
    long time = System.currentTimeMillis();

    Date date = new Date(time);

    SimpleDateFormat thetime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String formatDate = thetime.format(date);
    TextView Now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Now = (TextView) findViewById(R.id.Now);
        Now.setText(formatDate);    // TextView 에 현재 시간 문자열 할당
    }
}
