/**
 * Write a program to calculate the sum for a series of numbers 1, …, n where n is user input. 
 * Example: For input of 5 the sum is: 1 + 2 + 3 + 4 + 5 = 15
 * 
 * Main Exercise:
 * Create a new console project 
 * Add the code to the main method. Use whichever loop you find appropriate.
 * 
 * Extension:
 * Let the user enter two numbers and add the numbers from one to the other. 
 * Example: For input 2 and 5 the sum is: 2 + 3 + 4 + 5 = 14.
 * Add a check if the second number is bigger than the first one. 
 */

import java.util.Scanner;

public class SumOfNumbers {
    
    private static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        int number = 1;
        int n;
        int sum = 0;

        n = keyboard.nextInt();

        while (n!=number) {
           
            System.out.println(number);
            sum= sum + number;
            number++;

            

        }

        System.out.println(sum);
    }
}





