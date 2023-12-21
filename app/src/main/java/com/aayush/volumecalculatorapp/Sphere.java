package com.aayush.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText sphereRadius;
    TextView Title, result;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereRadius = findViewById(R.id.editText);
        Title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView4);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphereRadius.getText().toString();

                int r = Integer.parseInt(radius);

                double volume = (1.3333333) * 3.14159265359 * r*r*r;

                result.setText("V = " + (double) Math.round(volume * 100) / 100 + " m^3");
            }
        });
    }
}