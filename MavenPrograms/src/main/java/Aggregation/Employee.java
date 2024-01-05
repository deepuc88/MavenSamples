package Aggregation;

public class Employee 
{
	int empId;
	String empName;
	Car c;
	Bike b;
		
	public Employee(int empId, String empName, Car c, Bike b) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.c = c;
		this.b = b;
	}

	void display()
	{
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Car : "+c.carName);
		System.out.println("Bike : "+b.bikeName);
	}

	public static void main(String[] args) 
	{
		Car obj1 = new Car(11, "Tata Harrier", "Black");
		Bike obj2 = new Bike(10, "TVS Appache RTR 200");
		Employee obj3 = new Employee(101, "Peter", obj1, obj2);
		obj3.display();
	}
}
