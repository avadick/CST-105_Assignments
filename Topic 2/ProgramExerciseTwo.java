//Ava Dick
import java.util.Scanner;

public class ProgramExerciseTwo {

	// This program prompts user to enter a five digit positive integer and takes the sum of the digits
			public static void main(String[] args) {
		        
		    long n = 0;
			int sum = sumDigits(n) ;
		    System.out.println("The sum is: " + sum);
		    }// main
			
			    public static int sumDigits(long n) {
			    	    Scanner input = new Scanner(System.in) ;
			    	    
			    	    //prompts user for integer
			    	    System.out.println("Enter a five digit positive integer");
			    	    n = input.nextLong();
			    	    int num = (int) (n);
			    	    	int sum = 0;
			    	    	
			    	    	
			    	    	while(num > 0)  {
			    	    		
			    	    	sum += num % 10;
			    	    	num = num / 10;
			    	    	
			    	    	}//loop
			    	    	return sum;
			    }//sumDigits

		}///class