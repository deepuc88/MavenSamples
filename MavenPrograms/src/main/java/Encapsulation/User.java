package Encapsulation;

public class User 
{
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.setPin(123);
		System.out.println("Pine number : "+b.getPin());
	}
}
