package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view){
        EditText edtCurrencyConversion = findViewById(R.id.editAmountToConvert);
        String amountInGBP = edtCurrencyConversion.getText().toString();
        Double amountInGBPDouble =Double.parseDouble(amountInGBP);
        Double amountInUSDDouble = amountInGBPDouble * 1.13;

        Toast.makeText(this, amountInGBP + "in dollars is " + amountInUSDDouble, Toast.LENGTH_SHORT).show();

    }
}