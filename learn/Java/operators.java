class operators
{
    public static void main(String args[])
    {
        int num1=2;
        int num2=3;
        int res1=num1+num2;
        int res2=num1-num2;
        int res3=num1*num2;
        int res4=num1/num2;
        int res5=num1%num2;
        int res6=num1^num2;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);

        num1 += 2;//num1=num=+2;
        num2+=5;//num2+5

        System.out.println(num1);
        System.out.println(num2);

        /********increment and decrement operators********* */

        num2++;//post increment -first fetch the value of num and then add 1
        System.out.println(num2);
        ++num2;//pre increment-first incremnt the num and then fetch the value
        System.out.println(num2);
        num1--;//post decreent-first fetch the value of num and then sub 1
        System.out.println(num1);
        --num1;//pre decrement-first incremnt the num and then fetch the value
        System.out.println(num1);

        /*************relational operators*********** */

        //answer will come in true or false
        //operators are ==,!=,<,>,<=,>=

        float a=6;
        double b=8;

        boolean result1=a>b;
        boolean result2=a>=b;
        boolean result3=a==b;
        boolean result4=a!=b;
        boolean result5=a<=b;
        boolean result6=a<b;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        /***************logical operators********* */

        int x=5;
        int y=6;

        boolean r1=x<y && a<b;
        boolean r2=x>y && a>b;
        boolean r5=x>y && a<b;
        boolean r6=x<y && a>b;
       
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r5);
        System.out.println(r6);
       
        boolean r11=x<y || a<b;
        boolean r12=x>y || a>b;
        boolean r15=x>y || a<b;
        boolean r16=x<y || a>b;
    
        System.out.println(r11);
        System.out.println(r12);
        System.out.println(r15);
        System.out.println(r16);
       
         //not operators jhust chnage true to false and false to true by !

        System.out.println(!r16);

        /********ternary operators****** */

        //alternative of if else 

        int number=7;
        int resultt;
        resultt=number%5==0?123:789;     
        System.out.println(resultt);

        
    
        



    }
}