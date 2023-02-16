   import java.util.Scanner ; 
class Month{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int month = 0 ;
		String[] array = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "september" , "October" , "November" , "December"};
		System.out.print("Enter the number of month: ");   
		month=sc.nextInt();
		int z = month -1 ; 
		System.out.println(z) ;
		System.out.println("The month is " +array[z] ) ;
}
}