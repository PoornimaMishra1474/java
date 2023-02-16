class Marksheet{
		public static void main (String args[]){
		double python,os,ds;
		python = Double.parseDouble(args[0]);
		os = Double.parseDouble(args[1]);
		ds = Double.parseDouble(args[2]);
		if (python >= 85){
			System.out.println ("Your grade is O in python");
		}else if (python <= 84 && python >=75){
			System.out.println ("Your grade is A+ in python");
		}else if (python <= 74 && python >=65){
			System.out.println ("Your grade is A in python");
		}else if (python <= 64 && python >=55){
			System.out.println ("Your grade is B+ in python");
		}else if (python <= 54 && python >=45){
			System.out.println ("Your grade is B in python");
		}else if (python <= 44 && python >=35){
			System.out.println ("Your grade is C in python");
		}else {
			System.out.println ("Sorry! you failed the python exam");
		}


		if (os >= 85){
			System.out.println ("Your grade is O in os");
		}else if (os <= 84 && os >=75){
			System.out.println ("Your grade is A+ in os");
		}else if (os <= 74 && os >=65){
			System.out.println ("Your grade is A in os");
		}else if (os <= 64 && os >=55){
			System.out.println ("Your grade is B+ in os");
		}else if (os <= 54 && os >=45){
			System.out.println ("Your grade is B in os");
		}else if (os <= 44 && os >=35){
			System.out.println ("Your grade is C in os");
		}else {
			System.out.println ("Sorry! you failed the os exam");
		}


		if (ds >= 85){
			System.out.println ("Your grade is O in ds");
		}else if (ds <= 84 && ds >=75){
			System.out.println ("Your grade is A+ in ds");
		}else if (ds <= 74 && ds >=65){
			System.out.println ("Your grade is A in ds");
		}else if (ds <= 64 && ds >=55){
			System.out.println ("Your grade is B+ in ds");
		}else if (ds <= 54 && ds >=45){
			System.out.println ("Your grade is B in ds");
		}else if (ds <= 44 && ds >=35){
			System.out.println ("Your grade is C in ds");
		}else {
			System.out.println ("Sorry! you failed the ds exam");
		}
			
		
		if (python<35 || os<35 || ds<35){
			System.out.println ("You Failed in an exam . Your CGPA will be calculated after the supplementary examination");
		}
		else{
			double total;
			total = (python+os+ds)/30;
			System.out.println ("Your CGPA :"+total);
		}
}
}