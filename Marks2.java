import java.util.Scanner;
class Marks2{
	public static void main(String args[]){
	int sum = 0;
	int number;
	Scanner sc=new Scanner(System.in);
	for(int i =0 ; i<10 ; i++){
		System.out.println("Enter the number");
		number=sc.nextInt();
		sum = sum +number;}
	System.out.println ("The sum is "+sum);
}
}