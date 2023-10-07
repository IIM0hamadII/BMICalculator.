package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etWeight,etHeight;
    Button btnCalculate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      connectComponent();
    }

    private void connectComponent() {
       etWeight=findViewById(R.id.etWeightMain) ;
       etHeight=findViewById(R.id.etHeightMain);
       btnCalculate=findViewById(R.id.btnCalculateMain);
    }


    public void calculate(View view) {
        String weight =etWeight.getText().toString();
        String height= etHeight.getText().toString();
        double w,h,bmi ;
        w = Double.parseDouble(weight);
        h = Double.parseDouble(height);
        bmi = w / (h * h);
        Toast.makeText(this, "your bmi is :" + bmi, Toast.LENGTH_LONG).show();
        if(!weight.isEmpty() || TextUtils.isDigitsOnly(weight) || !weight.isEmpty() || TextUtils.isDigitsOnly(weight))
            Toast.makeText(this, "Check data you entered !", Toast.LENGTH_LONG).show();
        return;

      }
    }
