import java.util.Scanner;
public class Exercise09 {
    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();

        if (input >= 0)
        {
            System.out.println("Number is positive");
        }
     
        System.out.println("This statement is always executed");
    }
}
