package com.android.understandc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pgm1,pgm2,pgm3,pgm4,pgm5,pgm6,pgm7,pgm8,pgm9,pgm10,pgm11,pgm12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pgm1=(Button)findViewById(R.id.pgm1);
        pgm2=(Button)findViewById(R.id.pgm2);
        pgm3=(Button)findViewById(R.id.pgm3);
        pgm4=(Button)findViewById(R.id.pgm4);
        pgm5=(Button)findViewById(R.id.pgm5);
        pgm6=(Button)findViewById(R.id.pgm6);
        pgm7=(Button)findViewById(R.id.pgm7);
        pgm8=(Button)findViewById(R.id.pgm8);
        pgm9=(Button)findViewById(R.id.pgm9);
        pgm10=(Button)findViewById(R.id.pgm10);
        pgm11=(Button)findViewById(R.id.pgm11);
        pgm12=(Button)findViewById(R.id.pgm12);

        pgm1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P1");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this, Display_program.class);
            Bundle bundle = new Bundle();
            bundle.putString("pgm", "P2");
            intent.putExtras(bundle);
            startActivity(intent);
        }
        });

        pgm3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P3");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P4");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P5");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P6");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P7");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P8");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P9");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P10");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P11");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        pgm12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Display_program.class);
                Bundle bundle = new Bundle();
                bundle.putString("pgm", "P12");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}

