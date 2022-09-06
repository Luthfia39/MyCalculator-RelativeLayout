package com.example.mycalculator_relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input_1;
    EditText input_2;
    Button add;
    Button subtract;
    Button multiple;
    Button divide;

    int data1;
    int data2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_1 = findViewById(R.id.input1);
        input_2 = findViewById(R.id.input2);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.min);
        multiple = findViewById(R.id.multiple);
        divide = findViewById(R.id.divide);
        result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtract();
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiple();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divide();
            }
        });
    }
    private void add() {
        data1 = Integer.parseInt(input_1.getText().toString());
        data2 = Integer.parseInt(input_2.getText().toString());
        int result_add = data1 + data2;
        result.setText(Integer.toString(result_add));
    }
    private void subtract() {
        data1 = Integer.parseInt(input_1.getText().toString());
        data2 = Integer.parseInt(input_2.getText().toString());
        int result_min = data1 - data2;
        result.setText(Integer.toString(result_min));
    }
    private void multiple() {
        data1 = Integer.parseInt(input_1.getText().toString());
        data2 = Integer.parseInt(input_2.getText().toString());
        int result_multiple = data1 * data2;
        result.setText(Integer.toString(result_multiple));
    }
    private void divide() {
        data1 = Integer.parseInt(input_1.getText().toString());
        data2 = Integer.parseInt(input_2.getText().toString());
        int result_divide = data1 / data2;
        result.setText(Integer.toString(result_divide));
    }
}