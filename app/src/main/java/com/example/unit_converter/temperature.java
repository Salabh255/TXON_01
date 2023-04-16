package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class temperature extends AppCompatActivity {
    Button convertBtn, backBtn;
    EditText e1,e2;
    Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        convertBtn= findViewById(R.id.convertBtn);
        backBtn = findViewById(R.id.backBtn);
        e1 = findViewById(R.id.edtText1);
        sp1 = findViewById(R.id.spinner1);
        sp2 = findViewById(R.id.spinner2);
        e2 = findViewById(R.id.edtText2);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(temperature.this,MainActivity2.class));
            }
        });

        String []from={"CELSIUS","FAHRENHEIT"};
        ArrayAdapter ad1= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String []to={"FAHRENHEIT","CELSIUS"};
        ArrayAdapter ad2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a;
                Double va=Double.parseDouble(e1.getText().toString());

                if(sp1.getSelectedItem().toString()=="CELSIUS" && sp2.getSelectedItem().toString()=="CELSIUS"){
                    a=va;
                    e2.setText(a.toString()+" °C");
                }
                if(sp1.getSelectedItem().toString()=="CELSIUS" && sp2.getSelectedItem().toString()=="FAHRENHEIT"){
                    a=(va*(9/5.0))+32;
                    e2.setText(a.toString()+" °F");
                }
                if(sp1.getSelectedItem().toString()=="FAHRENHEIT" && sp2.getSelectedItem().toString()=="FAHRENHEIT"){
                    a=va;
                    e2.setText(a.toString()+" °F");
                }

                if(sp1.getSelectedItem().toString()=="FAHRENHEIT" && sp2.getSelectedItem().toString()=="CELSIUS"){
                    a=(va-32)*(5/9.0);
                    e2.setText(a.toString()+" °C");
                }
            }
        });

    }
}