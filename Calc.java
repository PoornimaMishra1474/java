import java.util.Scanner;

class Calc
{

static long power(int a,int b)
{
int m=a;
for(int i=1;i<b;i++)
m*=a;

return m;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a & b:");
 
int a=sc.nextInt();
int b=sc.nextInt();

try{
if (a==0 && b==0)
throw new ArithmeticException("a & b both can't be 0");

if(a<0 && b<0)
throw new ArithmeticException("a & b can't be negative");

System.out.println("Division=" + power(a,b));
}
catch (Exception e)
{
System.out.println("Exception Occurred.");
System.out.println(e);
}

System.out.println("End of Program");
}
}