package Inheritance;

class A1{ 
	int i , j ; 
	
	A1( int a, int b){ 
		i=a; j=b; 
	} 
	
	void show(){ 
		System.out.println(" i = " + i); 
		System.out.println(" j = " + j); 
	} 
} 

class B1 extends A1{ 
	int k; 
	
	B1(int a, int b, int c){ 
		super(a,b);
		k=c; 
	} 
	
	void show(){ 
		System.out.println(" k : " + k); 
	}
}

public class Exercise52 {

	public static void main(String[] args) {
		B1 obj = new B1(6,4,7); 
		obj.show(); // this method show in class B;
	}

}
