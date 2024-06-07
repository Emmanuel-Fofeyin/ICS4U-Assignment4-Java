import java.util.Scanner;
/*
 * This is the hourglass program
 *
 * @author  Emmanuel Fofeyin 
 * @version 1.0
 * @since   2024-05-06
 */

 import java.util.Scanner;

 public class Hourglass {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Input a number for the hourglass (min 1): ");
         int input = scanner.nextInt();
 
         printHourglass(input);
 
         System.out.println("\nDone");
     }
 
     public static void printHourglass(int input) {
         if (input < 1) {
             System.out.println("Error: Input must be at least 1.");
             return;
         }
 
         // Upper half of the hourglass
         for (int i = 0; i < input; i++) {
             String spaces = generateString(i);
             String stars = generateStars(input - i);
             System.out.println(spaces + stars.trim());
         }
 
         // Lower half of the hourglass
         for (int i = input - 1; i >= 0; i--) {
             String spaces = generateString(i);
             String stars = generateStars(input - i);
             System.out.println(spaces + stars.trim());
         }
     }
 
     // Helper function to generate a string with a specific number of spaces
     public static String generateString(int count) {
         StringBuilder result = new StringBuilder();
         for (int i = 0; i < count; i++) {
             result.append(" ");
         }
         return result.toString();
     }
 
     // Helper function to generate a string with a specific number of stars
     public static String generateStars(int count) {
         StringBuilder result = new StringBuilder();
         for (int i = 0; i < count; i++) {
             result.append("* ");
         }
         return result.toString();
     }
 }
 