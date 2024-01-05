package Assignment_Inheritance;

public class HraAndPf extends BasicPay 
{
	int hra = 0;
	int pf = 0;
	public void hra()
	{
		hra = (super.bas*5)/100;
		System.out.println("HRA amount is : "+hra);
	}
	public void pf()
	{
		pf = (super.bas*20)/100;
		System.out.println("PF amount is : "+pf);
	}
}
