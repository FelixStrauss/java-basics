import java.util.Scanner;

/**
 * Read a number from user input and count up to this number using a while loop. 
 * Print the numbers up to this number and then „done“.
 *
 * Count to number: 7
 */
public class WhileLoop{

    private static Scanner keyboard = new Scanner (System.in);
//Scanner instanzieren
    public static void main(String[] args) {
//Instanzieren von Variablen des Typs int (ganz)
        int number = 1;
        int limit; 

        limit = keyboard.nextInt(); 
        
        while (limit!=number) {
           
            System.out.println(number);
            number++;
            

        }
        System.out.println("done");
    }
}
