/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     1.3.2 - Numeric Integer Data Types
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    March 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class NumericIntegerTypesInfo {
    public static void main (String[] args){

    displayBanner('-', 60);
    System.out.println("          NUMERIC INTEGER VARIABLES          ");
    displayBanner('-', 60);

    // Create variables of each integer type
    byte byteVar = 127;
    short shortVar = 32767;
    int intVar = 2147483647;
    long longVar = 9223372036854775807L;

    // Display information about byte
    System.out.println("BYTE:");
    System.out.println("\tSize in memory: " + Byte.BYTES + " bytes (" + (Byte.BYTES * 8) + " bits)");
    System.out.println("\tMinimum value: " + Byte.MIN_VALUE);
    System.out.println("\tMaximum value: " + Byte.MAX_VALUE);
    System.out.println("\tExample value: " + byteVar);
    System.out.println();

    // Display information about short
    System.out.println("SHORT:");
    System.out.println("\tSize in memory: " + Short.BYTES + " bytes (" + (Short.BYTES * 8) + " bits)");
    System.out.println("\tMinimum value: " + Short.MIN_VALUE);
    System.out.println("\tMaximum value: " + Short.MAX_VALUE);
    System.out.println("\tExample value: " + shortVar);
    System.out.println();

    // Display information about int
    System.out.println("INT:");
    System.out.println("\tSize in memory: " + Integer.BYTES + " bytes (" + (Integer.BYTES * 8) + " bits)");
    System.out.println("\tMinimum value: " + Integer.MIN_VALUE);
    System.out.println("\tMaximum value: " + Integer.MAX_VALUE);
    System.out.println("\tExample value: " + intVar);
    System.out.println();

    // Display information about long
    System.out.println("LONG:");
    System.out.println("\tSize in memory: " + Long.BYTES + " bytes (" + (Long.BYTES * 8) + " bits)");
    System.out.println("\tMinimum value: " + Long.MIN_VALUE);
    System.out.println("\tMaximum value: " + Long.MAX_VALUE);
    System.out.println("\tExample value: " + longVar);

    displayBanner('-', 60);

    }
    public static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
