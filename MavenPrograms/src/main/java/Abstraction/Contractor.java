package Abstraction;

public class Contractor extends Employee 
{
	int paymentperhour = 100;
	int workHours = 6;
	int sal;
	void calcsalary() 
	{
		sal = paymentperhour * workHours;
		System.out.println("Employee salary : "+sal);
	}
	
	public static void main(String[] args) 
	{
		Employee e = new Contractor();
		Employee e1 = new FullTimeEmployee();
		e.calcsalary();
		e1.calcsalary();
	}
}
