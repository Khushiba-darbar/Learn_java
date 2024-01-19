// jshell ma pn outputs aave pn e just for experimenting
class hello{
public static void main(String args[])
{
    int num=3;
    int num2=6;
    int result;
    result=num+num2;
    System.out.println(result);

    float marks= 6.5f;
    String name="khushi";

    System.out.println(2+5);
    System.out.println(45*5);
    
    System.out.println("hello World");
    System.out.println(num);
    System.out.println(marks);
    System.out.println(name);

    /********************************** */
byte numa=8;//by using byte it occupies 1byte space only
// but cant written as 150 because it is out o fits range
short sh=332;
long l=12344l;//l to specify that it is l
float marksa=6.5f;//error willcome if you write 6.5 beacuse float is not default ,double is default, soo to say you are using float f must be written
double numb=6.5;//double is default soo no need to write d at its end
 char initial='k';//char needs to be written in''
 if(true);
 boolean b=true;
 boolean b2=false;//you cant write 1 or 0 it will give error
 //if(false)is legal but if(1) or if(0) is not correct

 /***************************************** */

 //literals=synthetic representation of variables constant and identifiers
 int num11=128;
 int num12=0b101;//for binary
int num13=0x7E;//for hexadecimal
float num14=100000000f;// can be also written as // 
num14=10_00_00_000f;

double num15=12e10;//it means num into e raised to power is also valid
System.out.println(num15);

char c='a';
c++;
System.out.println(c);

}
}