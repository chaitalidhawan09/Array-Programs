package MethodsOrFunctions;

public class Methods 
{

	public Methods() 
	{

	
	}
	// Method without parameters and return value
    static void greet() 
    {
        System.out.println("Hello, Java!");
    }
    
    
 // Method with parameters and return value
    static int add(int a, int b) 
    {
        return a + b;
    }

    // Method with a parameter and default value
    static void printMessage(String message, int times) 
    {
        for (int i = 0; i < times; i++) 
        {
            System.out.println(message);
        }
    }

    
 // Method with a variable number of parameters
    static int sum(int... numbers)
    {
        int result = 0;
        for (int num : numbers)
        {
            result += num;
        }
        return result;
    }

    
 // Recursive method to calculate factorial
    static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } 
        else
        {
            return n * factorial(n - 1);
        }
    }

    
    
	public static void main(String[] args)
	{
		// Calling the greet method
        greet();
        
       // Calling the add method
        int sumResult = add(5, 7);
        System.out.println("Sum: " + sumResult);
        
        // Calling the printMessage method
        printMessage("Java is fun!", 3);
        
        
        
        // Calling the sum method with a variable number of parameters
        int total = sum(1, 2, 3, 4, 5);
        System.out.println("Total sum: " + total);

        // Calling the factorial method
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);
        

	}

}
