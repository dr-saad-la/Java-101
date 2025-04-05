/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     4.3 - Logical Operators
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class LogicalOperators {
    public static void main(String[] args) {
        // Variables for demonstration
        boolean p = true;
        boolean q = false;
        int a = 10;
        int b = 20;

        displayBanne('*', 72);
        System.out.println("LOGICAL OPERATORS DEMONSTRATION");
        System.out.println("===============================");
        System.out.println("Working with variables: p = " + p + ", q = " + q);
        System.out.println("And numeric values: a = " + a + ", b = " + b);

        // Logical AND operator (&&)
        System.out.println("\n1. Logical AND (&&)");
        System.out.println("   p && p: " + (p && p) + " (true AND true = true)");
        System.out.println("   p && q: " + (p && q) + " (true AND false = false)");
        System.out.println("   q && p: " + (q && p) + " (false AND true = false)");
        System.out.println("   q && q: " + (q && q) + " (false AND false = false)");

        System.out.println("\n   Example with conditions:");
        System.out.println("   (a < b) && (a > 5): " + ((a < b) && (a > 5)) +
                          " (both conditions true)");
        System.out.println("   (a > b) && (a > 5): " + ((a > b) && (a > 5)) +
                          " (first condition false, second true)");

        // Logical OR operator (||)
        System.out.println("\n2. Logical OR (||)");
        System.out.println("   p || p: " + (p || p) + " (true OR true = true)");
        System.out.println("   p || q: " + (p || q) + " (true OR false = true)");
        System.out.println("   q || p: " + (q || p) + " (false OR true = true)");
        System.out.println("   q || q: " + (q || q) + " (false OR false = false)");

        System.out.println("\n   Example with conditions:");
        System.out.println("   (a < b) || (a > 5): " + ((a < b) || (a > 5)) +
                          " (both conditions true)");
        System.out.println("   (a > b) || (a > 5): " + ((a > b) || (a > 5)) +
                          " (first condition false, second true)");
        System.out.println("   (a > b) || (a < 5): " + ((a > b) || (a < 5)) +
                          " (both conditions false)");

        // Logical NOT operator (!)
        System.out.println("\n3. Logical NOT (!)");
        System.out.println("   !p: " + (!p) + " (NOT true = false)");
        System.out.println("   !q: " + (!q) + " (NOT false = true)");
        System.out.println("   !(a < b): " + (!(a < b)) + " (NOT true = false)");
        System.out.println("   !(a > b): " + (!(a > b)) + " (NOT false = true)");

        // Short-circuit evaluation
        System.out.println("\n4. Short-Circuit Evaluation");
        System.out.println("   In logical expressions, Java uses short-circuit evaluation.");
        System.out.println("   This means the second condition is only evaluated if needed.");

        // Short-circuit AND
        System.out.println("\n   Short-Circuit AND Example:");
        System.out.println("   false && (any expression): Second expression is never evaluated");

        boolean result1 = q && isPositive(0);
        System.out.println("   q && isPositive(0): " + result1 +
                          " (second expression not evaluated because q is false)");

        // Short-circuit OR
        System.out.println("\n   Short-Circuit OR Example:");
        System.out.println("   true || (any expression): Second expression is never evaluated");

        boolean result2 = p || isPositive(0);
        System.out.println("   p || isPositive(0): " + result2 +
                          " (second expression not evaluated because p is true)");

        // Combining logical operators
        System.out.println("\n5. Combining Logical Operators");
        boolean complexExpression = (a > 5) && (b < 30) || (a + b > 25);
        System.out.println("   (a > 5) && (b < 30) || (a + b > 25): " + complexExpression);
        System.out.println("   Precedence: AND is evaluated before OR");

        boolean withParentheses = (a > 5) && ((b < 30) || (a + b > 25));
        System.out.println("   (a > 5) && ((b < 30) || (a + b > 25)): " + withParentheses);
        System.out.println("   Parentheses change the order of evaluation");

        // Using logical operators in control flow
        System.out.println("\nUsing Logical Operators in Control Flow:");

        if (a < b && a > 5) {
            System.out.println("   a is less than b AND a is greater than 5");
        }

        if (a > b || a > 5) {
            System.out.println("   a is greater than b OR a is greater than 5");
        }

        displayBanner('*', 72);
    }

    // Helper method to demonstrate short-circuit evaluation
    public static boolean isPositive(int num) {
        System.out.println("   isPositive() method was called!");
        return num > 0;
    }
    static void displayBanner(char c, int length){
        for (int i=0; i<length; i++){
            System.out.print(c);
        }
        System.out.println();
    }
}
