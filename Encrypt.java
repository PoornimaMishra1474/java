class Encrypt{
	public static void main (String args[]){
		char []name1= {'P' , 'o' , 'o' , 'r' ,'n' , 'i' , 'm' , 'a'  };
		int []name2=new int [name1.length];
		System.out.println("The encrypted text is");
		for (int i = 0 ; i < name1.length ; i++){
			char c = name1[i] ; 
		 	System.out.printf("%c",c+3);
			name2[i]=name1[i]+3;

		}
		System.out.println("");
		System.out.println("The dencrypted text is");
		for (int i = 0 ; i < name1.length ; i++){
			int c = name2[i] ; 
		 	System.out.printf("%c",c-3);
		}
}
}