package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        int data = getIntent().getIntExtra("position",-1);
        TextView view = findViewById(R.id.textView5);
        if(data==-1)
            view.setText("未获取position值！");
        else
            view.setText("这是第"+data+"个Item！");
    }
}
