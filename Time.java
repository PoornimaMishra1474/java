class Time{
		public static void main (String args[]){
		int time , hour , min , sec ,x;
		time = Integer.parseInt(args[0]);
		min = time/60;
		sec = time%60;
		hour = min /60;
		min = min % 60 ;
		System.out.println ("Total time in seconds is "+time);
		System.out.println ("hours: "+hour);
		System.out.println ("min: "+min);
		System.out.println ("sec: "+sec);
}
}