package Aggregation;

public class StudentAddress 
{
	String addr;
	Student st;

	public StudentAddress(String addr, Student st) 
	{
		super();
		this.addr = addr;
		this.st = st;
		
	}
	
	void display()
	{
		System.out.println("Student Name : "+st.name);
		System.out.println("Roll No : "+st.rol);
		System.out.println("Address : "+addr);
	}
	public static void main(String[] args) 
	{
		Student s = new Student(101, "Peter");
		StudentAddress sa = new StudentAddress("CHMM College", s);
		sa.display();
	}

}
