/* range of byte is-128 to 127
byte b=125;
int i=432;
a=b;right
b=a;wrong because a is out of range of byte
but if a=12; you can convert into byte by 
b=(byte)a;this can be done if a is in range'
*********type casting*********
explicitily conversion is called typecasting
ex integer into by byte (pela je conversion kryu anu undhu is typecasting)
a=b//implicit//happens ordinary or naturaly
b=(byte)a//explicit

you can cant store character in boolean
*/

class typeconversion
{
    public static void main(String[] args)
{
    int a=12;
    //byte k=a;we cant do it like this soo we hqve to do it explicitily
    byte k= (byte)a;//to convert a to byte
    System.out.println(k);

    System.out.println(a);
float c=5.6f;
c=a;//(direct thai cz int is incl in float)
a= (int)c;//(explicit cz float is not incl in int)
//c ne int ma conv kro
System.out.println(a);

byte x=10;
byte y=30;
//byte result=x*y will give error because it will be out of range
 int result=x*y;
 System.out.println(result);
}}