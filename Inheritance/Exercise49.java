package Inheritance;

//Super Class 
class Shape2{ 
	private double width; 
	private double height; 
	
	double getWidth(){ 
		return width; 
	} 
	
	double getHeight(){ 
		return height; 
	}
	
	void setWidth( double w){ 
		this.width=w; 
	} 
	
	void setHeight( double h){ 
		this.height=h; 
	} 
	
	void showWH(){ 
		System.out.println("Width = " + this.width + " and Height = " + this.height); 
	} 
}

//Sub Class 
class Triangle2 extends Shape2{ 
	String style; 
	Triangle2(String s, double w, double h){ 
		this.style = s ; 
		setWidth(w); 
		setHeight(h); 
	} 
	
	double area(){ 
		return (getWidth() * getHeight()) / 2; 
	} 
	
	void showStyle(){ 
		System.out.println(" The Style of Triangle is " + style ); 
	} 
}

public class Exercise49 {

	public static void main(String[] args) {
		Triangle2 obj = new Triangle2("isosceles ", 5.0, 8.0); 
		System.out.println(" All Information of Object "); 
		obj.showStyle(); 
		obj.showWH(); 
		System.out.println(" The Area = "+obj.area());

	}

}
