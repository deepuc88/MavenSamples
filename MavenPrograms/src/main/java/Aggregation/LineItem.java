package Aggregation;

public class LineItem 
{
	int qty;
	Product pr;
	
	public LineItem(int qty, Product pr) {
		super();
		this.qty = qty;
		this.pr = pr;
	}

	void display()
	{
		System.out.println("ID : "+pr.id+", Name : "+pr.name+", Description : "+pr.description+", Quantity : "+ qty);
	}
	public static void main(String[] args) 
	{
		Product p = new Product(111, "Speaker", "For music");
		LineItem l = new LineItem(2, p);
		l.display();
	}
}
