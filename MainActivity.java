package com.example.addnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener()
           {

           @Override
           public void onClick(View view) {
                 String temp = num1.getText().toString();
                 String temp1 = num2.getText().toString();

                 int res = Integer.parseInt(temp) + Integer.parseInt(temp1);

                 result.setText("ANSWER : " + res);
           }
           }
        );
    }
}