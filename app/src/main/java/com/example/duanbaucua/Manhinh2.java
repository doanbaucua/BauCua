package com.example.duanbaucua;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class Manhinh2 extends AppCompatActivity {
    Button buttonPlay;
    Button button2;

    ArrayList<Integer> mang;

    AnimationDrawable cdXingau1;
    AnimationDrawable cdXingau2;
    AnimationDrawable cdXingau3;
    ImageView xingau1, xingau2, xingau3;

    public void Lacxingau(View v)
    {
        xingau1.setImageResource(R.drawable.hinhdong);


        cdXingau1 = (AnimationDrawable)xingau1.getDrawable();

        cdXingau1.start();



    }
    public void Lacxingau2(View v)
    {
        xingau2.setImageResource(R.drawable.hinhdong);

        cdXingau2 = (AnimationDrawable)xingau2.getDrawable();

        cdXingau2.start();

    }
    public void Lacxingau3(View v)
    {
        xingau3.setImageResource(R.drawable.hinhdong);

        cdXingau3 = (AnimationDrawable)xingau3.getDrawable();

        cdXingau3.start();


    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        Button button2 =  (Button)findViewById(R.id.button2);

        buttonPlay = (Button) findViewById(R.id.buttonPlay);
        xingau1 = (ImageView) findViewById(R.id.xingau1);
        xingau2 = (ImageView) findViewById(R.id.xingau2);
        xingau3 = (ImageView) findViewById(R.id.xingau3);

        mang = new ArrayList<Integer>();
        mang.add(R.drawable.bau);
        mang.add(R.drawable.cua);
        mang.add(R.drawable.tom);
        mang.add(R.drawable.ca);
        mang.add(R.drawable.nai);
        mang.add(R.drawable.ga);


        button2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            cancel(v);
                                         }
                                     }
        );

        buttonPlay. setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int n = r.nextInt(mang.size());
                xingau1.setImageResource(mang.get(n));

                int m = r.nextInt(mang.size());
                xingau2.setImageResource(mang.get(m));

                int k = r.nextInt(mang.size());
                xingau3.setImageResource(mang.get(k));




            }
        });


    }
   public void cancel(View v){
        System.exit(0);
    }
}
