package Inheritance;

abstract class Shape4{ 
	private double width; 
	private double height; 
	private String name; 
	
	Shape4(){ 
		width=height=0.0; 
		name= "null"; 
	} 	
	Shape4(double w, double h, String n){ 
		width=w; height=h; name=n;		
	} 	
	Shape4(double x, String n){ 
		width=height=x; name=n; 
	} 	
	Shape4(Shape4 obj){ 
		width=obj.width; height=obj.height;
		name=obj.name; 
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
	String getName(){ 
		return name; 
	} 	
	void show(){ 
		System.out.println("Width = " +width+ " Height = " + height); 
	} 	
	abstract double area();
}

class Trianglee extends Shape4{ 
	private String style; 
	Trianglee (){ 
		super(); 
		style = "null"; 
	} 
	Trianglee (double w, double h, String s){ 
		super(w, h, "Triangle"); 
		style=s; 
	} 
	Trianglee (double x){ 
		super(x, "Triangle"); 
		style = "isosceles" ; 
	} 
	Trianglee (Trianglee obj){ 
		super(obj);
		style=obj.style; 
	} 
	double area(){ 
		return getWidth() * getHeight()/2; 
	} 
	void styleShow(){ 
		System.out.println( "Triangle is " + style); 
	}
}

class Rectangle extends Shape4{ 
	Rectangle(){ 
		super(); 
	} 
	Rectangle(double w , double h){ 
		super(w, h, "Rectangle"); 
	} 
	Rectangle(double x){ 
		super(x, "Rectangle"); 
	} 
	Rectangle(Rectangle obj){ 
		super(obj); 
	} 
	boolean isSquare(){ 
		if (getWidth()==getHeight()) return true; return false; 
	} 
	double area(){ 
		return getWidth() * getHeight(); 
	}
}

public class Exercise54 {

	public static void main(String[] args) {
		Shape4[] shapeObj = new Shape4[3]; 
		shapeObj[0]= new Trianglee(9.0, 11.0, "Right"); 
		shapeObj[1]= new Rectangle(11); 
		shapeObj[2]= new Rectangle(12,5); 
		for (int i =0 ; i<shapeObj.length ; i++){ 
			System.out.println( " Object shape is " + shapeObj[i].getName()); 
			System.out.println( "Area is " + shapeObj[i].area());
		}
	}

}
