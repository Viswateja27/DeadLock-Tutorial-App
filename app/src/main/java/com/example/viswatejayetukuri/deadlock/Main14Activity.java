package com.example.viswatejayetukuri.deadlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
    }
    public void Function1(View view)
    {
        EditText ed1 = (EditText)findViewById(R.id.editText);
        EditText ed2 = (EditText)findViewById(R.id.editText2);
        EditText ed3 = (EditText)findViewById(R.id.editText3);
        EditText ed4 = (EditText)findViewById(R.id.editText4);
        EditText ed5 = (EditText)findViewById(R.id.editText5);
        EditText ed6 = (EditText)findViewById(R.id.editText6);
        EditText ed7 = (EditText)findViewById(R.id.editText7);
        EditText ed8 = (EditText)findViewById(R.id.editText8);
        EditText ed9 = (EditText)findViewById(R.id.editText9);
        EditText ed10 = (EditText)findViewById(R.id.editText10);
        EditText ed11 = (EditText)findViewById(R.id.editText11);
        EditText ed12 = (EditText)findViewById(R.id.editText12);
        EditText ed13 = (EditText)findViewById(R.id.editText13);
        EditText ed14 = (EditText)findViewById(R.id.editText14);
        EditText ed15 = (EditText)findViewById(R.id.editText15);
        EditText ede1 = (EditText)findViewById(R.id.editText16);
        EditText ede2 = (EditText)findViewById(R.id.editText17);
        EditText ede3 = (EditText)findViewById(R.id.editText18);

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15;
        int nu1, nu2, nu3;

        n1 = Integer.parseInt(ed1.getText().toString());
        n2 = Integer.parseInt(ed2.getText().toString());
        n3 = Integer.parseInt(ed3.getText().toString());
        n4 = Integer.parseInt(ed4.getText().toString());
        n5 = Integer.parseInt(ed5.getText().toString());
        n6 = Integer.parseInt(ed6.getText().toString());
        n7 = Integer.parseInt(ed7.getText().toString());
        n8 = Integer.parseInt(ed8.getText().toString());
        n9 = Integer.parseInt(ed9.getText().toString());
        n10 = Integer.parseInt(ed10.getText().toString());
        n11 = Integer.parseInt(ed11.getText().toString());
        n12 = Integer.parseInt(ed12.getText().toString());
        n13 = Integer.parseInt(ed13.getText().toString());
        n14 = Integer.parseInt(ed14.getText().toString());
        n15 = Integer.parseInt(ed15.getText().toString());
        nu1 = Integer.parseInt(ede1.getText().toString());
        nu2 = Integer.parseInt(ede2.getText().toString());
        nu3 = Integer.parseInt(ede3.getText().toString());

        String res1 = String.valueOf(n1);
        String res2 = String.valueOf(n2);
        String res3 = String.valueOf(n3);
        String res4 = String.valueOf(n4);
        String res5 = String.valueOf(n5);
        String res6 = String.valueOf(n6);
        String res7 = String.valueOf(n7);
        String res8 = String.valueOf(n8);
        String res9 = String.valueOf(n9);
        String res10 = String.valueOf(n10);
        String res11 = String.valueOf(n11);
        String res12 = String.valueOf(n12);
        String res13 = String.valueOf(n13);
        String res14 = String.valueOf(n14);
        String res15 = String.valueOf(n15);
        String res16 = String.valueOf(nu1);
        String res17 = String.valueOf(nu2);
        String res18 = String.valueOf(nu3);

        Intent intent = new Intent(this, Main15Activity.class);
        intent.putExtra("result1", res1);
        intent.putExtra("result2", res2);
        intent.putExtra("result3", res3);
        intent.putExtra("result4", res4);
        intent.putExtra("result5", res5);
        intent.putExtra("result6", res6);
        intent.putExtra("result7", res7);
        intent.putExtra("result8", res8);
        intent.putExtra("result9", res9);
        intent.putExtra("result10", res10);
        intent.putExtra("result11", res11);
        intent.putExtra("result12", res12);
        intent.putExtra("result13", res13);
        intent.putExtra("result14", res14);
        intent.putExtra("result15", res15);
        intent.putExtra("result16", res16);
        intent.putExtra("result17", res17);
        intent.putExtra("result18", res18);

        startActivity(intent);






    }
}
