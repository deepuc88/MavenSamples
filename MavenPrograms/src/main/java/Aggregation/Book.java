package Aggregation;

public class Book 
{
	int price;
	String bookName;
	Author a;
	
	public Book(int price, String bookName, Author a) 
	{
		super();
		this.price = price;
		this.bookName = bookName;
		this.a = a;
	}
	
	void displayBook()
	{
		System.out.println("Book Name : "+bookName);
		System.out.println("Price : "+price);
		System.out.println("Author : "+a.authrName);
		System.out.println("Author place : "+a.place);
		System.out.println("Author age : "+a.age);
	}

	public static void main(String[] args) 
	{
		Author obj1 = new Author(24, "John", "Trivandrum");
		Book obj2 = new Book(299, "Test Book", obj1);
		obj2.displayBook();
	}
}
