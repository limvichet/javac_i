package Inheritance;

final class A{ 
	 void myMethod(){ 
		System.out.println( " This is the Final Methods "); 
	} 
} 

class B extends A{ // error B can‟t extends from A, because A is FINAL
	void myMethod(){ 
		System.out.println( "This method will error "); 
	}
}
	
public class Exercise55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
