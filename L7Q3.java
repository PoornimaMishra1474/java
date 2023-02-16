import java.util.Scanner;
class L7Q3{
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	try{
	int a= sc.nextInt();
	int b= sc.nextInt();
	if ((a==0) || (b==0) || (a<0) || (b<0)){
	throw new ArithmeticException("Number is either 0 or 			Negative");}
	System.out.println(a/b);}
	catch(Exception e){
	System.out.println("Exception Occurred");
	System.out.println(e);}
	System.out.println("End of program");}}