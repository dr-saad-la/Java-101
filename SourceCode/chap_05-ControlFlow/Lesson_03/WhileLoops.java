/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Control Flow
 * LESSON:     5.3 - While Loops
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class WhileLoops {
    public static void main(String[] args) {
        // Variables for demonstration
        int count = 1;
        int sum = 0;
        int factorial = 1;
        int number = 5;

        displayBanner('*', 72);
        System.out.println("WHILE LOOPS DEMONSTRATION");
        System.out.println("=========================");

        // 1. Basic while loop
        System.out.println("\n1. Basic While Loop");
        System.out.println("   Syntax: while (condition) { statements }");
        System.out.println("   Example: Print numbers from 1 to 5");

        count = 1; // Reset count
        while (count <= 5) {
            System.out.println("   Count: " + count);
            count++; // Increment the counter
        }

        System.out.println("   After the loop, count = " + count);

        // 2. while loop with multiple statements
        System.out.println("\n2. While Loop with Multiple Statements");
        System.out.println("   Example: Calculate sum of numbers from 1 to 10");

        count = 1; // Reset count
        sum = 0;   // Reset sum

        while (count <= 10) {
            sum += count;  // Add current count to sum
            System.out.println("   Added " + count + " to sum, new sum = " + sum);
            count++;       // Increment the counter
        }

        System.out.println("   Final sum of numbers 1 to 10 = " + sum);

        // 3. Calculating factorial using while loop
        System.out.println("\n3. Calculating Factorial Using While Loop");
        System.out.println("   Example: Calculate factorial of " + number);

        count = 1;       // Reset count
        factorial = 1;   // Reset factorial

        while (count <= number) {
            factorial *= count;  // Multiply factorial by count
            System.out.println("   " + number + "! after multiplying by " + count + " = " + factorial);
            count++;            // Increment the counter
        }

        System.out.println("   Final result: " + number + "! = " + factorial);

        // 4. Infinite loop with break statement
        System.out.println("\n4. Breaking Out of a While Loop");
        System.out.println("   Example: Find the first number divisible by both 3 and 5");

        count = 1; // Reset count

        while (true) {  // Infinite loop
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("   Found it! " + count + " is divisible by both 3 and 5");
                break;  // Exit the loop
            }
            count++;
        }

        System.out.println("   After the loop, count = " + count);

        // 5. while loop with continue statement
        System.out.println("\n5. Using Continue in a While Loop");
        System.out.println("   Example: Print only odd numbers from 1 to 10");

        count = 0; // Reset count

        while (count < 10) {
            count++;
            if (count % 2 == 0) {
                // Skip even numbers
                continue;
            }
            System.out.println("   Odd number: " + count);
        }

        // 6. Nested while loops
        System.out.println("\n6. Nested While Loops");
        System.out.println("   Example: Print a simple multiplication table");

        int i = 1;

        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println("   " + i + " × " + j + " = " + (i * j));
                j++;
            }
            System.out.println("   ---");
            i++;
        }

        // 7. Using while with arrays
        System.out.println("\n7. Using While Loops with Arrays");
        System.out.println("   Example: Calculate average of array elements");

        int[] numbers = {10, 20, 30, 40, 50};
        int index = 0;
        sum = 0;

        System.out.println("   Array elements: 10, 20, 30, 40, 50");

        while (index < numbers.length) {
            sum += numbers[index];
            System.out.println("   Added element at index " + index + " (" + numbers[index] + "), sum = " + sum);
            index++;
        }

        double average = (double) sum / numbers.length;
        System.out.println("   Average of array elements = " + average);

        // 8. do-while loop
        System.out.println("\n8. Do-While Loop");
        System.out.println("   Syntax: do { statements } while (condition);");
        System.out.println("   Example: Count down from 5 to 1");

        count = 5; // Reset count

        do {
            System.out.println("   Count: " + count);
            count--;
        } while (count > 0);

        System.out.println("   After the loop, count = " + count);

        // 9. Difference between while and do-while
        System.out.println("\n9. Difference Between While and Do-While");
        System.out.println("   Example: Loop with a condition that's false from the start");

        // While loop
        System.out.println("   Using while loop (condition checked before execution):");
        count = 10;
        while (count < 10) {
            System.out.println("   This will not be printed because the condition is false initially");
            count++;
        }

        // Do-while loop
        System.out.println("   Using do-while loop (condition checked after execution):");
        count = 10;
        do {
            System.out.println("   This will be printed once even though the condition is false initially");
            count++;
        } while (count < 10);

        // 10. Common pitfalls
        System.out.println("\n10. Common Pitfalls");

        // Infinite loop warning
        System.out.println("   a) Infinite Loops:");
        System.out.println("      - Occur when the loop condition never becomes false");
        System.out.println("      - Always ensure there's a way for the condition to become false");
        System.out.println("      Example of an infinite loop (not executed):");
        System.out.println("      while (true) { // Statements without a break; }");

        // Off-by-one errors
        System.out.println("\n   b) Off-By-One Errors:");
        System.out.println("      - Common when working with indexes or counters");
        System.out.println("      - Be careful with using <= vs < in your condition");

        // Forgetting to update the loop variable
        System.out.println("\n   c) Forgetting to Update the Loop Variable:");
        System.out.println("      - The loop variable must be updated inside the loop");
        System.out.println("      - Otherwise, you'll create an infinite loop");

        displayBanner('*', 72);
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
