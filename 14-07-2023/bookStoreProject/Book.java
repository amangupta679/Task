package bookstoreProject;

public class Book {
private int bookId ; 
public String bookTitle ; 
private String author  ; 
private int price  ; 
private String categories  ; 



public Book(int bookId, String bookTitle, String author, int price, String categories) {
	
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.author = author;
	this.price = price;
	this.categories = categories;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookTitle() {
	return bookTitle;
}

public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getCategories() {
	return categories;
}

public void setCategories(String categories) {
	this.categories = categories;
}




}
