class PrivatePublic{ 
	private int x; // private access 
	public int y ; // public access 
	int z ; // default access 
	void setX(int x){ 
		this.x=x; 
	} 
	int getX(){ 
		return x; 
	} 
}
public class Exercise41 {

	public static void main(String[] args) {
		PrivatePublic obj = new PrivatePublic(); 
		// obj.x =10 ; 
		obj.setX(20); 
		obj.y=30; 
		obj.z=40; 
		System.out.println(" X value = " + obj.getX()); 
		System.out.println(" Y value = " + obj.y); 
		System.out.println(" Z value = " + obj.z);
	}

}
