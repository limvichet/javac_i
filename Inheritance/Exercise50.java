package Inheritance;

class Shape3{ 
	private double width; 
	private double height; 
	
	Shape3( double w, double h){ 
		width = w; height = h ; 
	} 
	
	double getWidth(){ 
		return width; 
	} 
	
	double getHeight(){ 
		return height; 
	} 
	
	void setWidth(double w){ 
		width=w; 
	} 
	
	void setHeight(double h){ 
		height=h; 
	} 
	
	void showWH(){ 
		System.out.println("Width = " + width + " and Height = " + height); 
	} 
	} // Sub Class 

class Triangle3 extends Shape3{ 
	private String style; 
	
	Triangle3(String s, double w, double h){ 
		super (w , h) ; // call supper class constructor 
		style = s ; 
	} 
	
	double area(){ 
		return (getWidth() * getHeight()) / 2; 
	} 
	
	void showStyle(){ 
		System.out.println(" The Style of Triangle is " + style ); 
	} 	
}

public class Exercise50 {

	public static void main(String[] args) {
		Triangle3 obj = new Triangle3("isosceles " , 5.0, 8.0); 
		System.out.println(" All Information of Object "); 
		obj.showStyle(); obj.showWH(); 
		System.out.println(" The Area = "+obj.area());
	}

}
