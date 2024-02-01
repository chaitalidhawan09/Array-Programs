import java.util.Scanner;

public class ScannerClassEX {

	public ScannerClassEX()
	{
		
	
	}

	public static void main(String[] args)
	{

		 // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read a line of text
        System.out.print("Enter a line of text: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        // Read an integer
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt);

        // Read a double
        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();
        System.out.println("You entered: " + userDouble);

        // Remember to close the scanner to avoid resource leaks
        scanner.close();

	}

}
