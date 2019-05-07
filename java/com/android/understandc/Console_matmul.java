package com.android.understandc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Rudresh on 07-05-2019.
 */

public class Console_matmul extends Activity {
    LinearLayout mll;
    Button ok;
    EditText et1, et2, et3, et4, et5, et6, et7, et8;
    int flag=0,n=0,etid=1, r1=0, c1=0, r2=0, c2=0, a[][], b[][], sum, result[][];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.console);
        mll=(LinearLayout)findViewById(R.id.mll);
        ok=(Button)findViewById(R.id.ok);

        TextView t1=new TextView(this);
        t1.setTextColor(getColor(R.color.white));
        t1.setText("Enter the num of rows and col of first mat");
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
                    r1 = Integer.parseInt(et1.getText().toString());

                    et2 = new EditText(Console_matmul.this);
                    et2.setTextColor(getColor(R.color.white));
                    et2.setSelectAllOnFocus(true);
                    et2.requestFocus();
                    mll.addView(et2);
                }

                if(flag==1){
                    c1=Integer.parseInt(et2.getText().toString());

                    TextView t2=new TextView(Console_matmul.this);
                    t2.setTextColor(getColor(R.color.white));
                    t2.setText("Enter the num of rows and col of second mat");
                    t2.setTextSize(18);
                    mll.addView(t2);

                    et3=new EditText(Console_matmul.this);
                    et3.setTextColor(getColor(R.color.white));
                    et3.setSelectAllOnFocus(true);
                    et3.requestFocus();
                    mll.addView(et3);
                }
                if(flag==2){
                    r2=Integer.parseInt(et3.getText().toString());

                    et4=new EditText(Console_matmul.this);
                    et4.setTextColor(getColor(R.color.white));
                    et4.setSelectAllOnFocus(true);
                    et4.requestFocus();
                    mll.addView(et4);
                }
                if(flag==3){
                    c2=Integer.parseInt(et4.getText().toString());

                    if(c1!=r2){
                        TextView t3=new TextView(Console_matmul.this);
                        t3.setTextColor(getColor(R.color.white));
                        t3.setText("Matrices cant be multiplied");
                        t3.setTextSize(18);
                        mll.addView(t3);
                    }
                    else{
                        a=new int[r1][c1];
                        b=new int[r2][c2];

                        TextView t4=new TextView(Console_matmul.this);
                        t4.setTextColor(getColor(R.color.white));
                        t4.setText("Enter the elements of first mat");
                        t4.setTextSize(18);
                        mll.addView(t4);

                        et5=new EditText(Console_matmul.this);
                        et5.setTextColor(getColor(R.color.white));
                        et5.setTag("detid"+etid);
                        et5.setSelectAllOnFocus(true);
                        et5.requestFocus();
                        etid++;
                        mll.addView(et5);
                    }
                }

                if(flag>4&&flag<(4+(r1*c1))){
                    et6=new EditText(Console_matmul.this);
                    et6.setTextColor(getColor(R.color.white));
                    et6.setTag("detid"+etid);
                    et6.setSelectAllOnFocus(true);
                    et6.requestFocus();
                    etid++;
                    mll.addView(et6);
                }

                if(flag==(r1*c1)+5){
                    int k=1;
                    for(int i=0;i<r1;i++){
                        for(int j=0;j<c1;j++) {
                            a[i][j]=Integer.parseInt(((EditText)mll.findViewWithTag("detid"+k)).getText().toString());
                            k++;
                        }
                    }
                    TextView t5=new TextView(Console_matmul.this);
                    t5.setTextColor(getColor(R.color.white));
                    t5.setText("Enter the elements of second mat");
                    t5.setTextSize(18);
                    mll.addView(t5);

                    etid=1;

                    et7=new EditText(Console_matmul.this);
                    et7.setTextColor(getColor(R.color.white));
                    et7.setTag("detid2"+etid);
                    et7.setSelectAllOnFocus(true);
                    et7.requestFocus();
                    etid++;
                    mll.addView(et7);

                }
                if(flag>(r1*c1)+5&&flag<((r2*c2)+(r1*c1)+5)){
                    et8=new EditText(Console_matmul.this);
                    et8.setTextColor(getColor(R.color.white));
                    et8.setTag("detid2"+etid);
                    et8.setSelectAllOnFocus(true);
                    et8.requestFocus();
                    etid++;
                    mll.addView(et8);
                }
                if(flag>=((r2*c2)+(r1*c1)+5)){
                    int k=1;

                    result=new int[r1][c2];

                    for(int i=0;i<r2;i++){
                        for(int j=0;j<c2;j++) {
                            b[i][j]=Integer.parseInt(((EditText)mll.findViewWithTag("detid2"+k)).getText().toString());
                            k++;
                        }
                    }

                    for (int c = 0; c < r1; c++) {
                        for (int d = 0; d < c2; d++) {
                            for (int m = 0; m < r2; m++) {
                                sum = sum + a[c][m]*b[m][d];
                            }
                            result[c][d] = sum;
                            sum = 0;
                        }
                    }

                    TextView t6=new TextView(Console_matmul.this);
                    t6.setTextColor(getColor(R.color.white));
                    t6.setText("The resultant matrix is");
                    t6.setTextSize(18);
                    mll.addView(t6);

                    TextView t7=new TextView(Console_matmul.this);
                    t7.setTextColor(getColor(R.color.white));
                    t7.setTextSize(18);
                    mll.addView(t7);

                    for(int i=0;i<r1;i++){
                        for(int j=0;j<c2;j++) {
                            t7.setText(t7.getText().toString()+result[i][j]+" ");
                        }
                        t7.setText(t7.getText().toString()+"\n");
                    }
                }
                flag++;
            }
        });
    }
}
