package com.aayush.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    EditText cubeEdge;
    TextView titleCube, resultCube;

    Button btn;

    Button btnCube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cubeEdge = findViewById(R.id.cubeEditText);
        titleCube = findViewById(R.id.cubeText);
        resultCube = findViewById(R.id.resultText);
        btn = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edgeSize = cubeEdge.getText().toString();

                int a = Integer.parseInt(edgeSize);

                double volume = a*a*a;

                resultCube.setText("V = " + volume + " m^3");
            }
        });
    }
}