interface Test{
	void sq(int x );
}
class arithmetic implements Test{
	public void sq(int x){
		int square = x*x;
		System.out.println("the squrae value is "+square);}
}
class ToTestInt{
	public static void main (String args[]){
		Test T = new arithmetic();
		T.sq(6);
}
}