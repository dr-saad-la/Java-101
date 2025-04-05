/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     2.1 - Integer Numeric Data Types
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * created:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class NumericIntegerTypes {
    public static void main(String[] args) {
        displayBanner('=', 50);
        System.out.println("       Integer Numeric Types in Java       ");
        displayBanner('=', 50);

        // Integer numeric data types
        byte byteVar = 127;                          // 8-bit signed integer
        short shortVar = 32767;                      // 16-bit signed integer
        int intVar = 2147483647;                     // 32-bit signed integer
        long longVar = 9223372036854775807L;         // 64-bit signed integer

        // Print out the integer type values and their ranges
        System.out.println("Integer Numeric Data Types:");

        System.out.println("\nbyte:");
        System.out.println("\tValue: " + byteVar);
        System.out.println("\tSize: 8 bits (1 byte)");
        System.out.println("\tRange: -128 to 127");
        System.out.println("\tUse: Memory-sensitive data, file I/O operations");

        System.out.println("\nshort:");
        System.out.println("\tValue: " + shortVar);
        System.out.println("\tSize: 16 bits (2 bytes)");
        System.out.println("\tRange: -32,768 to 32,767");
        System.out.println("\tUse: Memory conservation when range is sufficient");

        System.out.println("\nint:");
        System.out.println("\tValue: " + intVar);
        System.out.println("\tSize: 32 bits (4 bytes)");
        System.out.println("\tRange: -2,147,483,648 to 2,147,483,647");
        System.out.println("\tUse: Default integer type for most calculations");

        System.out.println("\nlong:");
        System.out.println("\tValue: " + longVar);
        System.out.println("\tSize: 64 bits (8 bytes)");
        System.out.println("\tRange: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println("\tUse: Very large numbers, timestamps, unique IDs");
        System.out.println("\tNote: The 'L' suffix is required for long literals");

        displayBanner('=', 50);
    }

    public static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Numeric Integer Examples
    public static void numiericIntegerVariablesUsage(){

        // Examples of using integer types
        System.out.println("\nExamples of Integer Operations:");
        int sum = 25 + 50;
        System.out.println("\tAddition: 25 + 50 = " + sum);

        int difference = 100 - 30;
        System.out.println("\tSubtraction: 100 - 30 = " + difference);

        int product = 5 * 6;
        System.out.println("\tMultiplication: 5 * 6 = " + product);

        int quotient = 20 / 4;
        System.out.println("\tDivision: 20 / 4 = " + quotient);

        int remainder = 17 % 5;
        System.out.println("\tRemainder (modulus): 17 % 5 = " + remainder);
    }
}
