package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 26-01-2019.
 */

public class Console_bubble_sort extends Activity{
    LinearLayout mll;
    Button ok;
    EditText et1;
    int flag=0,n=0,etid=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll=(LinearLayout)findViewById(R.id.mll);
        ok=(Button)findViewById(R.id.ok);

        TextView t1=new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter the number of integers");
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
                flag++;
                if(flag==1) {
                    n = Integer.parseInt(et1.getText().toString());
                    TextView t2=new TextView(Console_bubble_sort.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("Enter the integers");
                    t2.setTextSize(18);
                    mll.addView(t2);
                    EditText et3=new EditText(Console_bubble_sort.this);
                    et3.setTextColor(getColor(R.color.white));
                    et3.setTag("detid"+etid);
                    et3.setSelectAllOnFocus(true);
                    et3.requestFocus();
                    etid++;
                    mll.addView(et3);
                }
                else if(flag>1&&flag<=n){
                    EditText et2=new EditText(Console_bubble_sort.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setTag("detid"+etid);
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    etid++;
                    mll.addView(et2);
                }
                else if(flag>n){
                    int a[]=new int[n];
                    int j=1;
                    for(int i=0;i<n;i++){
                        a[i]=Integer.parseInt(((EditText)mll.findViewWithTag("detid"+j)).getText().toString());
                        j++;
                    }
                    int temp;
                    for(int i=0;i<=n-2;i++)
                    {
                        for(int k=0;k<=n-2-i;k++)
                        {
                            if(a[k]>a[k+1])
                            {
                                temp=a[k];
                                a[k]=a[k+1];
                                a[k+1]=temp;
                            }
                        }
                    }

                    TextView t3=new TextView(Console_bubble_sort.this);
                    t3.setTextColor(getColor(R.color.white));
                    t3.setText("Sorted integers are");
                    t3.setTextSize(18);
                    mll.addView(t3);

                    TextView t4=new TextView(Console_bubble_sort.this);
                    t4.setTextColor(getColor(R.color.white));
                    t4.setTextSize(18);
                    mll.addView(t4);


                    for(int i=0;i<n;i++)
                    {
                        t4.setText(t4.getText().toString()+"\t"+a[i]);
                    }
                }


            }
        });
    }
}
