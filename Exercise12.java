import java.util.Scanner;
public class Exercise12 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input charactor: ");
        char ch = in.next().charAt(0);
        
        switch(ch){
        case 'R':
        	System.out.println("Red"); 
        	break;
        case 'G':
        	System.out.println("Green"); 
        	break;
        case 'B':
        	System.out.println("Blue"); break;
        default:
        	System.out.println("Unknown color");
        }

	}

}
