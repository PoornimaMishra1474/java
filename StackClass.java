import java.util.Scanner;
import java.util.Stack;
interface StackInterface{
	void push (Stack stk, int x );
	void pop (Stack stk);
	void display (Stack stk);
}
class StackClass implements StackInterface{
	public void push (Stack stk , int x ){
	}
	public void pop (Stack stk){
	}
	public void display (Stack stk){
	}
	public static void main (String args[]){
		String choice;
		Scanner sc = new Scanner(System.in);
		Stack stk = new Stack(10);

		System.out.println("choose");
		System.out.println("1.Push");
		System.out.println("1.Pop");
		System.out.println("1.Display");

		choice = sc.nextLine();

		switch(choice) {
  			case "1":
//push 

   			 break;
			 case "2":
//pop
			  break;
			 case "3":
//display
			  break;
			  default:
System.out.println("Wrong Input");
				}
	}
}
