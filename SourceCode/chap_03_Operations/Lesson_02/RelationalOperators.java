/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     3.2 - Relational Operators
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    March 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class RelationalOperators {
    public static void main(String[] args) {
        // Variables for demonstration
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("RELATIONAL OPERATORS DEMONSTRATION");
        System.out.println("==================================");
        System.out.println("Working with variables: a = " + a + ", b = " + b + ", c = " + c);

        // Equal to operator (==)
        System.out.println("\n1. Equal to (==)");
        System.out.println("   a == b: " + (a == b) + " (checks if a equals b)");
        System.out.println("   a == c: " + (a == c) + " (checks if a equals c)");

        // Not equal to operator (!=)
        System.out.println("\n2. Not equal to (!=)");
        System.out.println("   a != b: " + (a != b) + " (checks if a is not equal to b)");
        System.out.println("   a != c: " + (a != c) + " (checks if a is not equal to c)");

        // Greater than operator (>)
        System.out.println("\n3. Greater than (>)");
        System.out.println("   a > b: " + (a > b) + " (checks if a is greater than b)");
        System.out.println("   b > a: " + (b > a) + " (checks if b is greater than a)");
        System.out.println("   a > c: " + (a > c) + " (checks if a is greater than c)");

        // Less than operator (<)
        System.out.println("\n4. Less than (<)");
        System.out.println("   a < b: " + (a < b) + " (checks if a is less than b)");
        System.out.println("   b < a: " + (b < a) + " (checks if b is less than a)");
        System.out.println("   a < c: " + (a < c) + " (checks if a is less than c)");

        // Greater than or equal to operator (>=)
        System.out.println("\n5. Greater than or equal to (>=)");
        System.out.println("   a >= b: " + (a >= b) + " (checks if a is greater than or equal to b)");
        System.out.println("   b >= a: " + (b >= a) + " (checks if b is greater than or equal to a)");
        System.out.println("   a >= c: " + (a >= c) + " (checks if a is greater than or equal to c)");

        // Less than or equal to operator (<=)
        System.out.println("\n6. Less than or equal to (<=)");
        System.out.println("   a <= b: " + (a <= b) + " (checks if a is less than or equal to b)");
        System.out.println("   b <= a: " + (b <= a) + " (checks if b is less than or equal to a)");
        System.out.println("   a <= c: " + (a <= c) + " (checks if a is less than or equal to c)");

        // Comparing different data types
        System.out.println("\nComparing Different Data Types:");
        double dVal = 10.0;
        System.out.println("   int a = " + a + ", double dVal = " + dVal);
        System.out.println("   a == dVal: " + (a == dVal) + " (Java performs type conversion before comparison)");

        // Comparing objects
        System.out.println("\nComparing Objects:");
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str1;

        System.out.println("   String str1 = new String(\"Hello\")");
        System.out.println("   String str2 = new String(\"Hello\")");
        System.out.println("   String str3 = str1");

        System.out.println("   str1 == str2: " + (str1 == str2) + " (== compares references, not content)");
        System.out.println("   str1 == str3: " + (str1 == str3) + " (same reference, so true)");
        System.out.println("   str1.equals(str2): " + str1.equals(str2) + " (equals() compares content)");

        // Relational operators in control flow
        System.out.println("\nUsing Relational Operators in Control Flow:");
        if (a < b) {
            System.out.println("   a is less than b - this code executes when condition is true");
        }

        if (a == c) {
            System.out.println("   a equals c - this code executes when condition is true");
        }
    }
}
