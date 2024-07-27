class MethodWithParamet{ 
	int addTwoNumber(int a, int b){ 
		return (a+b); 
	} 
	int minusTwoNumber(int a , int b){ 
		return (a-b); 
	} 
	int multTwoNumber(int a , int b){ 
		return (a*b); 
	} 
	int divTwoNumber(int a , int b){ 
		return (a/b); 
	} 
}
public class Exercise36 {

	public static void main(String[] args) {
		
		MethodWithParamet obj=new MethodWithParamet(); 
		int a, b ; 
		a=2;
		b=3;
		System.out.println( a + " + " + b +" = " +obj.addTwoNumber(a,b)); 
		System.out.println( a + " - " + b +" = " +obj.minusTwoNumber(a,b)); 
		System.out.println( a + " * " + b +" = " +obj.multTwoNumber(a,b)); 
		System.out.println( a + " / " + b +" = " +obj.divTwoNumber(a,b));

	}

}
