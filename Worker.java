//Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.

import java.util.Scanner ; 
class Worker {
	String name = " ";
	int salary_rate= 0 ; 
	void CpmPay( ){
	}
	public static void main (String args[]){
		int days , d_sal , s_sal ;
		Scanner sc = new Scanner(System.in);

		DailyWorker W1 = new DailyWorker();
		SalariedWorker W2 = new SalariedWorker();

		System.out.println("Enter the number of days a daily worker works");
		days = sc.nextInt();

		System.out.println("Enter the salary per hour for a daily worker");
		d_sal = sc.nextInt();

		W1.CpmPay(days , d_sal );

		System.out.println("Enter the salary per hour for a salaried worker");
		s_sal = sc.nextInt();

		W2.CpmPay(s_sal );
}
}
class DailyWorker extends Worker{
		Scanner sc = new Scanner(System.in);
		void CpmPay(int days , int sal ){
		int Total_salary , hours;
		System.out.println("Enter the hours per day ");
		hours = sc.nextInt();
		Total_salary = days*sal*hours ;
		System.out.println("The total salary of worker 1 is "+Total_salary );
	}
}
class SalariedWorker extends Worker{
		void CpmPay( int sal ){
		int Total_salary ;
		Total_salary = 40*sal ;
		System.out.println("The total salary of worker 2 is "+Total_salary );
	}
}