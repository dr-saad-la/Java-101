/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     4.4 - Bitwise Operators
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class BitwiseOperators {
    public static void main(String[] args) {
        // Variables for demonstration
        int a = 5;  // binary: 0000 0000 0000 0000 0000 0000 0000 0101
        int b = 3;  // binary: 0000 0000 0000 0000 0000 0000 0000 0011
        displayBanner('*', 72);

        System.out.println("BITWISE OPERATORS DEMONSTRATION");
        System.out.println("===============================");
        System.out.println("Working with variables:");
        System.out.printf("a = %d (binary: %s)%n", a, Integer.toBinaryString(a));
        System.out.printf("b = %d (binary: %s)%n", b, Integer.toBinaryString(b));

        // Bitwise AND operator (&)
        int bitwiseAnd = a & b;
        System.out.println("\n1. Bitwise AND (&)");
        System.out.println("   Performs a logical AND operation on each pair of bits");
        System.out.printf("   a & b = %d (binary: %s)%n", bitwiseAnd, Integer.toBinaryString(bitwiseAnd));
        System.out.println("   Explanation: Bits set in the result only where bits set in both a AND b");
        System.out.println("   0101 & 0011 = 0001");

        // Bitwise OR operator (|)
        int bitwiseOr = a | b;
        System.out.println("\n2. Bitwise OR (|)");
        System.out.println("   Performs a logical OR operation on each pair of bits");
        System.out.printf("   a | b = %d (binary: %s)%n", bitwiseOr, Integer.toBinaryString(bitwiseOr));
        System.out.println("   Explanation: Bits set in the result where bits set in either a OR b");
        System.out.println("   0101 | 0011 = 0111");

        // Bitwise XOR operator (^)
        int bitwiseXor = a ^ b;
        System.out.println("\n3. Bitwise XOR (^)");
        System.out.println("   Performs a logical exclusive OR operation on each pair of bits");
        System.out.printf("   a ^ b = %d (binary: %s)%n", bitwiseXor, Integer.toBinaryString(bitwiseXor));
        System.out.println("   Explanation: Bits set in the result where bits set in either a OR b, but not both");
        System.out.println("   0101 ^ 0011 = 0110");

        // Bitwise NOT operator (~)
        int bitwiseNot = ~a;
        System.out.println("\n4. Bitwise NOT (~)");
        System.out.println("   Inverts all the bits of the operand");
        System.out.printf("   ~a = %d (binary: %s)%n", bitwiseNot, Integer.toBinaryString(bitwiseNot));
        System.out.println("   Explanation: Each 0 becomes 1 and each 1 becomes 0");
        System.out.println("   ~0101 = 1111...1010 (all bits inverted, including sign bit)");

        // Left shift operator (<<)
        int leftShift1 = a << 1;
        int leftShift2 = a << 2;
        System.out.println("\n5. Left Shift (<<)");
        System.out.println("   Shifts all bits to the left by specified positions");
        System.out.printf("   a << 1 = %d (binary: %s)%n", leftShift1, Integer.toBinaryString(leftShift1));
        System.out.printf("   a << 2 = %d (binary: %s)%n", leftShift2, Integer.toBinaryString(leftShift2));
        System.out.println("   Explanation: Left shifting effectively multiplies by powers of 2");
        System.out.println("   5 << 1 = 10 (equivalent to 5 * 2^1)");
        System.out.println("   5 << 2 = 20 (equivalent to 5 * 2^2)");

        // Right shift operator (>>)
        int c = 40;  // binary: 0000 0000 0000 0000 0000 0000 0010 1000
        int rightShift1 = c >> 1;
        int rightShift2 = c >> 3;
        System.out.println("\n6. Right Shift (>>)");
        System.out.println("   Shifts all bits to the right by specified positions");
        System.out.printf("   c = %d (binary: %s)%n", c, Integer.toBinaryString(c));
        System.out.printf("   c >> 1 = %d (binary: %s)%n", rightShift1, Integer.toBinaryString(rightShift1));
        System.out.printf("   c >> 3 = %d (binary: %s)%n", rightShift2, Integer.toBinaryString(rightShift2));
        System.out.println("   Explanation: Right shifting effectively divides by powers of 2");
        System.out.println("   40 >> 1 = 20 (equivalent to 40 / 2^1)");
        System.out.println("   40 >> 3 = 5 (equivalent to 40 / 2^3)");

        // Negative number right shift
        int negative = -40;  // binary representation has leading 1's (sign bit)
        int negRightShift = negative >> 2;
        System.out.println("\n   Right Shift with Negative Numbers:");
        System.out.printf("   -40 >> 2 = %d (binary: %s)%n", negRightShift, Integer.toBinaryString(negRightShift));
        System.out.println("   Sign bit is preserved (keeps the number negative)");

        // Unsigned right shift operator (>>>)
        int unsignedRightShift1 = c >>> 2;
        int unsignedRightShift2 = negative >>> 2;
        System.out.println("\n7. Unsigned Right Shift (>>>)");
        System.out.println("   Shifts all bits to the right and fills with zeros");
        System.out.printf("   c >>> 2 = %d (binary: %s)%n", unsignedRightShift1, Integer.toBinaryString(unsignedRightShift1));
        System.out.printf("   -40 >>> 2 = %d (binary: %s)%n", unsignedRightShift2, Integer.toBinaryString(unsignedRightShift2));
        System.out.println("   Explanation: Always fills with zeros, regardless of sign bit");
        System.out.println("   For positive numbers, same as regular right shift");
        System.out.println("   For negative numbers, result is always positive (sign bit becomes 0)");

        // Practical applications
        System.out.println("\nPractical Applications of Bitwise Operators:");

        // 1. Checking if a number is odd or even using bitwise AND
        System.out.println("\n1. Checking if a number is odd/even:");
        System.out.println("   7 & 1 = " + (7 & 1) + " (odd number has last bit set)");
        System.out.println("   8 & 1 = " + (8 & 1) + " (even number has last bit clear)");

        // 2. Setting specific bits using OR
        int flags = 0;
        int BIT_READ = 4;    // 0100 - bit position 2
        int BIT_WRITE = 2;   // 0010 - bit position 1
        flags = flags | BIT_READ | BIT_WRITE;  // Set read and write flags

        System.out.println("\n2. Setting flags using OR:");
        System.out.printf("   flags = %d (binary: %s)%n", flags, Integer.toBinaryString(flags));
        System.out.println("   Both read and write bits are now set");

        // 3. Checking if a specific bit is set using AND
        boolean isReadSet = (flags & BIT_READ) != 0;
        System.out.println("\n3. Checking if bits are set using AND:");
        System.out.println("   Is read flag set? " + isReadSet);
        displayBanner('*', 72);
    }
    static void displayBanner(char c, int length){
        for (int i=0; i<length; i++){
            System.out.print(c);
        }
        System.out.println();
    }
}
