package com.example.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
/*exercises1:
旋转后执行函数的顺序为：onPause,onStop,onDestroy,onCreate,onStart,onResume,相当于把页面销毁后重新创建打开，太耗费资源，而且旋转会给UI设计带来很大的麻烦
*/
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button,button1,button2;
    private static final String TAG = "测试";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d(TAG, "onCreate: 1");
        button= findViewById(R.id.button);
        button1= findViewById(R.id.button2);
        button2= findViewById(R.id.button3);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this,exercises1.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this,exercises2.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this,exercises3.class));
                break;
        }
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart: 2");
        //System.out.println(2);
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume: 3");
        //System.out.println(3);
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause: 4");
        //System.out.println(4);
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop: 5");
        //System.out.println(5);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: 6");
       //System.out.println(6);
    }
}
