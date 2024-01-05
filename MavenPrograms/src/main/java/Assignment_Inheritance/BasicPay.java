package Assignment_Inheritance;

import java.util.Scanner;
public class BasicPay 
{
	int bas = 0;
	int ded = 0;
	int bon = 0;
	public void basic()
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the basic pay : ");
		bas = inp.nextInt();
		System.out.print("Enter the deduction : ");
		ded = inp.nextInt();
		System.out.print("Enter the bonus : ");
		bon = inp.nextInt();
	}
}
