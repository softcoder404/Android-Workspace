package com.example.idtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    TextView tvResult;
    EditText etNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean onDebug = true;
        //bind view component with defined variables
        btnSubmit = findViewById(R.id.btnSub);
        tvResult = findViewById(R.id.tvRes);
        etNumber = findViewById(R.id.etNum);
        tvResult.setVisibility(View.GONE); //hide result

        //allow only number input and disable other key input and also make sure number doesn't exceed 13 digits
        etNumber.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if ((keyEvent.getNumber() > 47 && keyEvent.getNumber() < 58 && etNumber.getText().toString().trim().length() < 13) || i == 67)
                    return false;
                else return true;
            }
        });

        //check if submit button is pressed and if number is a 13 digit number
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNumber.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your ID number", Toast.LENGTH_SHORT).show();
                } else {
                    //check if number is not valid
                    if (etNumber.getText().toString().trim().length() != 13) {
                        Toast.makeText(MainActivity.this, "Invalid ID, Please enter 13 digits number", Toast.LENGTH_LONG).show();
                    } else {
                        String dob = etNumber.getText().toString().trim().substring(0, 6);
                        String nDob = "";
                        //reformat dob
                        for (int i = 0; i < dob.length(); i += 1) {
                            nDob += dob.charAt(i);
                            if (i == 1 || i == 3) nDob += '-';
                        }

                        String gender = Integer.parseInt(Character.toString(etNumber.getText().toString().charAt(6))) >= 5 ? "Male" : "Female";
                        String citizenship = Integer.parseInt(Character.toString(etNumber.getText().toString().charAt(10))) == 1 ? "Permanent Resident" : "SA Citizen";

                        //display the result
                        String result = "Date of Birth : " + nDob + "\n" + "Gender : " + gender + "\n" + "Citizenship : " + citizenship;
                        tvResult.setText(result);
                        tvResult.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

    }
}