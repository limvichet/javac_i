import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		int num1;
		
		// Create a Scanner object to read input from the user
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to input a number
		System.out.print("Input a number: ");
		  
		// Read and store the input number
		num1 = in.nextInt();
		
		System.out.print("Your number you input: " + num1);
	}

}
