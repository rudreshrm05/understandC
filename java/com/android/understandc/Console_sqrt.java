package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 26-03-2019.
 */

public class Console_sqrt extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll = (LinearLayout) findViewById(R.id.mll);
        ok = (Button) findViewById(R.id.ok);

        TextView t1 = new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter the number");
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
                int n = Integer.parseInt(et1.getText().toString());
                float temp,sqt;

                sqt=n/2;
                temp=0;

                while(sqt!=temp)
                {
                    temp=sqt;
                    sqt=(n/temp+temp)/2;
                }
                TextView t2 = new TextView(Console_sqrt.this);
                t2.setTextColor(getColor(R.color.white));
                t2.setText("the square root of "+n+" is "+sqt);
                t2.setTextSize(18);
                mll.addView(t2);
            }
        });
    }
}
