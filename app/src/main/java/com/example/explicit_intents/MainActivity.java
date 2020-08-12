package com.example.explicit_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn_Act2;
    Button btn_Act3;
    TextView tv_results;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       editText = findViewById(R.id.editText);
        btn_Act2 = findViewById(R.id.btn_Act2);
        btn_Act3 = findViewById(R.id.btn_Act3);
        tv_results = findViewById(R.id.tv_results);

        btn_Act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else {
                    String name = editText.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this, com.example.explicit_intents.Activity_2.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }


            }
        });

        btn_Act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
