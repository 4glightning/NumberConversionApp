package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnDecBin, btnBinDec, btnDecOct, btnOctDec, btnDecHex, btnHexDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDecBin = findViewById(R.id.btnDecBin);
        btnBinDec = findViewById(R.id.btnBinDec);
        btnDecOct = findViewById(R.id.btnDecOct);
        btnOctDec = findViewById(R.id.btnOctDec);
        btnDecHex = findViewById(R.id.btnDecHex);
        btnHexDec = findViewById(R.id.btnHexDec);

        btnDecBin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, DectoBinary.class);
                startActivity(i);

            }
        });

        btnBinDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, BinarytoDec.class);
                startActivity(i);

            }
        });

        btnDecOct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, DectoOct.class);
                startActivity(i);

            }
        });

        btnOctDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, OcttoDec.class);
                startActivity(i);

            }
        });

        btnDecHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, DectoHexa.class);
                startActivity(i);

            }
        });

        btnHexDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, HexatoDec.class);
                startActivity(i);

            }
        });


    }

}