package com.example.temperaturecricketcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare working variables and bind with view components
    Button btnTemp;
    TextView tvRes;
    EditText etTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind variables
        btnTemp = findViewById(R.id.btnTemp);
        tvRes = findViewById(R.id.tvRes);
        etTemp = findViewById(R.id.etNumber);
        tvRes.setVisibility(View.GONE);
        //listen to submit button on click event
        btnTemp.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                char x = keyEvent.getNumber();
                if((x > 47 && x < 58 ) || i == 67) return false;
                else return true;
            }
        });
       btnTemp.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            double tempVal = Integer.parseInt(etTemp.getText().toString()) * 1.0;
            double calResult = ( tempVal / 3.0) + 4.0;
            String calRes = String.format("%.2f",calResult);
            String resText = "The approximate temperature outside is " + calRes + " degrees Celsius.";
            tvRes.setText(resText);
            tvRes.setVisibility(View.VISIBLE);
           }
       });
    }
}