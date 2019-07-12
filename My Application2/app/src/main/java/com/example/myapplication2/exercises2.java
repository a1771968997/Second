package com.example.myapplication2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

//System.out.println打印所有view的数目，包括view和viewgroup

public class exercises2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises2);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_chatroom,null);
        setContentView(inflate);
        //getViewCount(inflate);
        System.out.println("count:"+getViewCount(inflate));
        EditText editText= findViewById(R.id.ed_say);
        editText.setText("View和ViewGroup的个数为"+getViewCount(inflate));
    }
    public static int getViewCount(View view) {
        //todo 补全你的代码
        int count=0;
        if(view instanceof ViewGroup){
            int x=((ViewGroup) view).getChildCount();
            for(int i=0;i<x;i++)
            {
                View v=((ViewGroup) view).getChildAt(i);
                count+=getViewCount(v);
            }
        }
        count++;
        return count;
    }
}
