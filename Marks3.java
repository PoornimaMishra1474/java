import java.util.Scanner;
class Marks3{
	static void display(int arr[]) {
	System.out.println("...<<<The result>>>...");
	String comment = " ";
	for (int i =0 ; i <10 ; i++){
		if ( arr[i] > 100 ){
			comment ="Wrong Input" ; }
		else if ( arr[i] <= 100 && arr[i] >= 75){
			comment ="Detention" ;}
		else if (arr[i] <75 && arr[i] >= 51){
			comment ="Merit" ; }
		else if (arr[i] <=50 && arr[i] >= 40){
			comment ="Pass" ; }
		else {
			comment ="Fail" ; }
		System.out.print (arr[i] ) ;
		System.out.println ("  "+comment ) ; }
  }
	public static void main(String args[]){
	int []marks=new int [10];
	int z =0 ;
	Scanner sc = new Scanner(System.in);
	for (int j = 0; j < 10; j++) {
		System.out.println ("enter marks "+j);
		marks[j] = sc.nextInt();		}	
	for (int j =0 ; j<10 ; j++){
		for (int i = j+1 ; i<10 ; i++){
				if (marks[i] > marks[j]) {
					z= marks[j] ; 
					marks[j] = marks[i] ; 
					marks[i] = z ; }}}
	display(marks);
}
}