package com.bing.lan.threadpoolproxydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Executors.newCachedThreadPool();
    }
}
