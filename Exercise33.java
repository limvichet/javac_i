class Vehicle { 
	int passengers ; // number of passengers 
	int fuelcap ; // fuel capacity in gallons 
	int mpg ; //fuel consumption in mile per gallon 	
}

public class Exercise33 {

	public static void main(String[] args) {
		Vehicle minibus = new Vehicle(); 
		Vehicle minicar = new Vehicle(); 
		int range1, range2; 
		minibus.passengers = 12; 
		minibus.fuelcap = 60 ; 
		minibus.mpg = 10 ; 
		minicar.passengers = 5; 
		minicar.fuelcap = 45 ; 
		minicar.mpg = 13 ; 
		range1 = minibus.fuelcap * minibus.mpg ; 
		range2 = minicar.fuelcap * minicar.mpg ; 
		System.out.println("Minibus can carry " + minibus.passengers + " with the range of " + range1 ); 
		System.out.println("Minicar can carry " + minicar.passengers + " with the range of " + range2 );
	}

}
