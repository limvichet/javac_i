import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to input a number
		System.out.print("Enter a positive integer: ");
		  
		// Read and store the input number
		int num = in.nextInt();
		int sum = 0;
		
        for (int i = 1; i <= num; ++i) {
            sum += i;
        }
        
        System.out.print("Sum = " + sum);
        
	}

}
