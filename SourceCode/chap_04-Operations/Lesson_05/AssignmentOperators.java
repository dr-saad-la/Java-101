/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     4.5 - Assignment Operators
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    March 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class AssignmentOperators {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("ASSIGNMENT OPERATORS DEMONSTRATION");
        System.out.println("==================================");

        // Simple assignment operator (=)
        System.out.println("1. Simple Assignment (=)");
        int a = 10;
        System.out.println("   int a = 10;  // a = " + a);

        // Initialize multiple variables
        int b, c, d;
        b = c = d = 20;  // Chained assignment
        System.out.println("   b = c = d = 20;  // b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("   This is called chained assignment");

        // Addition assignment operator (+=)
        System.out.println("\n2. Addition Assignment (+=)");
        int sum = 5;
        System.out.println("   Initial value: sum = " + sum);

        sum += 10;  // Equivalent to: sum = sum + 10;
        System.out.println("   sum += 10;  // sum = " + sum);
        System.out.println("   Equivalent to: sum = sum + 10;");

        // Subtraction assignment operator (-=)
        System.out.println("\n3. Subtraction Assignment (-=)");
        int difference = 20;
        System.out.println("   Initial value: difference = " + difference);

        difference -= 5;  // Equivalent to: difference = difference - 5;
        System.out.println("   difference -= 5;  // difference = " + difference);
        System.out.println("   Equivalent to: difference = difference - 5;");

        // Multiplication assignment operator (*=)
        System.out.println("\n4. Multiplication Assignment (*=)");
        int product = 4;
        System.out.println("   Initial value: product = " + product);

        product *= 3;  // Equivalent to: product = product * 3;
        System.out.println("   product *= 3;  // product = " + product);
        System.out.println("   Equivalent to: product = product * 3;");

        // Division assignment operator (/=)
        System.out.println("\n5. Division Assignment (/=)");
        int quotient = 15;
        System.out.println("   Initial value: quotient = " + quotient);

        quotient /= 3;  // Equivalent to: quotient = quotient / 3;
        System.out.println("   quotient /= 3;  // quotient = " + quotient);
        System.out.println("   Equivalent to: quotient = quotient / 3;");

        // Modulus assignment operator (%=)
        System.out.println("\n6. Modulus Assignment (%=)");
        int remainder = 17;
        System.out.println("   Initial value: remainder = " + remainder);

        remainder %= 5;  // Equivalent to: remainder = remainder % 5;
        System.out.println("   remainder %= 5;  // remainder = " + remainder);
        System.out.println("   Equivalent to: remainder = remainder % 5;");

        // Bitwise AND assignment operator (&=)
        System.out.println("\n7. Bitwise AND Assignment (&=)");
        int bitwiseAnd = 12;  // binary: 1100
        System.out.printf("   Initial value: bitwiseAnd = %d (binary: %s)%n",
                          bitwiseAnd, Integer.toBinaryString(bitwiseAnd));

        bitwiseAnd &= 5;  // binary: 0101, Equivalent to: bitwiseAnd = bitwiseAnd & 5;
        System.out.printf("   bitwiseAnd &= 5;  // bitwiseAnd = %d (binary: %s)%n",
                          bitwiseAnd, Integer.toBinaryString(bitwiseAnd));
        System.out.println("   Equivalent to: bitwiseAnd = bitwiseAnd & 5;");
        System.out.println("   1100 & 0101 = 0100 (4 in decimal)");

        // Bitwise OR assignment operator (|=)
        System.out.println("\n8. Bitwise OR Assignment (|=)");
        int bitwiseOr = 12;  // binary: 1100
        System.out.printf("   Initial value: bitwiseOr = %d (binary: %s)%n",
                          bitwiseOr, Integer.toBinaryString(bitwiseOr));

        bitwiseOr |= 5;  // binary: 0101, Equivalent to: bitwiseOr = bitwiseOr | 5;

        System.out.printf("   bitwiseOr |= 5;  // bitwiseOr = %d (binary: %s)%n",
                          bitwiseOr, Integer.toBinaryString(bitwiseOr));
        System.out.println("   Equivalent to: bitwiseOr = bitwiseOr | 5;");
        System.out.println("   1100 | 0101 = 1101 (13 in decimal)");

        // Bitwise XOR assignment operator (^=)
        System.out.println("\n9. Bitwise XOR Assignment (^=)");
        int bitwiseXor = 12;  // binary: 1100
        System.out.printf("   Initial value: bitwiseXor = %d (binary: %s)%n",
                          bitwiseXor, Integer.toBinaryString(bitwiseXor));

        bitwiseXor ^= 5;  // binary: 0101, Equivalent to: bitwiseXor = bitwiseXor ^ 5;
        System.out.printf("   bitwiseXor ^= 5;  // bitwiseXor = %d (binary: %s)%n",
                          bitwiseXor, Integer.toBinaryString(bitwiseXor));
        System.out.println("   Equivalent to: bitwiseXor = bitwiseXor ^ 5;");
        System.out.println("   1100 ^ 0101 = 1001 (9 in decimal)");

        // Left shift assignment operator (<<=)
        System.out.println("\n10. Left Shift Assignment (<<=)");
        int leftShift = 5;  // binary: 0101
        System.out.printf("   Initial value: leftShift = %d (binary: %s)%n",
                          leftShift, Integer.toBinaryString(leftShift));

        leftShift <<= 2;  // Equivalent to: leftShift = leftShift << 2;
        System.out.printf("   leftShift <<= 2;  // leftShift = %d (binary: %s)%n",
                          leftShift, Integer.toBinaryString(leftShift));
        System.out.println("   Equivalent to: leftShift = leftShift << 2;");
        System.out.println("   0101 << 2 = 010100 (20 in decimal)");

        // Right shift assignment operator (>>=)
        System.out.println("\n11. Right Shift Assignment (>>=)");
        int rightShift = 20;  // binary: 10100
        System.out.printf("   Initial value: rightShift = %d (binary: %s)%n",
                          rightShift, Integer.toBinaryString(rightShift));

        rightShift >>= 2;  // Equivalent to: rightShift = rightShift >> 2;
        System.out.printf("   rightShift >>= 2;  // rightShift = %d (binary: %s)%n",
                          rightShift, Integer.toBinaryString(rightShift));
        System.out.println("   Equivalent to: rightShift = rightShift >> 2;");
        System.out.println("   10100 >> 2 = 101 (5 in decimal)");

        // Unsigned right shift assignment operator (>>>=)
        System.out.println("\n12. Unsigned Right Shift Assignment (>>>=)");
        int unsignedShift = -20;  // binary representation has leading 1's (sign bit)
        System.out.printf("   Initial value: unsignedShift = %d (binary: %s)%n",
                          unsignedShift, Integer.toBinaryString(unsignedShift));

        unsignedShift >>>= 2;  // Equivalent to: unsignedShift = unsignedShift >>> 2;
        System.out.printf("   unsignedShift >>>= 2;  // unsignedShift = %d (binary: %s)%n",
                          unsignedShift, Integer.toBinaryString(unsignedShift));
        System.out.println("   Equivalent to: unsignedShift = unsignedShift >>> 2;");
        System.out.println("   Sign bits become 0, resulting in a positive number");

        // Assignment with expressions
        System.out.println("\nCompound Assignment with Expressions:");
        int x = 10;
        System.out.println("   Initial value: x = " + x);

        x += 5 * 2;  // Equivalent to: x = x + (5 * 2);
        System.out.println("   x += 5 * 2;  // x = " + x);
        System.out.println("   Equivalent to: x = x + (5 * 2); not x = (x + 5) * 2;");

        // Type conversion with compound assignment
        System.out.println("\nType Conversion with Compound Assignment:");
        byte byteVal = 10;
        System.out.println("   Initial value: byte byteVal = " + byteVal);

        // This would cause an error: byteVal = byteVal + 5; (requires explicit cast)
        byteVal += 5;  // No error, implicit casting is done
        System.out.println("   byteVal += 5;  // byteVal = " + byteVal);
        System.out.println("   Compound assignment operators perform implicit casting");

        // Chaining multiple assignments
        System.out.println("\nChaining Multiple Assignments:");
        int m, n, p;
        m = (n = (p = 15));  // Chained assignment
        System.out.println("   m = (n = (p = 15));  // m = " + m + ", n = " + n + ", p = " + p);
        System.out.println("   Assignment evaluates from right to left");

        // Efficiency of compound assignment
        System.out.println("\nEfficiency of Compound Assignment:");
        System.out.println("   Compound assignment operators are often more efficient");
        System.out.println("   because the target variable is evaluated only once.");

        int[] array = {1, 2, 3, 4, 5};
        int index = 2;

        // Without compound assignment:
        // array[index] = array[index] + 10;

        // With compound assignment (more efficient):
        array[index] += 10;

        System.out.println("   array[2] += 10;  // array[2] = " + array[index]);
        System.out.println("   More efficient than: array[index] = array[index] + 10;");
        displayBanner('*', 72);
    }
    static void displayBanner(char c, int length){
        for (int i=0; i<length; i++){
            System.out.print(c);
        }
        System.out.println();
    }
}
