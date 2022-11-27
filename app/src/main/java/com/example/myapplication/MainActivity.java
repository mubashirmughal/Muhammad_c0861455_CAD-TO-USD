package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText CAD, USD;
    private RadioButton USDTOCAD, CADTOUSD;
    TextView result;
    String convert;
    double totalamount, cresult;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CAD = findViewById(R.id.cad);
        USDTOCAD = findViewById(R.id.usdtocad);
        CADTOUSD = findViewById(R.id.cadtousd);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalamount = Double.parseDouble(CAD.getText().toString());

                if (USDTOCAD.isChecked()) {
                    cresult = totalamount * 1.34;
                    result.setText(String.valueOf(cresult));
                } else {
                    cresult = totalamount * 0.75;
                    result.setText(String.valueOf(cresult));
                }

            }
        });


    }


}