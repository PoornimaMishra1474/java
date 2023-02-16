public class SubClass{
	private int x= 3;}

class SuperClass extends SubClass{
	public static void main (String args[]){
		System.out.println("The private member is "+x);
}
}