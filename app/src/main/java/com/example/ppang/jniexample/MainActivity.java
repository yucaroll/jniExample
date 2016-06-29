package com.example.ppang.jniexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("jniExample");
    }

    public native int getJNIString(int a);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView jniText = (TextView)findViewById(R.id.jniText);
        jniText.setText(String.valueOf(getJNIString(10)));
    }
}



