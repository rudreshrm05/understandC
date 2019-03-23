package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 20-03-2019.
 */

public class Console_horners extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1, et4;
    float a[]=new float[100], sum;
    int flag=0, etid=1,n,x, flag1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll = (LinearLayout) findViewById(R.id.mll);
        ok = (Button) findViewById(R.id.ok);

        TextView t1 = new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter the degree of the polynomial:");
        t1.setTextSize(18);
        mll.addView(t1);

        et1 = new EditText(this);
        et1.setTextColor(getColor(R.color.white));
        et1.setSelectAllOnFocus(true);
        et1.requestFocus();
        mll.addView(et1);

        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                flag++;
                if (flag == 1) {
                    n = Integer.parseInt(et1.getText().toString());
                    TextView t2 = new TextView(Console_horners.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("Enter the coefficients");
                    t2.setTextSize(18);
                    mll.addView(t2);

                    EditText et3 = new EditText(Console_horners.this);
                    et3.setTextColor(getColor(R.color.white));
                    et3.setTag("detid" + etid);
                    et3.setSelectAllOnFocus(true);
                    et3.requestFocus();
                    etid++;
                    mll.addView(et3);
                }
                else if (flag > 1 && flag <=(n+1)) {
                    EditText et2 = new EditText(Console_horners.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setTag("detid" + etid);
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    etid++;
                    mll.addView(et2);

                }
                else if (flag >(n+1)) {

                    if(flag1==0) {
                        TextView t3 = new TextView(Console_horners.this);
                        t3.setTextColor(getColor(R.color.white));
                        t3.setText("Enter the value of x");
                        t3.setTextSize(18);
                        mll.addView(t3);

                        et4 = new EditText(Console_horners.this);
                        et4.setTextColor(getColor(R.color.white));
                        et4.setSelectAllOnFocus(true);
                        et4.requestFocus();
                        mll.addView(et4);
                        flag1=1;
                    }
                    else {

                        x = Integer.parseInt(et4.getText().toString());


                        int j = 1;
                        for (int i = 0; i < n; i++) {
                            a[i] = Integer.parseInt(((EditText) mll.findViewWithTag("detid" + j)).getText().toString());
                            j++;
                        }
                        for (int i = n; i > 0; i--) {
                            sum = (sum + a[i]) * x;
                        }
                        sum = sum + a[0];
                        TextView t4 = new TextView(Console_horners.this);
                        t4.setTextColor(getColor(R.color.white));
                        t4.setText("Value of the polynomial is =" + sum);
                        t4.setTextSize(18);
                        mll.addView(t4);
                    }
                }
            }
        });


    }
}
