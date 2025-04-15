/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Control Flow
 * LESSON:     5.4 - Do-While Loops
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class DoWhileLoops {
    public static void main(String[] args) {
        // Variables for demonstration
        int count = 1;
        int sum = 0;

        displayBanner('*', 72);
        System.out.println("DO-WHILE LOOPS DEMONSTRATION");
        System.out.println("============================");

        // 1. Basic do-while loop
        System.out.println("\n1. Basic Do-While Loop");
        System.out.println("   Syntax: do { statements } while (condition);");
        System.out.println("   Example: Print numbers from 1 to 5");

        count = 1; // Reset count
        do {
            System.out.println("   Count: " + count);
            count++; // Increment the counter
        } while (count <= 5);

        System.out.println("   After the loop, count = " + count);

        // 2. Key difference: do-while vs while
        System.out.println("\n2. Key Difference: Do-While vs While");
        System.out.println("   Example: Loop with a condition that's false from the start");

        // While loop
        System.out.println("   Using while loop (condition checked before execution):");
        count = 10;
        while (count < 10) {
            System.out.println("   This will NOT be printed (condition false initially)");
            count++;
        }
        System.out.println("   The while loop body did not execute at all");

        // Do-while loop
        System.out.println("\n   Using do-while loop (condition checked after execution):");
        count = 10;
        do {
            System.out.println("   This will be printed ONCE (even with false condition)");
            count++;
        } while (count < 10);
        System.out.println("   The do-while loop body executed once");
        System.out.println("   After the loop, count = " + count);

        // 3. do-while loop with multiple statements
        System.out.println("\n3. Do-While Loop with Multiple Statements");
        System.out.println("   Example: Calculate sum of numbers from 1 to 10");

        count = 1; // Reset count
        sum = 0;   // Reset sum

        do {
            sum += count;  // Add current count to sum
            System.out.println("   Added " + count + " to sum, new sum = " + sum);
            count++;       // Increment the counter
        } while (count <= 10);

        System.out.println("   Final sum of numbers 1 to 10 = " + sum);

        // 4. Breaking out of a do-while loop
        System.out.println("\n4. Breaking Out of a Do-While Loop");
        System.out.println("   Example: Find the first number divisible by both 3 and 7");

        count = 1; // Reset count

        do {
            if (count % 3 == 0 && count % 7 == 0) {
                System.out.println("   Found it! " + count + " is divisible by both 3 and 7");
                break;  // Exit the loop
            }
            count++;
        } while (count <= 100);

        System.out.println("   After the loop, count = " + count);

        // 5. do-while loop with continue statement
        System.out.println("\n5. Using Continue in a Do-While Loop");
        System.out.println("   Example: Print only odd numbers from 1 to 10");

        count = 0; // Reset count

        do {
            count++;
            if (count % 2 == 0) {
                // Skip even numbers
                continue;
            }
            System.out.println("   Odd number: " + count);
        } while (count < 10);

        // 6. Nested do-while loops
        System.out.println("\n6. Nested Do-While Loops");
        System.out.println("   Example: Print a simple number pattern");

        int i = 1;

        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i);

            System.out.println(); // Move to the next line
            i++;
        } while (i <= 5);

        // 7. Using do-while for input validation
        System.out.println("\n7. Using Do-While for Input Validation");
        System.out.println("   Example: Ensuring a number is within a valid range");
        System.out.println("   (In real code, this would involve user input)");

        int validInput = 0;
        int attemptCount = 0;
        int[] simulatedInputs = {-5, 0, 110, 42}; // Simulate user inputs

        do {
            // In a real application, we would get input from the user here
            // For demonstration purposes, we'll simulate input
            int input = simulatedInputs[attemptCount];
            System.out.println("   Simulated input: " + input);

            if (input >= 1 && input <= 100) {
                validInput = input;
                System.out.println("   Valid input received: " + validInput);
            } else {
                System.out.println("   Invalid input! Number must be between 1 and 100");
            }

            attemptCount++;
        } while (validInput == 0 && attemptCount < simulatedInputs.length);

        if (validInput == 0) {
            System.out.println("   Failed to get valid input after " + attemptCount + " attempts");
        }

        // 8. do-while vs for loop
        System.out.println("\n8. Do-While vs For Loop");
        System.out.println("   Do-while is preferred when:");
        System.out.println("   - The loop must execute at least once");
        System.out.println("   - The exit condition can only be determined inside the loop");
        System.out.println("   - Processing input until a valid value is received");
        System.out.println("   - Implementing menu-driven programs");

        // 9. A menu-driven example
        System.out.println("\n9. Menu-Driven Example");
        System.out.println("   (In real code, this would involve user input)");

        int choice = 0;
        int[] simulatedChoices = {3, 1, 4, 2}; // Simulate user choices
        int choiceIndex = 0;

        do {
            // Display a menu (in real code)
            System.out.println("   MENU:");
            System.out.println("   1. Option One");
            System.out.println("   2. Option Two");
            System.out.println("   3. Option Three");
            System.out.println("   4. Exit");
            System.out.println("   --------------------");

            // Get user choice (simulated)
            choice = simulatedChoices[choiceIndex++];
            System.out.println("   Simulated choice: " + choice);

            // Process the choice
            switch (choice) {
                case 1:
                    System.out.println("   You selected Option One");
                    break;
                case 2:
                    System.out.println("   You selected Option Two");
                    break;
                case 3:
                    System.out.println("   You selected Option Three");
                    break;
                case 4:
                    System.out.println("   Exiting the menu");
                    break;
                default:
                    System.out.println("   Invalid choice! Please select 1-4");
            }

            System.out.println("   --------------------");
        } while (choice != 4 && choiceIndex < simulatedChoices.length);

        // 10. Common pitfalls and best practices
        System.out.println("\n10. Common Pitfalls and Best Practices");

        // Infinite loops
        System.out.println("    a) Infinite Loops:");
        System.out.println("       - Ensure the condition can eventually become false");
        System.out.println("       - Always update variables used in the condition");

        // Forgetting the semicolon
        System.out.println("\n    b) Forgetting the Semicolon:");
        System.out.println("       - The do-while statement ends with a semicolon");
        System.out.println("       - Syntax: do { statements } while (condition);");

        // When to use do-while
        System.out.println("\n    c) When to Use Do-While:");
        System.out.println("       - Use when the loop body must execute at least once");
        System.out.println("       - Ideal for input validation and menu systems");
        System.out.println("       - If execution might be skipped entirely, use a while loop");

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
