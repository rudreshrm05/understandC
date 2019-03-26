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

public class Console_binary extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1, et3;
    int flag=0,n=0,etid=1,i,low,high,mid, flag2=0, found=0;
    String a[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll=(LinearLayout)findViewById(R.id.mll);
        ok=(Button)findViewById(R.id.ok);

        TextView t1=new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter the number of strings");
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
                if (flag == 1) {
                    n = Integer.parseInt(et1.getText().toString());
                    TextView t2 = new TextView(Console_binary.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("Enter the Strings in ascending order");
                    t2.setTextSize(18);
                    mll.addView(t2);
                    EditText et3 = new EditText(Console_binary.this);
                    et3.setTextColor(getColor(R.color.white));
                    et3.setTag("detid" + etid);
                    et3.setSelectAllOnFocus(true);
                    et3.requestFocus();
                    etid++;
                    mll.addView(et3);
                } else if (flag > 1 && flag <= n) {
                    EditText et2 = new EditText(Console_binary.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setTag("detid" + etid);
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    etid++;
                    mll.addView(et2);
                } else if (flag > n) {

                    if(flag2==0) {
                        a = new String[n];
                        int j = 1;
                        for (int i = 0; i < n; i++) {
                            a[i] = ((EditText) mll.findViewWithTag("detid" + j)).getText().toString();
                            j++;
                        }
                        TextView t3=new TextView(Console_binary.this);
                        t3.setTextColor(getColor(R.color.white));
                        t3.setText("Enter the key to be found");
                        t3.setTextSize(18);
                        mll.addView(t3);

                        et3=new EditText(Console_binary.this);
                        et3.setTextColor(getColor(R.color.white));
                        et3.setSelectAllOnFocus(true);
                        et3.requestFocus();
                        mll.addView(et3);
                        flag2=1;
                    }
                    else {
                        String key=et3.getText().toString();
                        low = 0;
                        high = n - 1;
                        while (low <= high) {
                            mid = (low + high) / 2;
                            if (key.compareTo(a[mid])==0) {
                                found=1;
                                break;
                            } else if (key.compareTo(a[mid]) > 0) {
                                low = mid + 1;
                            } else {
                                high = mid - 1;
                            }
                        }
                        if(found==1){
                            TextView t4=new TextView(Console_binary.this);
                            t4.setTextColor(getColor(R.color.white));
                            t4.setText("key found at the position "+(mid+1));
                            t4.setTextSize(18);
                            mll.addView(t4);
                        }
                        else {
                            TextView t5=new TextView(Console_binary.this);
                            t5.setTextColor(getColor(R.color.white));
                            t5.setText("name not found");
                            t5.setTextSize(18);
                            mll.addView(t5);
                        }
                    }
                }
            }
        });
    }
}
