class DemoConstructor{ 
	int x ; 
	int y ; 
	DemoConstructor(){ 
		x=10; y=1 ; 
	} 
	int multiple (){ 
		return x* y ; 
	} 
}

public class Exercise40 {

	public static void main(String[] args) {
		DemoConstructor obj = new DemoConstructor(); 
		System.out.println(" Before assign X and Y value "); 
		System.out.println(" X= " + obj.x); 
		System.out.println(" Y= " + obj.y); 
		System.out.println(" Multiple X and Y = " + obj.multiple() ); obj.x=12; obj.y=4; 
		System.out.println("After assign X and Y value "); 
		System.out.println(" X= " + obj.x); 
		System.out.println(" Y= " + obj.y); 
		System.out.println(" Multiple X and Y = " + obj.multiple() );
	}

}
