package Assignment_Inheritance;

public class TotalSalary extends HraAndPf 
{
	int tot = 0;
	public void totalsa()
	{
		super.hra();
		
		super.pf();
		
		tot = bas+hra+pf-ded+bon;
		System.out.println("Employee total salary : "+tot);
	}
	public static void main(String[] args) 
	{
		TotalSalary obj = new TotalSalary();
		obj.basic();
		obj.totalsa();

	}

}
