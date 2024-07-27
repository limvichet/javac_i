package Inheritance;

class Sup{ 
	void who(){ 
		System.out.println(" who in Sup "); 
	} 
} 

class Sup1 extends Sup{ 
	void who(){ 
		System.out.println(" who in Sup1 "); 
	} 
} 

class Sup2 extends Sup{ 
	void who(){ 
		System.out.println(" who in Sup2 "); 
	} 
}

public class Exercise53 {

	public static void main(String[] args) {
		Sup obj = new Sup(); 
		Sup1 obj1 = new Sup1(); 
		Sup2 obj2 = new Sup2(); 
		Sup objRef; 
		objRef = obj; 
		objRef.who(); 
		objRef = obj1; 
		objRef.who(); 
		objRef = obj2; 
		objRef.who();

	}

}
