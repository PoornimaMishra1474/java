//Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. Add an instance variable named department to the manager class. Supply a test program that uses theses classes and methods.   


class Employee {
	String name;
	String empid ;
	int salary ;
	Employee(){}
	Employee(String name , String empid , int salary ){
		this.name = name ;
		this.empid = empid;
		this.salary = salary;
	}
	void get_name(){
		System.out.println("Name : "+this.name);
	}
	void get_salary(){
		System.out.println("Salary : "+this.salary);
	}
	void increaseSalary(int percent){
		this.salary = this.salary + ((percent /100)*this.salary);
	}
}
class Manager extends Employee{
	String department ; 
	Manager(String n,String e,int s,String d)
	{
		super(n,e,s);
		this.department=d;
	}
	public static void main (String args[]){
		Manager E1 = new Manager("Poornima" ,"50stu.upes" , 20000,"HR");
	E1.get_name();
	E1.get_salary();
	E1.increaseSalary( 10);

}
}