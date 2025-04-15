/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Control Flow
 * LESSON:     5.1 - If Statements
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class IfStatements {
    public static void main(String[] args) {
        // Variables for demonstration
        int a = 10;
        int b = 20;
        int c = 30;
        String weather = "Sunny";
        int temperature = 25;

        displayBanner('*', 72);
        System.out.println("IF STATEMENTS DEMONSTRATION");
        System.out.println("==========================");
        System.out.println("Working with variables: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("And string value: weather = \"" + weather + "\"");
        System.out.println("And temperature = " + temperature);

        // 1. Simple if statement
        System.out.println("\n1. Simple If Statement");
        System.out.println("   Syntax: if (condition) { statements }");
        System.out.println("   Example:");

        if (a < b) {
            System.out.println("   a is less than b");
            System.out.println("   This block executes when the condition is true");
        }

        // Demonstrating when condition is false
        if (a > b) {
            System.out.println("   This will not be printed because a is not greater than b");
        }

        // 2. if-else statement
        System.out.println("\n2. If-Else Statement");
        System.out.println("   Syntax: if (condition) { statements } else { statements }");
        System.out.println("   Example:");

        if (a > b) {
            System.out.println("   a is greater than b");
        } else {
            System.out.println("   a is not greater than b");
            System.out.println("   The else block executes when the condition is false");
        }

        // 3. if-else-if ladder
        System.out.println("\n3. If-Else-If Ladder");
        System.out.println("   Syntax: if (condition1) { statements } else if (condition2) { statements } ... else { statements }");
        System.out.println("   Example:");

        if (a > b) {
            System.out.println("   a is greater than b");
        } else if (a == b) {
            System.out.println("   a is equal to b");
        } else {
            System.out.println("   a is less than b");
        }

        // 4. Nested if statements
        System.out.println("\n4. Nested If Statements");
        System.out.println("   Syntax: if (outer-condition) { if (inner-condition) { statements } }");
        System.out.println("   Example:");

        if (a < b) {
            System.out.println("   a is less than b");

            if (a > 5) {
                System.out.println("   AND a is greater than 5");
            }

            if (b < 30) {
                System.out.println("   AND b is less than 30");
            }
        }

        // 5. if statements with logical operators
        System.out.println("\n5. If Statements with Logical Operators");
        System.out.println("   Example using AND (&&):");

        if (a < b && b < c) {
            System.out.println("   a is less than b AND b is less than c");
            System.out.println("   This means a < b < c");
        }

        System.out.println("\n   Example using OR (||):");

        if (a > 15 || b > 15) {
            System.out.println("   Either a is greater than 15 OR b is greater than 15");
            System.out.println("   In this case, b = " + b + " which is greater than 15");
        }

        System.out.println("\n   Example using NOT (!):");

        if (!(a > b)) {
            System.out.println("   It is NOT true that a is greater than b");
            System.out.println("   This is equivalent to saying a <= b");
        }

        // 6. Using if with String comparison
        System.out.println("\n6. If Statements with String Comparison");
        System.out.println("   Note: Use equals() method for String comparison, not ==");

        if (weather.equals("Sunny")) {
            System.out.println("   It's a sunny day!");
        } else if (weather.equals("Rainy")) {
            System.out.println("   Don't forget your umbrella!");
        } else {
            System.out.println("   The weather is neither sunny nor rainy.");
        }

        // 7. Multiple conditions in if statements
        System.out.println("\n7. Complex Conditional Logic");

        if ((temperature > 20 && weather.equals("Sunny")) || temperature > 30) {
            System.out.println("   It's warm outside!");
            System.out.println("   This condition is true if either:");
            System.out.println("   - The temperature is above 20 AND it's sunny, OR");
            System.out.println("   - The temperature is above 30 regardless of weather");
        }

        // 8. If with assignment (not recommended but good to know)
        System.out.println("\n8. Common Pitfalls: Assignment vs. Comparison");
        System.out.println("   Be careful not to use = (assignment) instead of == (comparison)");

        int x = 10;
        // The following uses == for comparison, which is correct
        if (x == 10) {
            System.out.println("   x is equal to 10");
        }

        // 9. Single-line if statement (without braces)
        System.out.println("\n9. Single-Line If Statements");
        System.out.println("   For single statements, braces are optional (but recommended)");

        if (a < b)
            System.out.println("   a is less than b (single line if statement)");

        System.out.println("   Note: This line is outside the if block regardless of indentation");

        // 10. Ternary operator as a compact if-else
        System.out.println("\n10. Ternary Operator (Compact If-Else)");
        System.out.println("    Syntax: variable = (condition) ? value-if-true : value-if-false");

        String result = (a < b) ? "a is less than b" : "a is not less than b";
        System.out.println("    Result using ternary: " + result);

        // Equivalent if-else
        String result2;
        if (a < b) {
            result2 = "a is less than b";
        } else {
            result2 = "a is not less than b";
        }
        System.out.println("    Result using if-else: " + result2);

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
