package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Constructor;

public class MainActivity extends AppCompatActivity {



    TextView screenDisplay;
    TextView GrossResult;
    EditText Days;
    EditText Rate;
    EditText Hours;
    Button Calculation;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculation = (Button) findViewById(R.id.CalcButton) ;
        screenDisplay = (TextView) findViewById(R.id.ViewWageCalc);
        Days = (EditText) findViewById(R.id.NumofDys_Editxt);
        Rate = (EditText) findViewById(R.id.RateperHr_Editxt);
        Hours = (EditText) findViewById(R.id.NumofHrs_Editxt);
        GrossResult = (TextView) findViewById(R.id.ViewgrossResult);



        Calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Wage salary = new Wage(Rate, Days, Hours);
                double calculateWage = salary.calculateWage();
                GrossResult.setText(String.valueOf(calculateWage));
            }
        });
    }
}