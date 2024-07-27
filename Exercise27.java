import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) {
		
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Store input from user to array
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("The numbers are: ");

        // Print array elements
        for (int n = 0; n < 5; ++n) {
            System.out.print(numbers[n] + "  ");
        }

	}

}
