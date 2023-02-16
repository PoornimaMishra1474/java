//Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program
 interface Bank{
	int RateOfIntrest = 10;
	void Amount(int principle , int time);
}
class SBI implements Bank{
	public void Amount(int principle , int time){
		//RateOfIntrest=20;
		int T_amount = principle*RateOfIntrest*time;
		System.out.println("The total amount is "+T_amount);
	}
	public static void main (String args[]){
		SBI E1 = new SBI();
		E1.Amount(100 , 10);
	}
}