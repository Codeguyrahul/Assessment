package lab_2march;




	public class main {
	    public static void main(String[] args) {
	        Library library = new Library();
	        library.addBook(1, "The Great Gatsby", "F. Scott Fitzgerald");
	        library.addBook(2, "To Kill a Mockingbird", "Harper Lee");
	        library.addBook(3, "1984", "George Orwell");
	        library.dispenseBook(2);
	        library.dispenseBook(4);
	    }
	}
