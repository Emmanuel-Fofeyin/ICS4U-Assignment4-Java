import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
* This program runs with a sequence generator that creates a pattern.
*
* @author Emmanuel FN
* @version 1.0
* @since 2024-05-06
*/
public class PatternGenerator {

   /**
    * Generate the pattern as described in the TypeScript code.
    *
    * @param number == number a positive integer representing the pattern's size.
    */
   public static void generatePattern(int number) {
       ArrayList<Integer> sequence = new ArrayList<>();

       // Loop through to create the pattern
       for (int integer = 1; integer <= number; integer++) {
           ArrayList<Integer> previousSequence = new ArrayList<>(sequence);
           Collections.reverse(previousSequence); // Reverse the previous sequence

           sequence.clear(); // Clear the current sequence
           sequence.addAll(previousSequence); // Append the reversed sequence
           sequence.add(integer); // Add the current index
           sequence.addAll(previousSequence); // Append the original order again
       }

       // Build the final output with the given structure
       StringBuilder output = new StringBuilder();
       for (Integer num : sequence) {
           output.append(" ").append(num); // Add a space before each number
           if (num > 5) {
               output.append("\n"); // Insert a newline after numbers greater than 5
           }
       }

       System.out.println(output.toString().trim()); // Print the final output
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a positive integer: ");
       int number;
       try {
           number = Integer.parseInt(scanner.nextLine());

           if (number < 1) {
               System.out.println("Error: Please enter a positive integer greater than 0.");
           } else {
               generatePattern(number);
           }
          
       System.out.println("\nDone.");
       scanner.close(); // Close the scanner
   }
}
