class Calculator{
	public static void main (String args[]){
		int a , b , sum , diff , pro  ;
		float div ;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		sum = a+b;
		diff = a-b;
		pro = a*b;
		div = a/b;
		System.out.println("The sum is "+sum);
		System.out.println("The difference is "+diff);
		System.out.println("The product is "+pro);
		System.out.println("result for division is "+div);		
}
}