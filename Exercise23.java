
public class Exercise23 {

	  // method with no parameter
	  public void display1() {
	    System.out.println("Method without parameter");
	  }

	  // method with single parameter
	  public void display2(int a) {
	    System.out.println("Method with a single parameter: " + a);
	  }

	  public static void main(String[] args) {
	    
	    // create an object of Main
		  Exercise23 obj = new Exercise23();

	    // calling method with no parameter
	    obj.display1();
	    
	    // calling method with the single parameter
	    obj.display2(24);
	  }
}
