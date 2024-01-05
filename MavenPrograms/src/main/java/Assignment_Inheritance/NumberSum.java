package Assignment_Inheritance;

import java.util.Scanner;
public class NumberSum 
{
	int sum;
	public void sum()
	{
		NumberSum obj = new NumberSum();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = inp.nextInt();
		System.out.print("Enter the second number : ");
		int b = inp.nextInt();
		sum = a + b;
	}
}
