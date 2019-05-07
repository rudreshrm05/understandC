package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 31-03-2019.
 */

public class Console_rf extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1, et2;
    int n=0, flag=0, x=0, on=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll=(LinearLayout)findViewById(R.id.mll);
        ok=(Button)findViewById(R.id.ok);

        TextView t1=new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter the number");
        t1.setTextSize(18);
        mll.addView(t1);

        et1=new EditText(this);
        et1.setTextColor(getColor(R.color.white));
        et1.setSelectAllOnFocus(true);
        et1.requestFocus();
        mll.addView(et1);

        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                n = Integer.parseInt(et1.getText().toString());
                on=n;

                if(flag==0){
                    TextView t2=new TextView(Console_rf.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("Enter the number of steps to be shifted");
                    t2.setTextSize(18);
                    mll.addView(t2);
                    flag=1;

                    et2=new EditText(Console_rf.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    mll.addView(et2);
                }
                else{
                    x = Integer.parseInt(et2.getText().toString());

                    n=n>>x;

                    TextView t2=new TextView(Console_rf.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("The value of "+on+" after shifting "+x+" time is: "+n);
                    t2.setTextSize(18);
                    mll.addView(t2);
                    flag=1;
                }
            }
        });
    }
}
