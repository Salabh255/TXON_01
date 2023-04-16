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

public class length extends AppCompatActivity {
Button convertBtn, backBtn;
EditText e1,e2;
Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        convertBtn= findViewById(R.id.convertBtn);
        backBtn = findViewById(R.id.backBtn);
        e1 = findViewById(R.id.edtText1);
        sp1 = findViewById(R.id.spinner1);
        sp2 = findViewById(R.id.spinner2);
        e2 = findViewById(R.id.edtText2);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(length.this,MainActivity2.class));
            }
        });

        String[] from= {"METER","KILOMETER","CENTIMETER","MILLIMETER"};
        ArrayAdapter ad1= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String[] to={"KILOMETER","METER","CENTIMETER","MILLIMETER"};
        ArrayAdapter ad2= new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double ans;
                Double value=Double.parseDouble(e1.getText().toString());

                if(sp1.getSelectedItem().toString()=="METER"&&sp2.getSelectedItem().toString()=="METER"){

                    ans=value;

                    e2.setText(ans.toString()+" m");
                }
                if(sp1.getSelectedItem().toString()=="METER"&&sp2.getSelectedItem().toString()=="KILOMETER"){
                    ans=value/1000;

                    e2.setText(ans.toString()+" km");
                }
                if(sp1.getSelectedItem().toString()=="METER"&&sp2.getSelectedItem().toString()=="CENTIMETER"){
                    ans=value*100;

                    e2.setText(ans.toString()+" cm");
                }
                if(sp1.getSelectedItem().toString()=="METER"&&sp2.getSelectedItem().toString()=="MILLIMETER"){
                    ans=value*1000;

                    e2.setText(ans.toString()+" mm");
                }
                if(sp1.getSelectedItem().toString()=="KILOMETER"&&sp2.getSelectedItem().toString()=="METER"){
                    ans=value*1000;

                    e2.setText(ans.toString()+" m");
                }
                if(sp1.getSelectedItem().toString()=="KILOMETER"&&sp2.getSelectedItem().toString()=="KILOMETER"){
                    ans=value;

                    e2.setText(ans.toString()+" km");
                }
                if(sp1.getSelectedItem().toString()=="KILOMETER"&&sp2.getSelectedItem().toString()=="CENTIMETER"){
                    ans=value*100000;

                    e2.setText(ans.toString()+" cm");
                }
                if(sp1.getSelectedItem().toString()=="KILOMETER"&&sp2.getSelectedItem().toString()=="MILLIMETER"){
                    ans=value*1000000;

                    e2.setText(ans.toString()+" mm");
                }
                if(sp1.getSelectedItem().toString()=="CENTIMETER"&&sp2.getSelectedItem().toString()=="METER"){
                    ans=value/100;

                    e2.setText(ans.toString()+" m");
                }
                if(sp1.getSelectedItem().toString()=="CENTIMETER"&&sp2.getSelectedItem().toString()=="CENTIMETER"){
                    ans=value;

                    e2.setText(ans.toString()+" cm");
                }
                if(sp1.getSelectedItem().toString()=="CENTIMETER"&&sp2.getSelectedItem().toString()=="KILOMETER"){
                    ans=value/100000;

                    e2.setText(ans.toString()+" km");
                }
                if(sp1.getSelectedItem().toString()=="CENTIMETER"&&sp2.getSelectedItem().toString()=="MILLIMETER"){
                    ans=value*10;

                    e2.setText(ans.toString()+" mm");
                }
                if(sp1.getSelectedItem().toString()=="MILLIIMETER"&&sp2.getSelectedItem().toString()=="MILLIMETER"){
                    ans=value;

                    e2.setText(ans.toString()+" mm");
                }
                if(sp1.getSelectedItem().toString()=="MILLIIMETER"&&sp2.getSelectedItem().toString()=="CENTIMETER"){
                    ans=value/10;

                    e2.setText(ans.toString()+" cm");
                }
                if(sp1.getSelectedItem().toString()=="MILLIIMETER"&&sp2.getSelectedItem().toString()=="METER"){
                    ans=value/1000;

                    e2.setText(ans.toString()+" m");
                }
                if(sp1.getSelectedItem().toString()=="MILLIIMETER"&&sp2.getSelectedItem().toString()=="KILOMETER"){
                    ans=value/1000000;

                    e2.setText(ans.toString()+" km");
                }
            }
        });

    }
}