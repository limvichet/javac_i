class VarMethStatic{ 
	static int x; 
	static int y; 
	static int add(){ 
		return x+y; 
	} 
}

public class Exercise38 {

	public static void main(String[] args) {
		VarMethStatic.x = 10 ; 
		VarMethStatic.y = 12 ; 
		System.out.println(VarMethStatic.x + " + " + VarMethStatic.y + " = " + VarMethStatic.add() ) ;
	}

}
