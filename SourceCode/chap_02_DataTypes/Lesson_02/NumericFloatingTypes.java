/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     2.1 - Floating-Point Numeric Data Types
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    March 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class NumericFloatingTypes {
    public static void main(String[] args) {
        displayBanner('=', 50);
        System.out.println("     Floating-Point Numeric Types in Java     ");
        displayBanner('=', 72);

        // Floating-point numeric data types
        float floatVar = 3.14159265f;                // Single-precision 32-bit floating point
        double doubleVar = 3.141592653589793;        // Double-precision 64-bit floating point

        // Scientific notation
        float sciFloat = 1.25e5f;                    // 1.25 × 10^5 = 125000.0
        double sciDouble = 1.7e-3;                   // 1.7 × 10^-3 = 0.0017

        // Print out the floating-point type values and their ranges
        System.out.println("Floating-Point Numeric Data Types:");

        System.out.println("\nfloat:");
        System.out.println("\tValue: " + floatVar);
        System.out.println("\tScientific Notation: " + sciFloat);
        System.out.println("\tSize: 32 bits (4 bytes)");
        System.out.println("\tPrecision: ~7 decimal digits");
        System.out.println("\tRange: ~3.4e-38 to ~3.4e+38");
        System.out.println("\tUse: Memory-efficient decimal calculations");
        System.out.println("\tNote: The 'f' suffix is required for float literals");

        System.out.println("\ndouble:");
        System.out.println("\tValue: " + doubleVar);
        System.out.println("\tScientific Notation: " + sciDouble);
        System.out.println("\tSize: 64 bits (8 bytes)");
        System.out.println("\tPrecision: ~15-16 decimal digits");
        System.out.println("\tRange: ~1.8e-308 to ~1.8e+308");
        System.out.println("\tUse: Default for decimal calculations, scientific computations");

        // Examples of using floating-point types
        System.out.println("\nExamples of Floating-Point Operations:");
        double sum = 25.5 + 50.75;
        System.out.println("\tAddition: 25.5 + 50.75 = " + sum);

        double difference = 100.5 - 30.25;
        System.out.println("\tSubtraction: 100.5 - 30.25 = " + difference);

        double product = 5.5 * 6.5;
        System.out.println("\tMultiplication: 5.5 * 6.5 = " + product);

        double quotient = 20.0 / 4.5;
        System.out.println("\tDivision: 20.0 / 4.5 = " + quotient);

        // Precision and rounding errors
        System.out.println("\nFloating-Point Precision Issues:");
        double result = 0.1 + 0.2;
        System.out.println("\t0.1 + 0.2 = " + result + " (Note: not exactly 0.3 due to binary representation)");

        displayBanner('=', 72);
    }

    public static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
