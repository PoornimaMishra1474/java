//Write a program to create interface A, in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.
interface A {
	void meth1();
	void meth2();

}
class Myclass implements A{
	public void meth1(){
		System.out.println("This is meth 1 ");}
	public void meth2(){
		System.out.println("This is meth 2 ");}
	public static void main (String args[]){
		A obj = new Myclass();
		obj.meth1();
		obj.meth2();
	}
}