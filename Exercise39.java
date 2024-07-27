class OverLoad{ 
	int sum( int x , int y){ 
		return x+y ; 
	} 
	int sum( int x , int y, int z){ 
		return x+y+z ; 
	}
	float sum( int x , float y){ 
		return x+y ; 
	} float sum( float x , float y){ 
		return x+y ; 
	} 
	double sum( double x , float y){ 
		return x+y ; 
	}
}
public class Exercise39 {

	public static void main(String[] args) {
		OverLoad obj = new OverLoad(); 
		System.out.println( obj.sum(10, 20 )); 
		System.out.println( obj.sum(10.0 , 20)); 
	}

}
