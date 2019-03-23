package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 21-03-2019.
 */

public class Console_taylors extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll = (LinearLayout) findViewById(R.id.mll);
        ok = (Button) findViewById(R.id.ok);

        TextView t1=new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter the value of x in degrees:");
        t1.setTextSize(18);
        mll.addView(t1);

        et1=new EditText(this);
        et1.setTextColor(getColor(R.color.white));
        et1.setSelectAllOnFocus(true);
        et1.requestFocus();
        mll.addView(et1);

        ok.setOnClickListener(new View.OnClickListener() {

            int factorial(int m)
            {
                if (m==0 || m==1)
                    return (1);
                else
                    return (m*factorial(m-1));
            }

            @Override
            public void onClick(View v) {
                double x,y;
                y=Double.parseDouble(et1.getText().toString());

                x=y * Math.PI / 180;

                int n;
                double val=0;
                for (n=0;n<8;n++)
                {
                    double p = Math.pow(-1,n);
                    double px = Math.pow(x,2*n+1);
                    int fac = factorial(2*n+1);
                    val += p * px / fac;
                }

                TextView t2=new TextView(Console_taylors.this);
                t2.setTextColor(getColor(R.color.white));
                t2.setText("Value of sine of "+y+" is:"+val);
                t2.setTextSize(18);
                mll.addView(t2);
                System.out.println();

                TextView t3=new TextView(Console_taylors.this);
                t3.setTextColor(getColor(R.color.white));
                t3.setText("Value of sine of "+y+" from library function is:"+(Math.sin(x)));
                t3.setTextSize(18);
                mll.addView(t3);
            }
        });
    }
}
