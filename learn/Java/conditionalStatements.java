class conditionalStatements
{
    public static void main(String args[])
    {
        int x=8;
        int y=14;

        if(x>10 && y<=20)//11-20 ni range ma hoi to//

            System.out.println("hello");
    
        else
        
            System.out.println("bye");
        
             //you can also use if alone but cant use else alone soo to use else there must be if//

    /*if(x>y)
    System.out.println("smallest number is "+x);// to print any value + is used
    else
   { System.out.println("smallest number is "+y);}
   System.out.println("thankyou");*/
    
    int a=4;
    int b=11;
    int c=17;

    if(a<b && a<c)
    {System.out.println("smallest number is"+a);}
   else if(b<a && b<c)
   { System.out.println("smallest number is"+b);}
    else{
    System.out.println("smallest number is"+c);}

    System.out.println("thankyou");


    }



}