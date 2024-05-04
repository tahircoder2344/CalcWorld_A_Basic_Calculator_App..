// Package declaration
package com.example.calcworldabasiccalculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Main Activity class
public class MainActivity extends AppCompatActivity {
    EditText etfirstValue, etsecondValue;
    TextView tvAns;
    Button add, sub, mul, div, resetBtn;

    // OnCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        etfirstValue = findViewById(R.id.edFirstValue);
        etsecondValue = findViewById(R.id.edSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.addBtn);
        sub = findViewById(R.id.minusBtn);
        mul = findViewById(R.id.mulBtn);
        div = findViewById(R.id.divBtn);
        resetBtn = findViewById(R.id.resetBtn);

        // Add button click listener
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get values from input fields
                int firstVal = Integer.parseInt(etfirstValue.getText().toString());
                int secondVal = Integer.parseInt(etsecondValue.getText().toString());
                // Calculate sum
                int ans = firstVal + secondVal;
                // Display answer
                tvAns.setText("Answer is = " + ans);
            }
        });

        // Sub button click listener
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstVal = Integer.parseInt(etfirstValue.getText().toString());
                int secondVal = Integer.parseInt(etsecondValue.getText().toString());
                // Calculate difference
                int ans = firstVal - secondVal;
                // Display answer
                tvAns.setText("Answer is = " + ans);
            }
        });

        // Mul button click listener
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get values from input fields
                int firstVal = Integer.parseInt(etfirstValue.getText().toString());
                int secondVal = Integer.parseInt(etsecondValue.getText().toString());
                // Calculate product
                int ans = firstVal * secondVal;
                // Display answer
                tvAns.setText("Answer is = " + ans);
            }
        });

        // Div button click listener
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get values from input fields
                int firstVal = Integer.parseInt(etfirstValue.getText().toString());
                int secondVal = Integer.parseInt(etsecondValue.getText().toString());
                // Calculate division (note: this may throw an exception if secondVal is 0)
                int ans = secondVal / firstVal;
                // Display answer
                tvAns.setText("Answer is = " + ans);
            }
        });

        // Reset button click listener
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Clear input fields and answer display
                etfirstValue.setText("");
                etsecondValue.setText("");
                tvAns.setText("");
            }
        });
    }
}