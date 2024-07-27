
public class Exercise20 {

	public static void main(String[] args) {
		
	    for(int i=1; i<=20; i ++){
	        if(i == 5 || i == 9 || i == 10){
	            continue;
	        }
	        System.out.print(i + ", ");
	    }
	    // output: 1, 2, 3, 4, 6, 7, 8, 11, 12, …, 1000,
	    // skip: 5, 9, 10,

	}

}
