package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DectoOct extends AppCompatActivity {

    private EditText input;
    private TextView answer;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decto_oct);

        input = findViewById(R.id.input);
        answer = findViewById(R.id.answer);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n3 = String.valueOf(input.getText());
                int decOct = Integer.parseInt(n3);
                answer.setText(decToOctal(decOct));


            }
        });
    }

    /* method for converting Decimal to Octal */
    public static String decToOctal(int dec) {
        int remainder = 0;
        int res1;
        int result;
        String output = "";
        while(dec>0) {
            remainder = dec/8;
            res1 = remainder*8;
            result = dec - res1;
            output = result + output;
            dec /= 8;
        }
        return output;
    }
}