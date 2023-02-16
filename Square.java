import java.util.Scanner ;
class Square{
	public static void main (String args[]){
		int sum =0;
		Scanner sc=new Scanner(System.in);
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<10; i++)  {  
			array[i]=sc.nextInt(); 
			 int c = array[i]*array[i];
			System.out.println("square value : "+c);
			sum = sum + c ;	} 
		System.out.println("The sum is : "+sum);
}
}