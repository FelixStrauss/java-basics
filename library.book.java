

public class book {

    private int quantity;
    private long ISBN;

    private String author, title;

    public book(String title, String author, long ISBN, int quantity) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.quantity = quantity;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getISBN() {
        return ISBN;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;}

    public boolean borrowbook() {
            if (quantity > 0) {
                quantity--;
                System.out.println("Book borrowed successfully! Have fun!");
                return true;
            } else {
                System.out.println("Sorry, the book is not available.");
                return false;
            }
}
}
