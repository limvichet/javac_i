class Vehicle2 { 
	int passengers ; // number of passengers 
	int fuelcap ; // fuel capacity in gallons 
	int mpg ; //fuel consumption in mile per gallon 
	
	int range(){ 
		return ( this.fuelcap * this.mpg ); 
	}
}
public class Exercise35 {

	public static void main(String[] args) {
		Vehicle2 minibus = new Vehicle2(); 
		Vehicle2 minicar = new Vehicle2(); 
		minibus.passengers = 12; 
		minibus.fuelcap = 60 ; 
		minibus.mpg = 10 ; 
		minicar.passengers = 5; 
		minicar.fuelcap = 45 ; 
		minicar.mpg = 13 ; 
		System.out.println("Minibus can carry " + minibus.passengers + " with the range of " + minibus.range() ); 
		System.out.println("Minicar can carry " + minicar.passengers + " with the range of " + minicar.range() );

	}

}
