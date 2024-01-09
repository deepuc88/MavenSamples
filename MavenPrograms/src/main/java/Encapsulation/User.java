package Encapsulation;

import java.util.Scanner;
public class User 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the pin number : ");
		int p = inp.nextInt();
		Bank b = new Bank();
		b.setPin(p);
		b.checkPin();
	}
}
