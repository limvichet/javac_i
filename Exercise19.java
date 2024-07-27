
public class Exercise19 {

	public static void main(String[] args) {
	    for(int i=1; i<=1000; i++){
	    	System.out.print(i + ", ");
	        if(i == 5){
	            System.out.print("Loop Aborted");
	            break;
	        }
	    }
	    // output: 1, 2, 3, 4, 5, Loop Aborted

	}

}
