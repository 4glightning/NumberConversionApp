package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HexatoDec extends AppCompatActivity {

    private EditText input;
    private TextView answer;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexato_dec);

        input = findViewById(R.id.input);
        answer = findViewById(R.id.answer);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n6 = String.valueOf(input.getText());
                answer.setText(String.valueOf(hexToDec(n6)));


            }
        });
    }

    /* method converting Hexadecimal to Decimal */
    public static int hexToDec(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}