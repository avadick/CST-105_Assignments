import java.util.Scanner;

//Ava Dick
public class ProgramExerciseTwo {

	public static void main(String[] args) {
		// Prompts user for Fahrenheit and converts to Celsius
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");	
	
		// Prompts user for Celsius and converts to Fahrenheit
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius1 = input1.nextDouble();
		
		// Convert Celsius to Fahrenheit
		double fahrenheit1 = celsius1 * (9.0 / 5.0) + 32;
		System.out.println("Celsius " + celsius1 + " is " + fahrenheit1 + " in Fahrenheit");
		
	}
}
