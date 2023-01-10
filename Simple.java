import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberInput = scanner.nextInt();

if (numberInput >= 5)
        if (numberInput <= 10) {
            System.out.println("The number" + numberInput +
                               "lies between 5 and 10.");

     }  else {

            System.out.println("The number" + numberInput +
                               "does NOT lie between 5 and 10 and higher 10.");
     }  else {
System.out.println("The number" + numberInput +
                   "does NOT lie between 5 and 10 and lower 5.");

        }

    }
    
    
}



Alternativ geht auch int numberInput=13;
