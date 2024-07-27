class Bird { 
	int xPos, yPos; 
	double fly(int xPos, int yPos ) { 
		double distance = Math.sqrt( xPos*xPos + yPos*yPos );
		this.xPos = xPos; 
		this.yPos = yPos; 
		return distance;
	}
}
public class Exercise37 {

	public static void main(String[] args) {
		Bird b=new Bird();
		System.out.println(b.fly(3, 6)); 
	}

}
