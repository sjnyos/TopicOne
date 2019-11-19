package com.machamasisuraj.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstno,etSecno;
    private RadioGroup rdogrp;
    private RadioButton  rdoadd, rdosubstract,rdomultiply;
    private Button btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstno = findViewById(R.id.etFirstno);
        etSecno = findViewById(R.id.etSecno);
        rdogrp =findViewById(R.id.rdogrp);
        rdoadd = findViewById(R.id.rdoadd);
        rdosubstract=findViewById(R.id.rdosubstract);
        rdomultiply=findViewById(R.id.rdomultiply);
        btnResult=findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdoadd.isChecked()){
                    Toast.makeText(MainActivity.this,"Add  radio Button",Toast.LENGTH_LONG).show();
                }
                else if(rdosubstract.isChecked()){
                    Toast.makeText(MainActivity.this,"Substract  radio Button",Toast.LENGTH_LONG).show();

                }
                else if(rdomultiply.isChecked()){
                    Toast.makeText(MainActivity.this,"Multiply  radio Button",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
