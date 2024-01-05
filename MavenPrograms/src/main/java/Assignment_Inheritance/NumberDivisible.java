package Assignment_Inheritance;

public class NumberDivisible extends NumberSum 
{
	public void numdiv() 
	{
		super.sum();
		System.out.println("Sum of the numbers is : "+sum);
		if(sum % 10 == 0)
		{
			System.out.println("Addition resutl is divisible by 10");
		}
		else
			System.out.println("Addition resutl is not divisible by 10");
	}
	public static void main(String[] args) 
	{
		NumberDivisible obj = new NumberDivisible();
		obj.numdiv();
		
	}
}
