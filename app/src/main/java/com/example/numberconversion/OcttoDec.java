package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OcttoDec extends AppCompatActivity {

    private EditText input;
    private TextView answer;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octto_dec);

        input = findViewById(R.id.input);
        answer = findViewById(R.id.answer);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n4 = String.valueOf(input.getText());
                int octDec = Integer.parseInt(n4);
                answer.setText(String.valueOf(octalToDecimal(octDec)));


            }
        });
    }

    /* method for converting Octal to Decimal */
    public static int octalToDecimal(int oct) {
        int remainder;
        int result=0;
        int power=0;
        while (oct>0) {
            remainder = oct%10;
            result += (remainder * (Math.pow(8, power)));
            oct /= 10;
            power++;
        }
        return result;
    }
}