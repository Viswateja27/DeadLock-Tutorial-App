package com.example.viswatejayetukuri.deadlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        TextView txt1 = (TextView)findViewById(R.id.textView11);
        TextView txt2 = (TextView)findViewById(R.id.textView12);
        TextView txt3 = (TextView)findViewById(R.id.textView13);
        TextView txt4 = (TextView)findViewById(R.id.textView14);
        TextView txt5 = (TextView)findViewById(R.id.textView15);
        Intent intent = getIntent();
        String tee1=  intent.getStringExtra("meena1");
        String tee2 = intent.getStringExtra("meena2");
        String tee3 = intent.getStringExtra("meena3");
        String tee4 = intent.getStringExtra("meena4");
        String tee5 = intent.getStringExtra("meena5");

        txt1.setText(tee1);
        txt2.setText(tee2);
        txt3.setText(tee3);
        txt4.setText(tee4);
        txt5.setText(tee5);
    }
    public void Function9(View view)
    {
        Intent res8 = new Intent(this, Main12Activity.class);
        startActivity(res8);
    }
}

