package bookstoreProject;

public class BookStore extends Book {
 Book[] bookArr ; 
private String StoreName ; 
private String location  ;
public BookStore(int bookId, String bookTitle, String author, int price, String categories, Book[] book,
String storeName, String location) {
	
	
	super(bookId, bookTitle, author, price, categories);
	this.bookArr = book;
	StoreName = storeName;
	this.location = location;
}

public Book[] getBook() {
	return bookArr;
}

public void setBook(Book[] book) {
	this.bookArr = book;
}
public String getStoreName() {
	return StoreName;
}
public void setStoreName(String storeName) {
	StoreName = storeName;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public void addBook(Book book) {
	for(int i = 0  ; i<5 ; i++) 
	{
		if(bookArr[i] == null) 
		{
			bookArr[i]=book ; 
			
		}
		
	}
	
}
public boolean searchBookByTitle(String bookTitle) {
	for(int i = 0 ; i<5 ; i++) {
		if(bookArr[i].bookTitle==bookTitle) {
			
			return true ; 
			
		}
		
	}
	return false;
}

public boolean BookByCategories(String categories,Book book) {
	
	for(int i = 0 ; i<5 ; i++) {
		if(categories.equals(book.getCategories()));
		return true;
	}
	return false ; 
}

	public void ShowAllBooks() {
		Book[] book  = getBook();
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("Book number" +i);
			System.out.println("Book id :-" + book[i].getBookId());
			System.out.println("boo title:-" + book[i].getBookTitle());
			System.out.println("boo title:-" + book[i].getAuthor());
			System.out.println("boo title:-" + book[i].getPrice());
		    
		System.out.println(".............................");
		
		}
	}
	
}



