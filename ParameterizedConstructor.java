package Constructors;

public class ParameterizedConstructor
{
	String name;
    int age;

    
    // Parameterized constructor
	public ParameterizedConstructor( String name ,int age)
	{
		this.name=name;
		this.age=age;
		
		 System.out.println("A new person or Person info  has been created: " + name + ", " + age + " years old.");
	
	}

	public static void main(String[] args) 
	
	{

		// Creating an object of the Person class using the parameterized constructor
		ParameterizedConstructor person1 = new ParameterizedConstructor("John", 25);
		ParameterizedConstructor person2 = new ParameterizedConstructor("Alice", 30);
		
	}

}
