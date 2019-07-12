package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class exercises1 extends AppCompatActivity {
    private static final String TAG = exercises1.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises1);
        Log.d(TAG, "onCreate: 1");
        System.out.println(1);
    }
}
