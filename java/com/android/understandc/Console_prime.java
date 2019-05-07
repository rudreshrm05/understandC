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

public class Console_prime extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1;
    int n=0, flag=0;

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

                for(int i = 2; i <= n/2; ++i)
                {
                    if(n%i == 0)
                    {
                        flag=1;
                        break;
                    }
                }

                if(flag==0){
                    TextView t1=new TextView(Console_prime.this);
                    t1.setTextColor(getColor(R.color.white));
                    t1.setText("A prime number");
                    t1.setTextSize(18);
                    mll.addView(t1);
                }
                else{
                    TextView t1=new TextView(Console_prime.this);
                    t1.setTextColor(getColor(R.color.white));
                    t1.setText("Not a prime number");
                    t1.setTextSize(18);
                    mll.addView(t1);
                }
            }
        });
    }
}

