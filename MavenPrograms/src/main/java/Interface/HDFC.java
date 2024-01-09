package Interface;

import java.util.Scanner;
public class HDFC implements RBI 
{	
	public void reccuringDeposit(int amt, int dur) 
	{
		int intrst = ((interest*amt)/100)*dur;
		amt = amt + intrst;
		System.out.println("Interest : "+intrst);
		System.out.println("Amount : "+amt);
	}

	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the amount to deposit : ");
		int amt = inp.nextInt();
		System.out.print("Enter the duration : ");
		int dur = inp.nextInt();
		RBI r = new HDFC();
		r.reccuringDeposit(amt, dur);
	}
}
