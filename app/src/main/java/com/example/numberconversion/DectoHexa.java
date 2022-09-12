package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DectoHexa extends AppCompatActivity {

    private EditText input;
    private TextView answer;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decto_hexa);

        input = findViewById(R.id.input);
        answer = findViewById(R.id.answer);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n5 = String.valueOf(input.getText());
                int decHex = Integer.parseInt(n5);
                answer.setText(decToHex(decHex));


            }
        });
    }

    /* method for converting Decimal to Hexadecimal */
    public static String decToHex(int dec) {
        int remainder;
        String hexadecimal = "";
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (dec>0) {
            remainder = dec%16;
            hexadecimal = hex[remainder] + hexadecimal;
            dec /= 16;
        }
        return hexadecimal;
    }
}