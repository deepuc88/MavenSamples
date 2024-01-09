package Interface;

public class Rectangle implements Polygon 
{	
	public void getArea(int l, int b)
	{		
		int a = l * b;
		System.out.println("Area of Rectangle : "+a);
	}
	
	public static void main(String[] args) 
	{
		int b = 5;
		int l = 7;
		Polygon p = new Rectangle();
		p.getArea(l, b);
	}
}
