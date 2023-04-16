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

public class weight extends AppCompatActivity {
    Button convertBtn, backBtn;
    EditText e1,e2;
    Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        convertBtn= findViewById(R.id.convertBtn);
        backBtn = findViewById(R.id.backBtn);
        e1 = findViewById(R.id.edtText1);
        sp1 = findViewById(R.id.spinner1);
        sp2 = findViewById(R.id.spinner2);
        e2 = findViewById(R.id.edtText2);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(weight.this,MainActivity2.class));
            }
        });

        String[] from= {"GRAM","KILOGRAM","MILLIGRAM"};
        ArrayAdapter ad1= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String[] To= {"KILOGRAM","GRAM","MILLIGRAM"};
        ArrayAdapter ad2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,To);
        sp2.setAdapter(ad2);


        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double ans;
                Double val=Double.parseDouble(e1.getText().toString());
                if(sp1.getSelectedItem().toString()=="GRAM" && sp2.getSelectedItem().toString()=="GRAM"){
                    ans=val;
                    e2.setText(ans.toString()+" g");
                }
                if(sp1.getSelectedItem().toString()=="GRAM" && sp2.getSelectedItem().toString()=="KILOGRAM"){
                    ans=val/1000;
                    e2.setText(ans.toString()+" kg");
                }
                if(sp1.getSelectedItem().toString()=="GRAM" && sp2.getSelectedItem().toString()=="MILLIGRAM"){
                    ans=val*1000;
                    e2.setText(ans.toString()+" mg");
                }

                if(sp1.getSelectedItem().toString()=="KILOGRAM" && sp2.getSelectedItem().toString()=="GRAM"){
                    ans=val*1000;
                    e2.setText(ans.toString()+" g");
                }
                if(sp1.getSelectedItem().toString()=="KILOGRAM" && sp2.getSelectedItem().toString()=="KILOGRAM"){
                    ans=val;
                    e2.setText(ans.toString()+" kg");
                }
                if(sp1.getSelectedItem().toString()=="KILOGRAM" && sp2.getSelectedItem().toString()=="MILLIGRAM"){
                    ans=val*1000000;
                    e2.setText(ans.toString()+" mg");
                }
                if(sp1.getSelectedItem().toString()=="MILLIGRAM" && sp2.getSelectedItem().toString()=="GRAM"){
                    ans=val/1000;
                    e2.setText(ans.toString()+" g");
                }
                if(sp1.getSelectedItem().toString()=="MILLIGRAM" && sp2.getSelectedItem().toString()=="MILLIGRAM"){
                    ans=val;
                    e2.setText(ans.toString()+" mg");
                }
                if(sp1.getSelectedItem().toString()=="MILLIGRAM" && sp2.getSelectedItem().toString()=="KILOGRAM"){
                    ans=val/1000000;
                    e2.setText(ans.toString()+" kg");
                }
            }
        });

    }
}