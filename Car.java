package ClassObject;


//Define a simple class named 'Car'
public class Car 
{
	// Attributes or fields of the class
    String brand;
    String model;
    int year;
    
 // Constructor method
	public Car(String brand, String model, int year) 
	{
		this.brand = brand;
        this.model = model;
        this.year = year;
	
	}
	
	 // Method to display information about the car
	 public void displayInfo() 
	 {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	        System.out.println();
	   }

	public static void main(String[] args) 
	{
		 // Creating objects of the 'Car' class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Calling the displayInfo() method for each car object
        System.out.println("Information about Car 1:");
        car1.displayInfo();

        System.out.println("Information about Car 2:");
        car2.displayInfo();
		
	}

}
