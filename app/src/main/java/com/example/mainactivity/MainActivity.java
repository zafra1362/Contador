package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mainactivity.R;

public class MainActivity extends AppCompatActivity {

    int contador1;
    TextView contadorclicks1;
    Button aumentoContador1;

    int contador2;
    TextView contadorclicks2;
    Button aumentoContador2;

    int contador3;
    TextView contadorclicks3;
    Button aumentoContador3;

    int contador4;
    TextView contadorclicks4;
    Button aumentoContador4;

    int contadorgeneral;
    TextView contadorAll;


    Button reset1;
    Button reset2;
    Button reset3;
    Button reset4;
    Button resetAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorclicks1 = findViewById(R.id.contador1);
        aumentoContador1 = findViewById(R.id.augmentar1);
        contadorAll = findViewById(R.id.contadorAll);

        aumentoContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                contadorgeneral++;
                contadorclicks1.setText(String.valueOf(contador1));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        contadorclicks2 = findViewById(R.id.contador2);
        aumentoContador2 = findViewById(R.id.augmentar2);

        aumentoContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                contadorgeneral++;
                contadorclicks2.setText(String.valueOf(contador2));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        contadorclicks3 = findViewById(R.id.contador3);
        aumentoContador3 = findViewById(R.id.augmentar3);

        aumentoContador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                contadorgeneral++;
                contadorclicks3.setText(String.valueOf(contador3));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        contadorclicks4 = findViewById(R.id.contador4);
        aumentoContador4 = findViewById(R.id.augmentar4);

        aumentoContador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                contadorgeneral++;
                contadorclicks4.setText(String.valueOf(contador4));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        reset1 = findViewById(R.id.reset1);
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorgeneral = contadorgeneral - contador1;
                contador1 = 0;
                contadorclicks1.setText(String.valueOf(contador1));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        reset2 = findViewById(R.id.reset2);
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorgeneral = contadorgeneral - contador2;
                contador2 = 0;
                contadorclicks2.setText(String.valueOf(contador2));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        reset3 = findViewById(R.id.reset3);
        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorgeneral = contadorgeneral - contador3;
                contador3 = 0;
                contadorclicks3.setText(String.valueOf(contador3));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        reset4 = findViewById(R.id.reset4);
        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorgeneral = contadorgeneral - contador4;
                contador4 = 0;
                contadorclicks4.setText(String.valueOf(contador4));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

        resetAll = findViewById(R.id.resetAll);
        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contadorgeneral = 0;
                contadorclicks1.setText(String.valueOf(contador1));
                contadorclicks2.setText(String.valueOf(contador2));
                contadorclicks3.setText(String.valueOf(contador3));
                contadorclicks4.setText(String.valueOf(contador4));
                contadorAll.setText(String.valueOf(contadorgeneral));
            }
        });

    }
}
