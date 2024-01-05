package Inheritance;

public class Square extends Rectangle 
{
	public void display()
	{
		super.display();
		System.out.println("Square is a rectangle");
	}	
	public static void main(String args[])
	{
		Square obj1 = new Square();
		//obj1.display();
		obj1.display();
	}
}
