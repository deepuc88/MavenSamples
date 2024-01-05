package Inheritance;

public class Rectangle extends Shape 
{
	public void display()
	{
		super.display();
		System.out.println("This is rectangular shape");
	}	
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		obj.display();
	}
}
