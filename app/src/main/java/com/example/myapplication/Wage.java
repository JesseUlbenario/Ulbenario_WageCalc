package com.example.myapplication;

import android.provider.Telephony;
import android.widget.EditText;

public class Wage {

    EditText Hours;
    EditText Rate;
    EditText Days;


    Wage(EditText Rate,EditText Hours,EditText Days){
        this.Rate = Rate;
        this.Hours = Hours;
        this.Days = Days;
    }

    public double calculateWage() {
       double RateValue = Double.parseDouble(Rate.getText().toString());
       double DaysValue = Double.parseDouble(Days.getText().toString());
       double HoursValue = Double.parseDouble(Hours.getText().toString());

        return RateValue * DaysValue * HoursValue;
    }

}
