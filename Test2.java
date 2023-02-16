//Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.
interface Test{
	void division(int divident , int divisor);
	void modules(int num1 , int num2 );
}
class Test2 implements Test{
	public void division(int divident , int divisor){
		int answer = divident/divisor ;
		System.out.println("The answer is "+answer);
	}
	public void modules(int num1 , int num2 ){
		int answer = num1%num2 ;
		System.out.println("The answer is "+answer);
	}
	public static void main (String args[]){
		Test2 T1 = new Test2();
		T1.division(10,2);
		T1.modules(11,2);
	}
}