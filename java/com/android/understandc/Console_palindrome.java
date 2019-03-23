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

public class Console_palindrome extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1;
    int n,reversedInteger = 0,remainder=0, originalInteger=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll = (LinearLayout) findViewById(R.id.mll);
        ok = (Button) findViewById(R.id.ok);

        TextView t1=new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter an integer");
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
                et1.setSelectAllOnFocus(false);

                originalInteger = n;

                while(n!=0)
                {
                    remainder = n%10;
                    reversedInteger = reversedInteger*10+remainder;
                    n /= 10;
                }

                TextView t2=new TextView(Console_palindrome.this);
                t2.setTextColor(getColor(R.color.white));
                t2.setTextSize(18);
                mll.addView(t2);

                if (originalInteger == reversedInteger)
                    t2.setText(originalInteger+" is a palindrome");
                else
                    t2.setText(originalInteger+" is not a palindrome");
            }
        });
    }
}