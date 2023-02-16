class Calci{
	public static void main (String args[]){
		double a , b , sum , diff , pro  ;
		Double div ;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		sum = a+b;
		diff = a-b;
		pro = a*b;
		div = a/b;
		if (args[2].equals("+")){
		System.out.println("The sum is "+sum);}
		if  (args[2].equals("-")){
		System.out.println("The difference is "+diff);}
		if (args[2].equals(".")){
		System.out.println("The product is "+pro);}
		if  (args[2].equals("/")){
		System.out.println("result for division is "+div);}
}
}