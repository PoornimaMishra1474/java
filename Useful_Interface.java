interface x {
	static float pi = 3.142f ; 
}
class circle implements x{
	float compute(float x)
	{return(pi*x*x);}
}
class Useful_Interface{
	public static void main(String args[]){
		circle cr = new circle();
		System.out.println("area of circle is "+cr.compute(10));
}
}