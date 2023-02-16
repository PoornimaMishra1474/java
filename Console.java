import java.util.Scanner ; 
class Console{
	public static void main(String args[]){
	    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String S = sc.nextLine();
		StringBuffer str= new StringBuffer("S");
 		char ch;
	   	 for(int i=0;i<str.length();i++){
	     		 if ((str.charAt(i)>'a') && (str.charAt(i)<'z')){
	            	ch=(char)((int) str.charAt(i)-32);
	            	str.setCharAt(i,ch);
	        		}
	    	}
		System.out.println(str);
	}
}