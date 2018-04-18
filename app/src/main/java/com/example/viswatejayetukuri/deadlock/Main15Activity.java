package com.example.viswatejayetukuri.deadlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
    }
    public void Function2(View view)
    {
        EditText ed21 = (EditText)findViewById(R.id.editText21);
        EditText ed22 = (EditText)findViewById(R.id.editText22);
        EditText ed23 = (EditText)findViewById(R.id.editText23);
        EditText ed24 = (EditText)findViewById(R.id.editText24);
        EditText ed25 = (EditText)findViewById(R.id.editText25);
        EditText ed26 = (EditText)findViewById(R.id.editText26);
        EditText ed27 = (EditText)findViewById(R.id.editText27);
        EditText ed28 = (EditText)findViewById(R.id.editText28);
        EditText ed29 = (EditText)findViewById(R.id.editText29);
        EditText ed30 = (EditText)findViewById(R.id.editText30);
        EditText ed31 = (EditText)findViewById(R.id.editText31);
        EditText ed32 = (EditText)findViewById(R.id.editText32);
        EditText ed33 = (EditText)findViewById(R.id.editText33);
        EditText ed34 = (EditText)findViewById(R.id.editText34);
        EditText ed35 = (EditText)findViewById(R.id.editText35);
        EditText ed36 = (EditText)findViewById(R.id.editText36);
        EditText ed37 = (EditText)findViewById(R.id.editText37);
        EditText ed38 = (EditText)findViewById(R.id.editText38);


        Intent intent= getIntent();
        String ans1 = intent.getStringExtra("result1");
        String ans2 = intent.getStringExtra("result2");
        String ans3 = intent.getStringExtra("result3");
        String ans4 = intent.getStringExtra("result4");
        String ans5 = intent.getStringExtra("result5");
        String ans6 = intent.getStringExtra("result6");
        String ans7 = intent.getStringExtra("result7");
        String ans8 = intent.getStringExtra("result8");
        String ans9 = intent.getStringExtra("result9");
        String ans10 = intent.getStringExtra("result10");
        String ans11 = intent.getStringExtra("result11");
        String ans12 = intent.getStringExtra("result12");
        String ans13 = intent.getStringExtra("result13");
        String ans14 = intent.getStringExtra("result14");
        String ans15 = intent.getStringExtra("result15");
        String ans16 = intent.getStringExtra("result16");
        String ans17 = intent.getStringExtra("result17");
        String ans18 = intent.getStringExtra("result18");

        int a1 = Integer.parseInt(ans1);
        int b1 = Integer.parseInt(ans2);
        int c1 = Integer.parseInt(ans3);
        int d1 = Integer.parseInt(ans4);
        int e1 = Integer.parseInt(ans5);
        int f1 = Integer.parseInt(ans6);
        int g1 = Integer.parseInt(ans7);
        int h1 = Integer.parseInt(ans8);
        int i1 = Integer.parseInt(ans9);
        int j1 = Integer.parseInt(ans10);
        int k1 = Integer.parseInt(ans11);
        int l1 = Integer.parseInt(ans12);
        int m1 = Integer.parseInt(ans13);
        int o1 = Integer.parseInt(ans14);
        int p1 = Integer.parseInt(ans15);
        int q1 = Integer.parseInt(ans16);
        int r1 = Integer.parseInt(ans17);
        int s1 = Integer.parseInt(ans18);

        int a = Integer.parseInt(ed21.getText().toString());
        int b = Integer.parseInt(ed22.getText().toString());
        int c = Integer.parseInt(ed23.getText().toString());
        int d = Integer.parseInt(ed24.getText().toString());
        int e = Integer.parseInt(ed25.getText().toString());
        int f = Integer.parseInt(ed26.getText().toString());
        int g = Integer.parseInt(ed27.getText().toString());
        int h = Integer.parseInt(ed28.getText().toString());
        int i = Integer.parseInt(ed29.getText().toString());
        int j = Integer.parseInt(ed30.getText().toString());
        int k = Integer.parseInt(ed31.getText().toString());
        int l = Integer.parseInt(ed32.getText().toString());
        int m = Integer.parseInt(ed33.getText().toString());
        int o = Integer.parseInt(ed34.getText().toString());
        int p = Integer.parseInt(ed35.getText().toString());
        int q = Integer.parseInt(ed36.getText().toString());
        int r = Integer.parseInt(ed37.getText().toString());
        int s = Integer.parseInt(ed38.getText().toString());

        int[][] max = new int[][]{
                {a1,b1,c1},
                {d1,e1,f1},
                {g1,h1,i1},
                {j1,k1,l1},
                {m1,o1,p1}
        };
        int[][] alc = new int[][]{
                {a,b,c},
                {d,e,f},
                {g,h,i},
                {j,k,l},
                {m,o,p}
        };
        int[] avl = new int[]{q,r,s};
        int[] req = new int[]{q1,r1,s1};
        int[][] need = new int[5][3];
        int[] ans = new int[5];
        int z=0;
        for(int x=0; x<5; x++)
        {
            for(int y=0; y<3; y++)
            {
                need[x][y] = max[x][y] - alc[x][y];
            }
        }
        int flag=1;
        for(int y=0; y<3; y++)
        {
            if(need[1][y] < req[y])
            {
                flag = 0;
            }
            if(avl[y] < req[y])
            {
                flag = 0;
            }
        }
        if(flag==0)
        {
            Toast.makeText(Main15Activity.this, " request can not granted", Toast.LENGTH_LONG).show();
        }
        else {
            for(int y=0; y<3; y++)
            {
                avl[y] = avl[y]-req[y];
                need[1][y] = need[1][y]-req[y];
                alc[1][y]= alc[1][y]+req[y];
            }
            int[] process = new int[]{1, 2, 3, 4, 5};
            int count = 0, num1 = 0;
            int[] temp = new int[]{0, 0, 0, 0, 0};
            while (count != 5) {

                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (need[x][y] <= avl[y]) {
                            num1++;
                        }
                    }

                    if (num1 == 3 && temp[x] == 0) {
                        temp[x] = 1;
                        ans[z++] = process[x];
                        for (int y = 0; y < 3; y++) {
                            avl[y] = avl[y] + alc[x][y];
                        }
                        count++;
                    }
                    num1 = 0;
                }
            }

            String mee1 = String.valueOf(ans[0]);
            String mee2 = String.valueOf(ans[1]);
            String mee3 = String.valueOf(ans[2]);
            String mee4 = String.valueOf(ans[3]);
            String mee5 = String.valueOf(ans[4]);

            intent = new Intent(this, Main16Activity.class);
            intent.putExtra("meena1", mee1);
            intent.putExtra("meena2", mee2);
            intent.putExtra("meena3", mee3);
            intent.putExtra("meena4", mee4);
            intent.putExtra("meena5", mee5);

            startActivity(intent);


        }
    }
}
