package SamplePrograms;

import java.util.Scanner;
public class StringPalindrome 
{
	static String s;
	static String rev = "";
	
	public void reverse(String s) 
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of the string is : "+rev);
	}
	
	public void palin(String s, String rev) 
	{
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String is not palindrome");
	}

	public static void main(String[] args) 
	{
		StringPalindrome obj = new StringPalindrome();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the string : ");
		s = inp.nextLine();
		obj.reverse(s);
		obj.palin(s, rev);
	}

}
