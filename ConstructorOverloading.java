package Constructors;

    class Book {
    String title;
    String author;

    // Parameterized constructor
    public Book(String t, String a) {
        title = t;
        author = a;
        System.out.println("A new book has been created: " + title + " by " + author);
    }

    // Constructor overloading with a different parameter list
    public Book(String t) {
        title = t;
        System.out.println("A new book has been created: " + title);
    }
}



public class ConstructorOverloading
{

	public static void main(String[] args)
	{
		// Creating objects of the Book class using different constructors
        Book book1 = new Book("Partipchandra", "Dr.prakash Koyade");
        Book book2 = new Book("Shodh");
    
	}

}
