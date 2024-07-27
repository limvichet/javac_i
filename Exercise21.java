
public class Exercise21 {

	  // create a method
	  public int addNumbers(int a, int b) {
	    int sum = a + b;
	    // return value
	    return sum;
	  }

	  public static void main(String[] args) {
	    
	    int num1 = 25;
	    int num2 = 15;

	    // create an object of Main
	    Exercise21 obj = new Exercise21();
	    // calling method
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	  }
}
