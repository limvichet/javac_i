package Inheritance;

class A{ 
	int i; 
} 

class B extends A{ 
	int i ; 
	
	B(int a , int b){ 
		super.i=a; 
		i = b ; 
	} 
	
	void show(){ 
		System.out.println("i in super class : " + super.i); 
		System.out.println(" i in sub class : " + i ); 
	} 
}

public class Exercise51 {

	public static void main(String[] args) {
		B obj = new B(4,5); 
		obj.show();
	}

}
