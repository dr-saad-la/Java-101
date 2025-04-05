/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     2.1 - Arithmetic Operators
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    March 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Variables for demonstration
        int a = 10;
        int b = 3;

        System.out.println("ARITHMETIC OPERATORS DEMONSTRATION");
        System.out.println("==================================");
        System.out.println("Working with variables: a = " + a + ", b = " + b);

        // Addition operator (+)
        int sum = a + b;
        System.out.println("\n1. Addition (+)");
        System.out.println("   a + b = " + sum);
        System.out.println("   15 + 7 = " + (15 + 7));

        // Subtraction operator (-)
        int difference = a - b;
        System.out.println("\n2. Subtraction (-)");
        System.out.println("   a - b = " + difference);
        System.out.println("   15 - 7 = " + (15 - 7));

        // Multiplication operator (*)
        int product = a * b;
        System.out.println("\n3. Multiplication (*)");
        System.out.println("   a * b = " + product);
        System.out.println("   5 * 6 = " + (5 * 6));

        // Division operator (/)
        int quotient = a / b;
        double preciseQuotient = (double)a / b;
        System.out.println("\n4. Division (/)");
        System.out.println("   a / b = " + quotient + " (integer division truncates decimal part)");
        System.out.println("   (double)a / b = " + preciseQuotient + " (casting to double gives decimal result)");
        System.out.println("   15 / 2 = " + (15 / 2) + " (integer division)");
        System.out.println("   15.0 / 2 = " + (15.0 / 2) + " (floating-point division)");

        // Modulus operator (%)
        int remainder = a % b;
        System.out.println("\n5. Modulus (%)");
        System.out.println("   a % b = " + remainder + " (remainder of a divided by b)");
        System.out.println("   17 % 5 = " + (17 % 5) + " (remainder of 17 divided by 5)");

        // Unary plus operator (+)
        int positive = +a;
        System.out.println("\n6. Unary Plus (+)");
        System.out.println("   +a = " + positive + " (maintains the sign)");

        // Unary minus operator (-)
        int negative = -a;
        System.out.println("\n7. Unary Minus (-)");
        System.out.println("   -a = " + negative + " (reverses the sign)");

        // Increment operator (++)
        int c = a;
        System.out.println("\n8. Increment (++)");
        System.out.println("   Starting with c = " + c);
        System.out.println("   Prefix increment (++c): " + (++c) + " (increments first, then uses the value)");
        System.out.println("   c is now: " + c);
        System.out.println("   Postfix increment (c++): " + (c++) + " (uses the value first, then increments)");
        System.out.println("   c is now: " + c);

        // Decrement operator (--)
        int d = a;
        System.out.println("\n9. Decrement (--)");
        System.out.println("   Starting with d = " + d);
        System.out.println("   Prefix decrement (--d): " + (--d) + " (decrements first, then uses the value)");
        System.out.println("   d is now: " + d);
        System.out.println("   Postfix decrement (d--): " + (d--) + " (uses the value first, then decrements)");
        System.out.println("   d is now: " + d);

        // Example with expressions
        System.out.println("\nComplex Expressions:");
        System.out.println("   (4 + 5) * 2 = " + ((4 + 5) * 2) + " (parentheses control order of operations)");
        System.out.println("   5 + 3 * 2 = " + (5 + 3 * 2) + " (multiplication has higher precedence than addition)");

        // Operator precedence demonstration
        System.out.println("\nOperator Precedence:");
        System.out.println("   10 + 20 / 5 = " + (10 + 20 / 5) + " (division happens before addition)");
        System.out.println("   (10 + 20) / 5 = " + ((10 + 20) / 5) + " (parentheses override default precedence)");
    }
}
