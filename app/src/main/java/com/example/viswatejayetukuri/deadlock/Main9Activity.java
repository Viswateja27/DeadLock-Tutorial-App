package com.example.viswatejayetukuri.deadlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void Click(View view)
    {
        Intent in = new Intent(this, Main5Activity.class);
        startActivity(in);
    }
    public void Video(View view)
    {
        Intent in1 = new Intent(this, Main13Activity.class);
        startActivity(in1);
    }
    public void Algorithm(View view)
    {
        Intent in2 = new Intent(this, Main14Activity.class);
        startActivity(in2);
    }
    public void Detection(View view)
    {Intent in3 = new Intent(this, Main17Activity.class);
        startActivity(in3);

    }
}
