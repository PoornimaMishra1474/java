class Special_charecter{
	public static void main (String args[]){
	int number =0 ;
	String str = args[0];
	int l = str.length();  
	for (int i =0 ; i < l ; i++){
		char ch = str.charAt(i);
		int ascii = ch;
		System.out.println(ch);
		System.out.println("The ascii value is "+ascii);
		if ((ascii>=48 && ascii<=57) || (ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)){
			continue;
			 }
		else { 
			number = number +1 ;}	}	
	System.out.println("The number of special charectes in the given string is "+number);
}
}