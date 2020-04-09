package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton(View view) {

        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);
        String amountinstring = amountEditText.getText().toString();

        Double amountindouble = Double.parseDouble(amountinstring);

        Double result = amountindouble * 1.3;

        String resultinstring = Double.toString(result);

        String resultin_2 = String.format("%.2f", resultinstring);

        Toast.makeText(this, resultin_2, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
