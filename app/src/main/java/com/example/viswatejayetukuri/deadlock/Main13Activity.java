package com.example.viswatejayetukuri.deadlock;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }
    public void Video1(View view)
    {

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=rWFH6PLOIEI"));
        startActivity(i);

    }
    public void Video2(View view)
    {

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=g6MnLrmeWOI"));
        startActivity(i);

    }

    public void Video3(View view)
    {

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2V2FfP_olaA"));
        startActivity(i);

    }

    public void Video4(View view)
    {

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=GyCP3XIXjXs"));
        startActivity(i);

    }
}
