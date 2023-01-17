import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class library{

    public static void main (String[] args) throws Exception {

        book book1 = new book(
                "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling",
                9788700631625L,
                2);
        book book2 = new book(
                "The Lord of the Rings",
                "J.R.R. Tolkien",
                9780544003415L,
                1);
        book book3 = new book("The Hobbit", "J.R.R. Tolkien", 9780544003416L, 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("********************Welcome to the Public Library!********************");
       
        
            Scanner input = new Scanner(System.in);
            System.out.println("Enter First Name: ");
            String firstName = input.nextLine();
            System.out.println("Enter Last Name: ");
            String lastName = input.nextLine();
            System.out.println("Enter Home Adress: ");
            String homeAdress = input.nextLine();
        
        
            Customer cus = new Customer(firstName, lastName, homeAdress);
        
            System.out.println("\nWelcome: ");
            System.out.print(cus.getfirstName() + cus.getlastName());
            System.out.println("\n Your Shipping Address: ");
            System.out.print(cus.gethomeAdress());
        
            List<Customer> customer = new ArrayList<Customer>();
        
            customer.add(cus);
        
            // Output the list contents
            printList(customer);
    
        System.out.println("Enter the book number: ");
        int bookNumber = scanner.nextInt();

        List<book> books = new ArrayList<book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        for (int i = 0; i < books.size(); i++) {
            book book = books.get(i);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Quantity: " + book.getQuantity());
            System.out.println("Do you want to borrow this book? (y/n)");
            String answer = scanner.next();
            if (answer.equals("y")) {
                book.borrowbook();
                System.out.println("New Quantity: " + book.getQuantity());
                break;
            } else {
                System.out.println("Have a booktastic day!");
            }
        }
    }
    public static void printList(List<Customer> list) {
        
        System.out.println("Customers: ");
    
        for (Customer customer : list) {
            System.out.printf("%s", customer);
        }
        System.out.println();
    }
}
