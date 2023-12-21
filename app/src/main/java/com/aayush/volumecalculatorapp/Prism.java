package com.aayush.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    TextView titlePrism, resultPrism;
    EditText prismBaseArea, prismHeight;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        titlePrism = findViewById(R.id.prismText);
        resultPrism = findViewById(R.id.prismResultText);
        prismBaseArea = findViewById(R.id.PrismBaseArea);
        prismHeight = findViewById(R.id.prismHeight);
        btn = findViewById(R.id.btn4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String height = prismHeight.getText().toString();
                String baseArea = prismBaseArea.getText().toString();

                int h = Integer.parseInt(height);
                int b = Integer.parseInt(baseArea);

                double volume = h * b;

                resultPrism.setText("V = " + (double) Math.round(volume * 100) / 100 + " m^3");
            }
        });
    }
}