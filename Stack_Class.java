import java.util.Scanner ;
interface Stack_Interface{
	void push ( int x );
	void pop ();
	void display ();
}
class Stack_Class implements StackInterface{
	int[] array=new int[5];
	int top =-1;
	public void push ( int x ){
		if (top==array.length-1){
            System.out.println("Stack overflow...");	}
		else{
            top++;
            array[top]=x;
        }
}
	public void pop (){
 if (top==-1){
            System.out.println("Stack underflow...");
        }
        else{
	    System.out.println("Popped element="+array[top]);
	    array[top]=0;
            top=top-1;       
        }
}
	public void display (){
   System.out.println("Elements in stack: ");
        for (int i: array){
            System.out.println(i);
        }
}
	public static void main (String args[]){
	           Scanner sc=new Scanner(System.in);
    	           Stack_Class obj=new Stack_Class();
		String choice;
		
while(true){
		System.out.println("choose");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		choice = sc.nextLine();

		switch(choice) {
  			case "1":
                		System.out.println("Enter the element to be added: ");
                		int n=sc.nextInt();
                		obj.push(n);
   			 break;
			 case "2":
			 obj.pop();
			  break;
			 case "3":
			 obj.display();
			 break;
			 case "4":
			return;
			  default:
				System.out.println("Wrong Input");
				}
		}
	}
}