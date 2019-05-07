package com.android.understandc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

        if("P3".equals(program_num)) {
            display_program_number.setText("PROGRAM 3");
            display.setText("3.a) Calculating the square root\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint n;\n" +
                    "\tfloat temp,sqt;\n" +
                    "\t\n" +
                    "\tprintf(\"Enter d no\");\n" +
                    "\tscanf(\"%d\",&n);\n" +
                    "\n" +
                    "\tsqt=n/2;\n" +
                    "\ttemp=0;\n" +
                    "\twhile(sqt!=temp)\n" +
                    "\t{\n" +
                    "\t\ttemp=sqt;\n" +
                    "\t\tsqt=(n/temp+temp)/2;\n" +
                    "\t}\n" +
                    "\n" +
                    "\tprintf(\"the square root of %d is%f\",n,sqt);\n" +
                    "}\n" +
                    "\n" +
                    "3.b) Checking leap year \n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "void main() {\n" +
                    "   int year;\n" +
                    "   year = 2016;\n" +
                    "\n" +
                    "   if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))\n" +
                    "      printf(\"%d is a leap year\", year);\n" +
                    "   else\n" +
                    "      printf(\"%d is not a leap year\", year);\n" +
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
        if("P7".equals(program_num)){
            display_program_number.setText("PROGRAM 7");
            display.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "  int m, n, p, q, c, d, k, sum = 0;\n" +
                    "  int first[10][10], second[10][10], multiply[10][10];\n" +
                    "\n" +
                    "  printf(\"Enter number of rows and columns of first matrix\\n\");\n" +
                    "  scanf(\"%d%d\", &m, &n);\n" +
                    "  \n" +
                    "  printf(\"Enter number of rows and columns of second matrix\\n\");\n" +
                    "  scanf(\"%d%d\", &p, &q);\n" +
                    "\n" +
                    "  if (n != p)\n" +
                    "    printf(\"The matrices can't be multiplied with each other.\\n\");\n" +
                    "  else\n" +
                    "  {\n" +
                    "  \tprintf(\"Enter elements of first matrix\\n\");\n" +
                    "\n" +
                    "  \tfor (c = 0; c < m; c++)\n" +
                    "    \tfor (d = 0; d < n; d++)\n" +
                    "    \t\tscanf(\"%d\", &first[c][d]);\n" +
                    "      \n" +
                    "    printf(\"Enter elements of second matrix\\n\");\n" +
                    "\n" +
                    "    for (c = 0; c < p; c++)\n" +
                    "      for (d = 0; d < q; d++)\n" +
                    "        scanf(\"%d\", &second[c][d]);\n" +
                    "\n" +
                    "    for (c = 0; c < m; c++) {\n" +
                    "      for (d = 0; d < q; d++) {\n" +
                    "        for (k = 0; k < p; k++) {\n" +
                    "          sum = sum + first[c][k]*second[k][d];\n" +
                    "        }\n" +
                    "        multiply[c][d] = sum;\n" +
                    "        sum = 0;\n" +
                    "      }\n" +
                    "    }\n" +
                    "\n" +
                    "    printf(\"Product of the matrices:\\n\");\n" +
                    "\n" +
                    "    for (c = 0; c < m; c++) {\n" +
                    "      for (d = 0; d < q; d++)\n" +
                    "        printf(\"%d\\t\", multiply[c][d]);\n" +
                    "\n" +
                    "      printf(\"\\n\");\n" +
                    "    }\n" +
                    "  }\n" +
                    "\n" +
                    "  return 0;\n" +
                    "}");
        }

        if("P8".equals(program_num)) {
            display_program_number.setText("PROGRAM 8");
            display.setText("#include <stdio.h>\n" +
                    "#include <string.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    " int i,n,low,high,mid;\n" +
                    " char a[50][50],key[20];\n" +
                    " printf(\"enter the number of names to be added\\n\");\n" +
                    " scanf(\"%d\",&n);\n" +
                    " printf(\"enter the name in ascending order\\n\");\n" +
                    " for(i=0;i<=n-1;i++)\n" +
                    " {\n" +
                    " scanf(\"%s\",&a[i]);\n" +
                    " }\n" +
                    " printf(\"\\n\");\n" +
                    " printf(\"enter the name to be searched\\n\");\n" +
                    " scanf(\"%s\",&key);\n" +
                    " low=0;\n" +
                    " high=n-1;\n" +
                    " while(low<=high)\n" +
                    " {\n" +
                    " mid=(low+high)/2;\n" +
                    " if (strcmp(key,a[mid])==0)\n" +
                    " {\n" +
                    " printf(\"key found at the position %d\\n\",mid+1);\n" +
                    "        exit(0);\n" +
                    " }\n" +
                    " else if(strcmp(key,a[mid])>0)\n" +
                    " {\n" +
                    " high=high;\n" +
                    " low=mid+1;\n" +
                    " }\n" +
                    " else\n" +
                    " {\n" +
                    " low=low;\n" +
                    " high=mid-1;\n" +
                    " }\n" +
                    " }\n" +
                    " printf(\"name not found\\n\");\n" +
                    " }\n");
        }

        if("P9".equals(program_num)) {
            display_program_number.setText("PROGRAM 9");
            display.setText("#include <stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "int c=0, i,vowels=0, consonants=0;\n" +
                    "char s1[100], s2[100];\n" +
                    "\n" +
                    "printf(\"Enter string s1: \");\n" +
                    "gets(s1);\n" +
                    "\n" +
                    "printf(\"What to do?\\n1.String copy\\n2.count vowels and consonants\\n\");\n" +
                    "scanf(\"%d\",&c);\n" +
                    "\n" +
                    "\n" +
                    "switch(c){\n" +
                    "    case 1:\n" +
                    "\n" +
                    "        for(i = 0; s1[i] != '\\0'; ++i)\n" +
                    "        {\n" +
                    "            s2[i] = s1[i];\n" +
                    "        }\n" +
                    "\n" +
                    "        s2[i] = '\\0';\n" +
                    "        printf(\"String s2: %s\", s2);\n" +
                    "        break;\n" +
                    "\n" +
                    "    case 2:\n" +
                    "\n" +
                    "        for(i=0; s1[i]!='\\0'; ++i)\n" +
                    "        {\n" +
                    "            if(s1[i]=='a' || s1[i]=='e' || s1[i]=='i' ||\n" +
                    "            s1[i]=='o' || s1[i]=='u' || s1[i]=='A' ||\n" +
                    "            s1[i]=='E' || s1[i]=='I' || s1[i]=='O' ||\n" +
                    "            s1[i]=='U')\n" +
                    "            {\n" +
                    "                ++vowels;\n" +
                    "            }\n" +
                    "            else if((s1[i]>='a'&& s1[i]<='z') || (s1[i]>='A'&& s1[i]<='Z'))\n" +
                    "            {\n" +
                    "                ++consonants;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        printf(\"Vowels: %d\",vowels);\n" +
                    "        printf(\"\\nConsonants: %d\",consonants);\n" +
                    "    }\n" +
                    "}\n");
        }

        if("P10".equals(program_num)) {
            display_program_number.setText("PROGRAM 10");
            display.setText("10) a. Right shift operation\n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int rightShift(int num, int x)\n" +
                    "{\n" +
                    "    num = (num>>x);\n" +
                    "    return num;\n" +
                    "\n" +
                    "}\n" +
                    "void main()\n" +
                    "{\n" +
                    "    unsigned int onum, num, x;\n" +
                    "\n" +
                    "    printf(\"Enter the number: \");\n" +
                    "    scanf(\"%d\", &num);\n" +
                    "\n" +
                    "    printf(\"Enter the num of steps: \");\n" +
                    "    scanf(\"%d\", &x);\n" +
                    "\n" +
                    "    onum=num;\n" +
                    "\n" +
                    "    num=rightShift(num, x);\n" +
                    "    printf(\"\\nValue of num = %d after right shifting %d times: %d\",onum, x, num);\n" +
                    "}\n" +
                    "\n" +
                    "10) b. Checking the number is prime or not\n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int isprime(int num){\n" +
                    "    int i;\n" +
                    "    for(i = 2; i <= num/2; ++i)\n" +
                    "    {\n" +
                    "        if(num%i == 0)\n" +
                    "        {\n" +
                    "            return 0;\n" +
                    "        }\n" +
                    "    }\n" +
                    "    return 1;\n" +
                    "}\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    "    int n, flag;\n" +
                    "\n" +
                    "    printf(\"Enter a positive integer: \");\n" +
                    "    scanf(\"%d\", &n);\n" +
                    "\n" +
                    "    flag=isprime(n);\n" +
                    "\n" +
                    "    if (flag == 1)\n" +
                    "        printf(\"%d is a prime number.\", n);\n" +
                    "    else\n" +
                    "        printf(\"%d is not a prime number.\", n);\n" +
                    "}\n" +
                    "\n");
        }

        if("P11".equals(program_num)) {
            display_program_number.setText("PROGRAM 11");
            display.setText("#include <stdio.h>\n" +
                    "\n" +
                    "int fact(int n)\n" +
                    "{\n" +
                    "    if (n >= 1)\n" +
                    "        return n*fact(n-1);\n" +
                    "    else\n" +
                    "        return 1;\n" +
                    "}\n" +
                    "\n" +
                    "void main()\n" +
                    "{\n" +
                    " int n,r,ncr;\n" +
                    "\n" +
                    "  \tprintf(\"Enter n\\n\");\n" +
                    "  \tscanf(\"%d\",&n);\n" +
                    "  \tprintf(\"Enter r\\n\");\n" +
                    "  \tscanf(\"%d\",&r);\n" +
                    "  \tncr=fact(n)/(fact(r)*fact(n-r));\n" +
                    "  \tprintf(\"Value of %dC%d = %d\\n\",n,r,ncr);\n" +
                    "}\n" +
                    "\n" +
                    "\n");
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
                else if("P3".equals(program_num)) {
                    new AlertDialog.Builder(Display_program.this)
                            .setMessage("Which one?")
                            .setCancelable(false)
                            .setPositiveButton("3a", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(Display_program.this, Console_sqrt.class);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton("3b", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(Display_program.this, Console_leap.class);
                                    startActivity(intent);
                                }
                            } )
                            .show();
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
                else if("P7".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_matmul.class);
                    startActivity(intent);
                }
                else if("P8".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_binary.class);
                    startActivity(intent);
                }
                else if("P9".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_p9.class);
                    startActivity(intent);
                }
                else if("P10".equals(program_num)) {
                    new AlertDialog.Builder(Display_program.this)
                            .setMessage("Which one?")
                            .setCancelable(false)
                            .setPositiveButton("10a", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(Display_program.this, Console_rf.class);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton("10b", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(Display_program.this, Console_prime.class);
                                    startActivity(intent);
                                }
                            } )
                            .show();
                }
                else if("P11".equals(program_num)) {
                    Intent intent = new Intent(Display_program.this, Console_ncr.class);
                    startActivity(intent);
                }
            }
        });

    }
}
