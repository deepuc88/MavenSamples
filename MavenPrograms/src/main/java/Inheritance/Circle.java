package Inheritance;

public class Circle extends Shape {

	public void display()
	{
		super.display();
		System.out.println("This is circular shape");
	}	
	public static void main(String args[])
	{
		Circle obj = new Circle();
		obj.display();
	}

}
