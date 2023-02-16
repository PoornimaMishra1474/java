import java.util.Scanner;
import java.lang.*;
interface StackInterface{
	public abstract void push(int ele, int stkarr[]);
	public abstract void pop(int stkarr[]);
	public abstract void display(int stkarr[]);
}

class Stack__Class implements StackInterface{
	int top = -1;
	public void push(int ele, int stkarr[]){
		if(top == 10-1){
        		System.out.println("Stack Full: ");
    		}
    		else{
    			stkarr[++top] = ele;
    			System.out.println("Element Pushed!");
    		}
	}
	public void pop(int stkarr[]){
		if (top == -1){
        		System.out.println("Stack Empty: ");
    		}
    		else{
        		System.out.println("Element Deleted: "+ stkarr[top--]);
		}
	}
	public void display(int stkarr[]){
		if(top == -1){
			System.out.println("Stack Empty");
		}
    		for(int i=top; i>=0; i--){
        		System.out.println("Element: "+stkarr[i]);
    		}
	}	
	public static void main(String[] args){
	      int []stkarr = new int[5];
		Stack__Class obj = new Stack__Class();
		int choice;
		do
		{
			System.out.println("1- Push Element");
			System.out.println("2- Pop Element");
			System.out.println("3- Traversal");
			System.out.println("4- Exit");

			System.out.println("Enter choice: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter Element");
					Scanner input = new Scanner(System.in);
					int b = input.nextInt();
					obj.push(b, stkarr);
					break;
				case 2:
					obj.pop(stkarr);
					break;
				case 3:
					obj.display(stkarr);
					break;
				case 4:
					System.exit(0);
			}
		}while(true);					
	}
}