package Inheritance;

//Super Class 
class Shape1{ 
	private double width; 
	private double height; 
	double getWidth(){ return width; } 
	double getHeight(){ return height; } 
	
	public void setWidth(double width){ 
		this.width=width; 
	} 
	
	public void setHeight(double height){ 
		this.height=height; 
	} 
	
	public void showWH(){ 
		System.out.println("Width = " + this.width + " and Height = " + this.height); 
	} 
}

//Sub Class 
class Triangle1 extends Shape1{ 
	String style; 
	double area(){ 
		return (this.getWidth() * this.getHeight()) / 2; 
	} 
	void showStyle(){ 
		System.out.println(" The Style of Triangle is " + this.style ); 
	} 
}

public class Exercise48 {

	public static void main(String[] args) {

		Triangle1 obj = new Triangle1(); 
		obj.setWidth(4.0) ; 
		obj.setHeight(5.0) ; 
		obj.style = " isosceles "; 
		System.out.println(" All Information of Object "); 
		obj.showStyle(); 
		obj.showWH(); 
		System.out.println(" The Area = " + obj.area());
	}

}
