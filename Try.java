import java.util.Scanner;

public class Try {
    private static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        int number1, number2, sum = 0;

        System.out.print("Enter the first number: ");
        number1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        number2 = keyboard.nextInt();

        if (number1 > number2) {
            System.out.println("Error: The second number must be greater than the first number.");
        } else {
            for (int i = number1; i <= number2; i++) {
                sum += i;
            }
            System.out.println("The sum of the numbers from " + number1 + " to " + number2 + " is " + sum + ".");
        }
    }
}  
    
