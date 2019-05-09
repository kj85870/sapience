package com.example.sapience;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {
    Button btn,btn1;
    TextView text;
    EditText text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.button);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text = findViewById(R.id.account);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this, Register.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this, navbar.class);
                startActivity(intent);
            }
        });
    }

}
