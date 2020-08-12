package com.example.explicit_intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    TextView tv_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv_second = findViewById(R.id.tv_second);

        String name = getIntent().getStringExtra("name");
    }
}
