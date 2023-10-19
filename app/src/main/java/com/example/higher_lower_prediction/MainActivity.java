package com.example.higher_lower_prediction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btncheck);
        edt = findViewById(R.id.edtNumber);
        int randNumber = (int)(Math.random()*10+1);//Math.random() returns a value from 0 to 10 so we multiplied it by 10


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = edt.getText().toString();
                int intvalue = Integer.parseInt(val);
                 if(intvalue<randNumber)
                     Toast.makeText(MainActivity.this, "Get a higher number!", Toast.LENGTH_SHORT).show();
                 else if(intvalue>randNumber)
                     Toast.makeText(MainActivity.this, "Get a lower number!", Toast.LENGTH_SHORT).show();
                 else
                     Toast.makeText(MainActivity.this, "Congratulations!! You are the lucky one!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}