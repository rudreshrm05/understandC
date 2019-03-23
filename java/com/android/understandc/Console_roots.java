package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 06-02-2019.
 */

public class Console_roots extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1,et2,et3;
    int flag=0;
    double a=0,b=0,c=0,discriminant=0;
    double root1=0,root2=0,real=0,imaginary=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll = (LinearLayout) findViewById(R.id.mll);
        ok = (Button) findViewById(R.id.ok);

        TextView t1 = new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("enter the values for co-efficient a,b and c");
        t1.setTextSize(18);
        mll.addView(t1);

        et1 = new EditText(this);
        et1.setTextColor(getColor(R.color.white));
        et1.setSelectAllOnFocus(true);
        et1.requestFocus();
        mll.addView(et1);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                if(flag==1){
                    a= Double.parseDouble(et1.getText().toString());
                    et2 = new EditText(Console_roots.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    mll.addView(et2);
                }
                else if(flag==2){
                    b= Double.parseDouble(et2.getText().toString());
                    et3 = new EditText(Console_roots.this);
                    et3.setTextColor(getColor(R.color.white));
                    et3.setSelectAllOnFocus(true);
                    et3.requestFocus();
                    mll.addView(et3);
                }
                if(flag>2){
                    c= Double.parseDouble(et1.getText().toString());

                    if((a==0)&&(b==0))
                    {
                        TextView t2 = new TextView(Console_roots.this);
                        t2.setTextColor(getColor(R.color.white));
                        t2.setText("Invalid, coefficients cannot be zero");
                        t2.setTextSize(18);
                        mll.addView(t2);
                    }
                    else if(a==0)
                    {
                        TextView t3 = new TextView(Console_roots.this);
                        t3.setTextColor(getColor(R.color.white));
                        t3.setText("linear equation");
                        t3.setTextSize(18);
                        mll.addView(t3);

                        root1=-c/b;

                        TextView t4 = new TextView(Console_roots.this);
                        t4.setTextColor(getColor(R.color.white));
                        t4.setText("Root="+root1);
                        t4.setTextSize(18);
                        mll.addView(t4);
                    }
                    else
                    {
                        discriminant=b*b-4*a*c;
                        if(discriminant==0)
                        {
                            TextView t5 = new TextView(Console_roots.this);
                            t5.setTextColor(getColor(R.color.white));
                            t5.setText("The roots are real and equal");
                            t5.setTextSize(18);
                            mll.addView(t5);

                            root1=root2=-b/(2*a);

                            TextView t6 = new TextView(Console_roots.this);
                            t6.setTextColor(getColor(R.color.white));
                            t6.setText("Root1="+root1+"\n"+"Root2="+root2);
                            t6.setTextSize(18);
                            mll.addView(t6);
                        }
                        else if(discriminant>0)
                        {
                            TextView t7 = new TextView(Console_roots.this);
                            t7.setTextColor(getColor(R.color.white));
                            t7.setText("The roots are real and Distinct");
                            t7.setTextSize(18);
                            mll.addView(t7);

                            root1=(-b+Math.sqrt(discriminant))/(2*a);
                            root1=(-b-Math.sqrt(discriminant))/(2*a);

                            TextView t8 = new TextView(Console_roots.this);
                            t8.setTextColor(getColor(R.color.white));
                            t8.setText("Root1="+root1+"\n"+"Root2="+root2);
                            t8.setTextSize(18);
                            mll.addView(t8);
                        }
                        else
                        {
                            TextView t9 = new TextView(Console_roots.this);
                            t9.setTextColor(getColor(R.color.white));
                            t9.setText("The roots are real and imaginary");
                            t9.setTextSize(18);
                            mll.addView(t9);

                            real=-b/(2*a);
                            imaginary=Math.sqrt(Math.abs(discriminant))/(2*a);

                            TextView t10 = new TextView(Console_roots.this);
                            t10.setTextColor(getColor(R.color.white));
                            t10.setText("Root1="+real+"+i"+imaginary);
                            t10.setTextSize(18);
                            mll.addView(t10);

                            TextView t11 = new TextView(Console_roots.this);
                            t11.setTextColor(getColor(R.color.white));
                            t11.setText("Root1="+real+"-i"+imaginary);
                            t11.setTextSize(18);
                            mll.addView(t11);
                        }
                    }
                }

            }
        });
    }
}
