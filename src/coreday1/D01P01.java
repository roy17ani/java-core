package coreday1;

public class D01P01 {
		static class Book {
	        private String title;
	        private double price;

	        // Constructor
	        public Book(String title, double price) {
	            this.title = title;
	            this.price = price;
	        }

	        // Getter and Setter methods for title
	        public String getTitle() {
	            return title;
	        }

	        public void setTitle(String title) {
	            this.title = title;
	        }

	        // Getter and Setter methods for price
	        public double getPrice() {
	            return price;
	        }

	        public void setPrice(double price) {
	            this.price = price;
	        }
	    }

	    // Method to create a Book object
	    public static Book createBook(String title, double price) {
	        return new Book(title, price);
	    }

	    // Method to display book details
	    public static void showBook(Book book) {
	        System.out.println("Book Title: " + book.getTitle());
	        System.out.println("Book Price: " + book.getPrice());
	    }

	    public static void main(String[] args) {
	        // Example usage
	        String title = "Java Programming";
	        double price = 350.00;

	        Book book = createBook(title, price);
	        showBook(book);
	    }
	}
	

