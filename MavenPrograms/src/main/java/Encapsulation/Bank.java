package Encapsulation;

public class Bank 
{
	private int pin;

	public int getPin() 
	{
		return pin;
	}

	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	
	public void checkPin() 
	{
		if(pin == 1001)
		{
			System.out.println("Correct Pin number");
		}
		else if(pin == 1234)
		{
			System.out.println("Correct Pin number");
		}
		else if(pin == 1212)
		{
			System.out.println("Correct Pin number");
		}
		else
			System.out.println("Wrong Pin number");
	}
}
