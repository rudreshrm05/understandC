package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 25-03-2019.
 */

public class Console_ncr extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1, et2;
    int n, r, flag=0, ncr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll = (LinearLayout) findViewById(R.id.mll);
        ok = (Button) findViewById(R.id.ok);

        TextView t1 = new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter n:");
        t1.setTextSize(18);
        mll.addView(t1);

        et1 = new EditText(this);
        et1.setTextColor(getColor(R.color.white));
        et1.setSelectAllOnFocus(true);
        et1.requestFocus();
        mll.addView(et1);

        ok.setOnClickListener(new View.OnClickListener() {

            int fact(int n)
            {
                if (n >= 1)
                    return n*fact(n-1);
                else
                    return 1;
            }

            @Override
            public void onClick(View v) {
                n=Integer.parseInt(et1.getText().toString());

                if(flag==0) {
                    TextView t2 = new TextView(Console_ncr.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("Enter n:");
                    t2.setTextSize(18);
                    mll.addView(t2);

                    et2 = new EditText(Console_ncr.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    mll.addView(et2);
                    flag=1;
                }
                else{
                    r=Integer.parseInt(et1.getText().toString());

                    ncr=fact(n)/(fact(r)*fact(n-r));

                    TextView t3 = new TextView(Console_ncr.this);
                    t3.setTextColor(getColor(R.color.white));
                    t3.setText("Value of "+n+"C"+r+"="+ncr);
                    t3.setTextSize(18);
                    mll.addView(t3);
                }
            }
        });
    }
}
