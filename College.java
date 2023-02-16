import java.util.Scanner ; 
class section{
	double SGPA(){
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		System.out.println("Enter the number of subjects ");
		String n1= sc.nextLine();  
		int n = Integer.parseInt(n1);
		for (int i = 0 ; i< n ; i++){
			System.out.println("Enter the marks out of 100 for subjects " +(i+1));
			String marks1= sc.nextLine();
			int marks = Integer.parseInt(marks1);
			sum = sum + marks ; 
		}
		double avg = sum /n ;
		double sgpa = avg /10 ;
		System.out.println("Your SGPA is "+sgpa);
		System.out.println("");
		return sgpa;
	}
}
class College extends section{
	String name ,school; 
	int SAP_ID , sem ;
	static String  c_name = "University of Petroleum & Energy Studies";
	public College(String name ,String school , int SAP_ID , int sem){
		this.name = name ;
		this.school = school ;
		this.SAP_ID = SAP_ID ;
		this.sem = sem ;
	}
	void feePerSem(){
		Scanner sc = new Scanner(System.in);
		System.out.println("choose \n\t 1.School of Computer Science \n\t 2.School of Design \n\t 3.School of Health Science \n\t 4.School of Business \n\t 5.School of Law");
		String choice= sc.nextLine();  

		int fees ;
		float dis = Scholarship();
		switch (choice){
			case "1" :
				fees=180000;
				double t_dis = (dis * fees)/100 ; 
				double t_fees = fees - t_dis ;
				System.out.println("Fees for School of Computer Science "+fees);
				System.out.println("Your fees after scholarship " +t_fees);
				System.out.println("");
			break;

			case "2" :
				fees=210000;
				t_dis = (dis * fees)/100 ; 
				t_fees = fees - t_dis ;
				System.out.println("Fees for School of Design "+fees);
				System.out.println("Your fees after scholarship "+t_fees);
				System.out.println("");
			break;

			case "3" :
				fees=170000;
				t_dis = (dis * fees)/100 ; 
				t_fees = fees - t_dis ;
				System.out.println("Fees for School of  Health Science "+fees);
				System.out.println("Your fees after scholarship "+t_fees);
				System.out.println("");
			break;

			case "4" :
				fees=130000;
				t_dis = (dis * fees)/100 ;  
				t_fees = fees - t_dis ;
				System.out.println("Fees for School of Business "+fees);
				System.out.println("Your fees after scholarship "+t_fees);
				System.out.println("");
			break;

			case "5" :
				fees=200000;
				t_dis = (dis * fees)/100 ; 
				t_fees = fees - t_dis ;
				System.out.println("Fees for School of Law "+fees);
				System.out.println("Your fees after scholarship "+t_fees);
				System.out.println("");
			break;

			default :
				System.out.println("Wrong Input");
				System.out.println("");
			break;

		}
	}
	
	void display(College obj){
		System.out.println("The name of the student is "+obj.name);
		System.out.println("The school of the student is "+obj.school);
		System.out.println("The Sap ID of the student is "+obj.SAP_ID );
		System.out.println("The student is in semester "+obj.sem );
		System.out.println("The college of the student is "+c_name);
		System.out.println("");
	}

	void result (){
		double grade = SGPA();
		if (grade>=5){
			System.out.println("You pass");
		}
		else{
			System.out.println("You fail");
		}
	}
	
int Scholarship(){
		double grade = SGPA();
		if (grade <= 10 && grade >=9 ){
			int scholarship = 20 ; 
			System.out.println("You got the scholarship of 20%");
			return scholarship ;
		}
		else if (grade < 9 && grade >=8){
			int scholarship = 10 ; 
			System.out.println("You got the scholarship of 10%");
			return scholarship ;
		}
		else {
			int scholarship = 0 ; 
			System.out.println("You are not eligible for any kinds of scholarship");
			return scholarship ;
		}		
	}
	public static void main (String args[]){
		College student = new College("Poornima Mishra" , "School of Computer Science" , 500095274 , 3);
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("Choose : what action do you want to perform ? ");
			System.out.println("		1.Want to know your per semester fees");
			System.out.println("		2.Display your details");
			System.out.println("		3.Your SGPA for the semester");
			System.out.println("		4.Final result (Pass/Fail)");
			System.out.println("		5.Know your scholarship according to your grades");
			System.out.println("		6.Exit");
			String decission= sc.nextLine(); 
			switch(decission){
				case "1":
					student.feePerSem();
				break;

				case "2":
					student.display(student);
				break;

				case "3":
					student.SGPA();
				break;

				case "4":
					student.result();
				break;
				case "5":
					student.Scholarship();
				break;

				case "6":
					System.exit(0);
				break;

				default:
					System.out.println("Wrong Input");
				break;
			}
		}
	}
}




