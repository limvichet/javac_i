package PackageBook1; 

public class Book1{ 
	
	private String title; 
	private String author; 
	private String category; 
	private String publicDate; 
	
	public Book1(String title, String category, String author, String publicDate){ 
		this.title = title; 
		this.author = author; 
		this.category = category; 
		this.publicDate = publicDate; 
	} 
	
	public void showBookDetail1(){ 
		System.out.println("Book title = " + title); 
		System.out.println("Book Category = " + category); 
		System.out.println("Author by = " + author); 
		System.out.println("Public on date = " +publicDate); 
	}	

}
