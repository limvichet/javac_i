import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		
		int number;
		int sum;
		// Create a Scanner object to read input from the user
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to input a number
		System.out.print("Enter a number: ");
		  
		// Read and store the input number
		number = in.nextInt();
		sum = 0;

        while (number >= 0) {
            // add all positive numbers
            sum += number;

            // take input again if the number is positive
            System.out.print("Enter a number: ");
            number = in.nextInt();
        }

        // display the sum
        System.out.print("\nThe sum is " + sum);

	}

}
