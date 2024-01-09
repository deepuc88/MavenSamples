package Abstraction;

public class FullTimeEmployee extends Employee 
{
	@Override
	void calcsalary() 
	{
		int paymentperhour = 150;
		int sal = paymentperhour * 8;
		System.out.println("Full time employee salary : "+sal);
	}	
}
