package Inheritance;

//Super Class 
class Shape{ 
	double width; 
	double height; 
	void showWH(){ 
		System.out.println("Width = " + this.width + " and Height = " + this.height); 
	} 
}

//Sub Class 
class Triangle extends Shape{ 
	String style; 
	double area(){ 
		return (width * height) / 2; 
	} 
	void showStyle(){ 
		System.out.println(" The Style of Triangle is " + style ); 
	}
}

public class Exercise47 {

	public static void main(String[] args) {
		
		Triangle obj = new Triangle (); 
		obj.width = 4.0 ; 
		obj.height = 5.0 ; 
		obj.style = " isosceles "; 
		System.out.println(" All Information of Object "); 
		obj.showStyle(); 
		obj.showWH(); 
		System.out.println(" The Area = "+obj.area());

	}

}
