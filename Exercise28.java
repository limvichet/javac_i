import java.util.Arrays;

public class Exercise28 {
    public static void main(String[] args) {
        // initialize an array without specifying size
        double[] numbers = {7, 5, 6, 12, 35, 27};

        double sum = 0;
        double count = 0;
        double average;

        System.out.print("The numbers are: ");

        // print array elements
        // use of enhanced for loop
        for (double n : numbers) {
            System.out.print(n + "  ");

            // calculate the sum
            sum += n;

            // count the no. of array elements
            count++;
        }

        // print the sum
        System.out.println("\nTheir Sum = " + sum);

        // find the average
        average = sum / count;
        System.out.println("Their Average = " + average);
    }
}

