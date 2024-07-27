package PBook1;

public class Exercise44 {

	public static void main(String[] args) {
		
		PackageBook1.Book1[] objBook = new PackageBook1.Book1[4];
		objBook[0] = new PackageBook1.Book1( " Visual Basic 6.0 ", "IT" , "Jonh", "12 June 1998 "); 
		objBook[1] = new PackageBook1.Book1( " Data Structure", "IT" , "Koney", "12 October 1998"); 
		objBook[2] = new PackageBook1.Book1( " C++ Programming ", "IT" , "Smith", "20 May 1985"); 
		objBook[3] = new PackageBook1.Book1( " Java Programming", "IT" , "Kharo", "12 june 1998"); 
		for (int i =0 ; i < objBook.length ; i++) {
			objBook[i].showBookDetail1();
		}
	}

}
