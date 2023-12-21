package com.aayush.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {


    TextView titleCylinder, resultCylinder;
    EditText cylinderRadius, cylinderHeight;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        titleCylinder = findViewById(R.id.cylinderText);
        resultCylinder = findViewById(R.id.cylinderResultText);
        cylinderRadius = findViewById(R.id.cylinderRadius);
        cylinderHeight = findViewById(R.id.cylinderHeight);
        btn = findViewById(R.id.btn3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String height = cylinderHeight.getText().toString();
                String radius = cylinderRadius.getText().toString();

                int h = Integer.parseInt(height);
                int r = Integer.parseInt(radius);

                double volume = 3.14159265359 * r * r * h;

                resultCylinder.setText("V = " + (double) Math.round(volume * 100) / 100 + " m^3");
            }
        });

    }
}