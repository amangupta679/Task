package bookstoreProject;

public class Main {

	public static void main(String[] args) {
		
	Book[] book = new Book[5];
	// int bookId, String bookTitle, String author, int price, String categories
	book[0] = new Book(1,"aman","ONE",10,"rom");
	BookStore bookStore = new BookStore(0, "aman", "aman1", 100, "aman2", book, "ABC", "HYD");

    try {
        bookStore.addBook(book[0]);
        bookStore.addBook(book[0]);
        bookStore.addBook(book[0]);
        bookStore.addBook(book[0]);
        bookStore.addBook(book[0]);
        

    } catch (MyException e) {
        System.out.println(e.getMessage());
    }

   bookStore.ShowAllBooks();

}
	








		
	

}
