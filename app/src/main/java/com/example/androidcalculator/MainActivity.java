package com.example.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnDivide;
    private EditText txtNum1;
    private EditText txtNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDivide =(Button)findViewById(R.id.btnDividir);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 =  (EditText) findViewById(R.id.txtNum2);
    }

    public void onClickDivide(View view){

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        ICalculator iCalculator = new Calculator(num1, num2);
        int result =iCalculator.divide();
        Toast.makeText(getApplicationContext(),
                "The result of add is " + result,
                Toast.LENGTH_LONG).show();
    }
}
