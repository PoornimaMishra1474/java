class OddEven{
	public static void main (String args[]){
		int number , x ,y;
		number = Integer.parseInt(args[0]);
		x = number /2 ;
		y= x*2;
		if (y==number){
			System.out.println("The number is even");}
		else {
			System.out.println("The number is Odd");}
}
}