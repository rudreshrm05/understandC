package com.android.understandc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rudresh on 24-01-2019.
 */

public class Display_program extends Activity {
    TextView display,display_program_number;
    Button execute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_program);
        display=(TextView)findViewById(R.id.program_display);
        display_program_number=(TextView)findViewById(R.id.program_number);
        execute=(Button)findViewById(R.id.execute);

        Bundle bundle = getIntent().getExtras();
        final String program_num = bundle.getString("pgm");

        if("P1".equals(program_num)){
            display_program_number.setText("PROGRAM 1");
            display.setText("#include<stdio.h>\n" +
                    "#include<math.h>\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tfloat a,b,c,discriminant;\n" +
                    "\tfloat root1,root2,real,imaginary;\n" +
                    "\tprintf(\"enter the values for co-efficient a,b and c\\n\");\n" +
                    "\tscanf(\"%f%f%f\",&a,&b,&c);\n" +
                    "\n" +
                    "\tif((a==0)&&(b==0))\n" +
                    "\t{\n" +
                    "\t\tprintf(\"Invalid, coefficients cannot be zero\\n\");\n" +
                    "\t}\n" +
                    "\telse if(a==0)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"linear equation\\n\");\n" +
                    "\t\troot1=-c/b;\n" +
                    "\t\tprintf(\"Root=%f\",root1);\n" +
                    "\t}\n" +
                    "\telse\n" +
                    "\t{\n" +
                    "\t\tdiscriminant=b*b-4*a*c;\n" +
                    "\t\tif(discriminant==0)\n" +
                    "\t\t{\t\n" +
                    "\t\t\tprintf(\"The roots are real and equal\\n\");\n" +
                    "\t\t\troot1=root2=-b/(2*a);\n" +
                    "\t\t\tprintf(\"Root1=%f\\nRoot2=%f\",root1,root2);\n" +
                    "\t\t}\n" +
                    "\t\telse if(discriminant>0)\n" +
                    "\t\t{\n" +
                    "\t\t\tprintf(\"The roots are real and Distinct\\n\");\n" +
                    "\t\t\troot1=(-b+sqrt(discriminant))/(2*a);\n" +
                    "\t\t\troot1=(-b-sqrt(discriminant))/(2*a);\n" +
                    "\t\t\tprintf(\"Root1=%f\\nRoot2=%f\",root1,root2);\n" +
                    "\t\t}\n" +
                    "\t\telse\n" +
                    "\t\t{\n" +
                    "\t\t\tprintf(\"The roots are real and imaginary\\n\");\n" +
                    "\t\t\treal=-b/(2*a);\n" +
                    "\t\t\timaginary=sqrt(fabs(discriminant))/(2*a);\n" +
                    "\t\t\tprintf(\"Root1=%f+i%f\\n\",real,imaginary);\n" +
                    "\t\t\tprintf(\"Root1=%f-i%f\\n\",real,imaginary);\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "}\n" +
                    "\t");
        }

        if("P2".equals(program_num)){
            display_program_number.setText("PROGRAM 2");
            display.setText("#include <stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "    int n, reversedInteger = 0, remainder, originalInteger;\n" +
                    "\n" +
                    "    printf(\"Enter an integer: \");\n" +
                    "    scanf(\"%d\", &n);\n" +
                    "\n" +
                    "    originalInteger = n;\n" +
                    "\n" +
                    "    // The 'originalInteger' is reversed and stored in 'reversedInteger' \n" +
                    "    while( n!=0 )\n" +
                    "    {\n" +
                    "        remainder = n%10;\n" +
                    "        reversedInteger = reversedInteger*10 + remainder;\n" +
                    "        n /= 10;\n" +
                    "    }\n" +
                    "\n" +
                    "    // palindrome if orignalInteger and reversedInteger are equal\n" +
                    "    if (originalInteger == reversedInteger)\n" +
                    "        printf(\"%d is a palindrome.\", originalInteger);\n" +
                    "    else\n" +
                    "        printf(\"%d is not a palindrome.\", originalInteger);\n" +
                    "    \n" +
                    "}");
        }

        if("P4".equals(program_num)){
            display_program_number.setText("PROGRAM 4");
            display.setText("#include <stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    " float a[100],sum=0,x;\n" +
                    " int n,i;\n" +
                    " printf(\"Enter the degree of the polynomial:\");\n" +
                    " scanf(\"%d\",&n);\n" +
                    " printf(\"Enter the coefficients into the array:\");\n" +
                    " for(i=n;i>=0;i--)\n" +
                    " {\n" +
                    "  scanf(\"%f\",&a[i]);\n" +
                    " }\n" +
                    " printf(\"Enter the value of x:\");\n" +
                    " scanf(\"%f\",&x);\n" +
                    " for(i=n;i>0;i--)\n" +
                    " {\n" +
                    "  sum=(sum+a[i])*x;\n" +
                    " }\n" +
                    " sum=sum+a[0];\n" +
                    " printf(\"\\nValue of the polynomial is =%f\",sum);\n" +
                    "}\n");
        }

        if("P5".equals(program_num)) {
            display_program_number.setText("PROGRAM 5");
            display.setText("#include <stdio.h>\n" +
                    "#include <math.h>\n" +
                    "\n" +
                    "int factorial(int m)\n" +
                    "{\n" +
                    "    if (m==0 || m==1)\n" +
                    "        return (1);\n" +
                    "    else\n" +
                    "        return (m*factorial(m-1));\n" +
                    "}\n" +
                    "\n" +
                    "double sine(double x)\n" +
                    "{\n" +
                    "    int n;\n" +
                    "    double val=0;\n" +
                    "    for (n=0;n<8;n++)\n" +
                    "    {\n" +
                    "        double p = pow(-1,n);\n" +
                    "        double px = pow(x,2*n+1);\n" +
                    "        int fac = factorial(2*n+1);\n" +
                    "        val += p * px / fac;\n" +
                    "    }\n" +
                    "    return val;\n" +
                    "}\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "    double x;\n" +
                    "    printf(\"Enter angles in degrees: \");\n" +
                    "    scanf(\"%lf\",&x);\n" +
                    "    printf(\"\\nValue of sine of %f is %lf\\n\",x,sine(x * M_PI / 180));\n" +
                    "    printf(\"\\nValue of sine of %f from library function is %lf\\n\",x,sin(x * M_PI / 180));\n" +
                    "    return 0;\n" +
                    "}\n");
        }

        if("P6".equals(program_num)){
            display_program_number.setText("PROGRAM 6");
            display.setText("#include<stdio.h>\n" +
                    "#include<math.h>\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j,n,temp,a[20];\n" +
                    "\tprintf(\"Enter the number of integers\\n\")\n" +
                    "\tscanf(\"%d\",&n);\n" +
                    "\t\n" +
                    "\tprintf(\"Enter the integers\\n\");\n" +
                    "\t\n" +
                    "\tfor(i=0;i<n-1;i++)\n" +
                    "\t{\n" +
                    "\t\tscanf(\"%d\",&a[i]);\n" +
                    "\t}\n" +
                    "\t\n" +
                    "\tfor(i=0;i<=n-2;i++)\n" +
                    "\t{\n" +
                    "\t\tfor(j=0;j<=n-2-i;j++)\n" +
                    "\t\t{\n" +
                    "\t\t\tif(a[j]>a[j+1])\n" +
                    "\t\t\t{\n" +
                    "\t\t\t\ttemp=a[j];\n" +
                    "\t\t\t\ta[j]=a[j+1];\n" +
                    "\t\t\t\ta[j+1]=temp;\n" +
                    "\t\t\t}\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "\tprintf(\"The sorted order od the numbers is\\n\");\n" +
                    "\t\n" +
                    "\tfor(i=0;i<n-1;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"%d\\t\",a[i]);\n" +
                    "\t}\n" +
                    "}");
        }

        execute.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if("P6".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_bubble_sort.class);
                    startActivity(intent);
                }
                else if("P2".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_palindrome.class);
                    startActivity(intent);
                }
                else if("P1".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_roots.class);
                    startActivity(intent);
                }
                else if("P4".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_horners.class);
                    startActivity(intent);
                }
                else if("P5".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_taylors.class);
                    startActivity(intent);
                }
            }
        });

    }
}