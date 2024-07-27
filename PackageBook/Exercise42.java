package PackageBook; 
class Book{ 
	private String title; 
	private String author; 
	private String category; 
	private String publicDate; 
	Book(String title, String category, String author, String publicDate){ 
		this.title = title; 
		this.author = author; 
		this.category = category; 
		this.publicDate = publicDate; 
	} 
	void showBookDetail(){ 
		System.out.println("Book title = " + title); 
		System.out.println("Book Category = " + category); 
		System.out.println("Author by = " + author); 
		System.out.println("Public on date = " +publicDate); } 
	}

	public class Exercise42 {

		public static void main(String[] args) {
			Book[] objBook = new Book[4]; 			
			objBook[0] = new Book( " Visual Basic 6.0 ", "IT" , "Jonh", "12 June 1998 "); 
			objBook[1] = new Book( " Data Structure", "IT" , "Koney", "12 October 1998"); 
			objBook[2] = new Book( " C++ Programming ", "IT" , "Smith", "20 May 1985"); 
			objBook[3] = new Book( " Java Programming", "IT" , "Kharo", "12 june 1998"); 
			for (int i =0 ; i < objBook.length ; i++) {
				objBook[i].showBookDetail();
			}
	}

}
