package com.example.viswatejayetukuri.deadlock;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    public void Send(View view) {
        EditText ed1 = (EditText)findViewById(R.id.editText);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        EditText ed3 = (EditText) findViewById(R.id.editText3);
        EditText ed4 = (EditText) findViewById(R.id.editText4);
        String res = ed2.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{res});
        intent.putExtra(Intent.EXTRA_SUBJECT, ed3.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, "Hello Sir, \n \n"
                + ed4.getText().toString() + " \n \n regards \n "
                + ed1.getText().toString());
        try {
            startActivity(Intent.createChooser(intent, "Choose app to send mail"));

        }catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(this, "no app is found", Toast.LENGTH_LONG).show();
        }
        catch (Exception ex)
        {
            Toast.makeText(this, "unexpected error" +ex.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
