//Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. HandleArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program.

import java.util.Scanner ; 
class Lab7Q1 extends Exception{
	
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		int rno[] = new int[3];
		String name[] = new String[3];
		for(int i =0 ; i <= 3 ; i++){
			System.out.println("Enter the name of the obj");				
			name[i] = sc.nextLine();
			System.out.println("Enter the roll number of the obj");
			rno[i]= sc.nextInt();
		}
		
		try{
			System.out.println(rno[5]);
}catch(Exception e){ System.out.println("exception");}
	}
}