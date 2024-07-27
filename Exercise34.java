class Vehicle1 { 
	int passengers ; // number of passengers 
	int fuelcap ; // fuel capacity in gallons 
	int mpg ; //fuel consumption in mile per gallon 	
	
	void range(){ 
		System.out.println("Range is " + this.fuelcap * this.mpg ); 
	}
}
public class Exercise34 {

	public static void main(String[] args) {
		Vehicle1 minibus = new Vehicle1(); 
		Vehicle1 minicar = new Vehicle1(); 
		minibus.passengers = 12; 
		minibus.fuelcap = 60 ; 
		minibus.mpg = 10 ; 
		minicar.passengers = 5; 
		minicar.fuelcap = 45 ; 
		minicar.mpg = 13 ; 
		System.out.println("Minibus can carry " + minibus.passengers ); 
		minibus.range(); 
		System.out.println("Minicar can carry " + minicar.passengers ); 
		minicar.range();
	}
}