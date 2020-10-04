package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view){
        Log.i("info","Button Pressed");
        EditText editText=(EditText) findViewById(R.id.edNum);
        String amountInPounds=editText.getText().toString();
        double amountInPoundsDouble=Double.parseDouble(amountInPounds);
        double amountInDollerDouble=amountInPoundsDouble*1.3;
        String amountInDollerString=String.format("%.2f",amountInDollerDouble);
        Toast.makeText(this,"#"+amountInPounds+"is $"+ amountInDollerString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}