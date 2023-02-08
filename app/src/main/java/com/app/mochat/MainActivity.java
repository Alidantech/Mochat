package com.app.mochat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout = findViewById(R.id.frame_1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}