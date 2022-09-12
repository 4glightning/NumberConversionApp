package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BinarytoDec extends AppCompatActivity {

    private EditText input;
    private TextView answer;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binaryto_dec);

        input = findViewById(R.id.input);
        answer = findViewById(R.id.answer);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n2 = String.valueOf(input.getText());
                int bin = Integer.parseInt(n2);
                answer.setText(String.valueOf(binToDec(bin)));


            }
        });
    }

    /* method for converting from Binary to Decimal */
    public static int binToDec(int bin) {
        int remainder;
        int result=0;
        int power=0;
        while (bin>0) {
            remainder = bin%10;
            result +=(remainder * Math.pow(2, power)) ;
            bin /= 10;
            power++;
        }
        return result;
    }
}