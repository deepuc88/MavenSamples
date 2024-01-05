package Interface;

public class InterfaceMultipleInherit implements Interface1, Interface2 
{
	@Override
	public void draw() 
	{
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance in Interface");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InterfaceMultipleInherit obj = new InterfaceMultipleInherit();
		obj.draw();
		Interface1 in1 = new InterfaceMultipleInherit();
		in1.draw();
	}
}
