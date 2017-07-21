import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
    
		Random rand = new Random () ;
		int numberToGuess = rand.nextInt (10000);
		int numberOfTries = 0;
		Scanner Input = new Scanner(System.in);
		int guess;
		boolean win = false;
		
		while (win == false) {

		    System.out.println("Guess a number between 1 and 10000: ");
		    guess = Input.nextInt ();
		    numberOfTries++;
		
		if (guess == numberToGuess) {
			 System.out.println("You win");
			 System.out.println("The number was " + numberToGuess);
			
		}
		else if (guess < numberToGuess) {
		    System.out.println("Your guess is too low");
		}
		else if (guess > numberToGuess) {
			System.out.println("Your guess is too high");
		}
	
  

	}
}
}

