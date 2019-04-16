package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText tex1,tex2,tex3;
    private TextView bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BMI(View view){

        double a;
        String b;
        tex1 = findViewById(R.id.editText1);
        tex2 = findViewById(R.id.editText2);
        tex3 = findViewById(R.id.editText3);
        bmi = findViewById(R.id.textView);
        int j = 0;

        a = Double.parseDouble(tex1.getText().toString())/Math.pow(Double.parseDouble(tex2.getText().toString()),2);
        b = Double.toString(a);


        bmi.setText(b);





    }

}
