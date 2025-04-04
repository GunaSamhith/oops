class Book {
        private String title;
    private String author;
    private double price;

  
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

        public String getTitle() {
        return title;
    }

        public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title.");
        }
    }

        public String getAuthor() {
        return author;
    }

       public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author.");
        }
    }

        public double getPrice() {
        return price;
    }

       public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than zero.");
        }
    }

    
    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
                Book book = new Book("Java Programming", "John Doe", 39.99);
        
        book.displayBookInfo();
        
        book.setTitle("Advanced Java");
        book.setPrice(49.99);

        
        book.setAuthor(""); // Invalid
        book.setPrice(-5);   // Invalid
        
        
        book.displayBookInfo();
    }
}