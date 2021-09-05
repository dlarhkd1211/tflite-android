package com.example.digitclassifier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyActivity", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyActivity", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyActivity", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyActivity", "onResume");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.d("MyActivity", "onCreate");
    }
}
