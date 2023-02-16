class Time2{
	public static void main (String args[]){
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		int count_l =0;
		int count_y =0;
		if (year != 1970){
			count_y = year-1970;}
		else {
			count_y=0; }
		int Tdays = count_y*365;
		int array[]= {31 , 28 , 31 , 30 , 31 , 30 ,31 ,31,30 , 31 , 30 , 31};
		if (month==1){ 
			 }
		else{
			for(int i = 0 ; i<month-1 ; i++){
				Tdays=Tdays+array[i];} }
		Tdays = Tdays + day;
		for ( int a = 1970 ; a<=year ;a++ ){
			if (a%4==0){
				if (a%100==0){
					if (a%400==0){
						count_l=count_l + 1 ;	
					}
					else{	}	
				}
				else{
					count_l=count_l + 1 ;		}	
			}
			else{	}
		 }
		Tdays = Tdays + count_l;
		System.out.println ("number of days Form 1st jan 1970 are "+Tdays);
}
}
