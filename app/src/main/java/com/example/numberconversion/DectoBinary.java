package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DectoBinary extends AppCompatActivity {

    private EditText input;
    private TextView answer;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decto_binary);

        input = findViewById(R.id.input);
        answer = findViewById(R.id.answer);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = String.valueOf(input.getText());
                int dec = Integer.parseInt(n1);
                answer.setText(decToBin(dec));


            }
        });

    }

    /* method for converting from Decimal to Binary */
    public static String decToBin(int dec) {
        int remainder;
        String output="";
        while(dec>0) {
            remainder = dec%2;
            output = remainder + output;
            dec /= 2;
        }
        return output;
    }
}