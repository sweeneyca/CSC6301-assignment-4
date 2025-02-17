import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This program reads a list of integer numbers from standard input,
 * stores them in a LinkedList, sorts them in ascending order, and
 * prints the sorted list.
 *
 * <p>This program makes use of Java's Collections Framework to avoid
 * reinventing commonly used data structures and algorithms:
 * <ul>
 *     <li>{@code LinkedList<Integer>} for dynamic storage instead of implementing a custom linked list</li>
 *     <li>{@code Collections.sort()} for efficient sorting instead of writing a sorting algorithm</li>
 *     <li>{@code Scanner} for input handling rather than manual input parsing</li>
 * </ul>
 *
 * <p>Usage:
 * The program can be run from the command line by compiling it first:
 * <pre>
 * javac SortedLinkedList.java
 * java SortedLinkedList
 * </pre>
 *
 * <p>To generate JavaDocs, use the command:
 * <pre>
 * javadoc -d doc SortedLinkedList.java
 * </pre>
 *
 * @author Cara Sweeney
 * @version 1.0
 */
public class SortedLinkedList {
    
    /**
    * Default constructor for SortedLinkedList.
    * Initializes an empty linked list to store integers.
    */
    public SortedLinkedList() {
        // Default constructor
    }

    /**
     * Reads integers from the console, stores them in a LinkedList,
     * sorts them in ascending order, and prints them.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Using LinkedList to store numbers dynamically instead of manually managing a linked structure
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers (enter 'done' to exit program):");

        // Using Scanner to handle input validation and parsing, avoiding manual parsing logic
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or type 'done' to exit.");
                }
            }
        }
        scanner.close();

        // Using Collections.sort() instead of implementing a sorting algorithm
        Collections.sort(numbers);

        // Printing the sorted list directly, using LinkedList's toString() method
        System.out.println("Sorted numbers: " + numbers);
    }
}
