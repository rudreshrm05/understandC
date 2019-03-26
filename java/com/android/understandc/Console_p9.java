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

public class Console_p9 extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1, et2;
    int c=0, i=0 ,vowels=0, consonants=0, flag=0;
    char[] s1=new char[100], s2=new char[100];
    String s=new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll = (LinearLayout) findViewById(R.id.mll);
        ok = (Button) findViewById(R.id.ok);

        TextView t1=new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter string s1");
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

                if(flag==0) {
                    s=et1.getText().toString();

                    for(i=0;i<s.length();i++){
                        s1[i]=s.charAt(i);
                    }

                    TextView t2=new TextView(Console_p9.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("What to do?\n1.String copy\n2.count vowels and consonants");
                    t2.setTextSize(18);
                    mll.addView(t2);

                    et2=new EditText(Console_p9.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    mll.addView(et2);
                    flag=1;
                }
                else{
                    c = Integer.parseInt(et2.getText().toString());

                    if(c==1){
                        for(i = 0; i<s1.length; ++i)
                        {
                            s2[i] = s1[i];
                        }

                        String s3=new String(s2);

                        TextView t3=new TextView(Console_p9.this);
                        t3.setTextColor(getColor(R.color.white));
                        t3.setText("String s2:"+s3);
                        t3.setTextSize(18);
                        mll.addView(t3);
                    }
                    else if(c==2){
                        for(i=0; i<s1.length; ++i)
                        {
                            if(s1[i]=='a' || s1[i]=='e' || s1[i]=='i' ||
                                    s1[i]=='o' || s1[i]=='u' || s1[i]=='A' ||
                                    s1[i]=='E' || s1[i]=='I' || s1[i]=='O' ||
                                    s1[i]=='U')
                            {
                                ++vowels;
                            }
                            else if((s1[i]>='a'&& s1[i]<='z') || (s1[i]>='A'&& s1[i]<='Z'))
                            {
                                ++consonants;
                            }
                        }
                        TextView t3=new TextView(Console_p9.this);
                        t3.setTextColor(getColor(R.color.white));
                        t3.setText("Vowels:"+vowels+"\nConsonants:"+consonants);
                        t3.setTextSize(18);
                        mll.addView(t3);
                    }
                }
            }
        });

    }
}
