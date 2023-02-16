class Ordinary {
	int ratepermin = 1;
	void charges(int min ){
		int T_charge = ratepermin * min ; 
		System.out.println("The total charge is " +T_charge);
	}
}
class Urgent {
	int ratepermin = 2;
	void charges(int min ){
		int T_charge = ratepermin * min ; 
		System.out.println("The total charge is " +T_charge);
	}
}
class Lightning {
	int ratepermin = 3;
	void charges(int min ){
		int T_charge = ratepermin * min ; 
		System.out.println("The total charge is " +T_charge);
	}	
}
class Trunk_call{
	public static void main (String args[]){
		Ordinary ord = new Ordinary();
		Urgent urg = new Urgent();
		Lightning lig = new Lightning();
		ord.charges(5);
		urg.charges(5);
		lig.charges(5);
}
}