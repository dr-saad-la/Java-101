/*****************************************************************************
* PROJECT:    Java-101 Comprehensive Programming Course
* MODULE:     Introduction to Java Fundamentals
* LESSON:     2.2- Numeric Floating-Point Data Types Information
*
* AUTHOR:     Dr. Saad Laouadi, Ph.D.
* CREATED:    March 2025
*
* Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
* See LICENSE file for complete terms.
*****************************************************************************/
public class NumericFloatingTypesInfo {
   public static void main (String[] args){
       displayBanner('-', 60);
       System.out.println("          NUMERIC FLOATING-POINT VARIABLES          ");
       displayBanner('-', 60);

       // Create variables of each floating-point type
       float floatVar = 3.4028235E38f;
       double doubleVar = 1.7976931348623157E308;

       // Display information about float
       System.out.println("FLOAT:");
       System.out.println("\tSize in memory: " + Float.BYTES + " bytes (" + (Float.BYTES * 8) + " bits)");
       System.out.println("\tMinimum value: " + Float.MIN_VALUE);
       System.out.println("\tMaximum value: " + Float.MAX_VALUE);
       System.out.println("\tExample value: " + floatVar);
       System.out.println("\tSpecial values: Positive infinity: " + Float.POSITIVE_INFINITY);
       System.out.println("\t                Negative infinity: " + Float.NEGATIVE_INFINITY);
       System.out.println("\t                Not a Number (NaN): " + Float.NaN);
       System.out.println();

       // Display information about double
       System.out.println("DOUBLE:");
       System.out.println("\tSize in memory: " + Double.BYTES + " bytes (" + (Double.BYTES * 8) + " bits)");
       System.out.println("\tMinimum value: " + Double.MIN_VALUE);
       System.out.println("\tMaximum value: " + Double.MAX_VALUE);
       System.out.println("\tExample value: " + doubleVar);
       System.out.println("\tSpecial values: Positive infinity: " + Double.POSITIVE_INFINITY);
       System.out.println("\t                Negative infinity: " + Double.NEGATIVE_INFINITY);
       System.out.println("\t                Not a Number (NaN): " + Double.NaN);
       System.out.println();

       // Display precision examples
       System.out.println("PRECISION EXAMPLES:");
       float piFloat = 3.14159265359f;
       double piDouble = 3.14159265359;
       System.out.println("\tPI as float:  " + piFloat + " (notice truncation)");
       System.out.println("\tPI as double: " + piDouble);

       // Display rounding error example
       System.out.println("\nROUNDING ERROR EXAMPLE:");
       System.out.println("\t0.1 + 0.2 as float:  " + (0.1f + 0.2f));
       System.out.println("\t0.1 + 0.2 as double: " + (0.1 + 0.2));

       System.out.println("\t0.1 + 0.2 as float:  " + String.format("%.20f", 0.1f + 0.2f));
       System.out.println("\t0.1 + 0.2 as double: " + String.format("%.20f", 0.1 + 0.2));

       System.out.println("\tNotice neither equals exactly 0.3 due to binary representation limitations");


       System.out.println("\nROUNDING ERROR EXAMPLE With more details:");
       System.out.println("\t0.1 + 0.2 as float:  " + (0.1f + 0.2f));
       System.out.println("\t(Default formatting makes this appear correct, but it's not exact)\n");

       System.out.println("\t0.1 + 0.2 as double: " + (0.1 + 0.2));
       System.out.println("\t(With default formatting, double shows the small error)\n");

       System.out.println("\t0.1 + 0.2 as float with extended precision:  " + String.format("%.20f", 0.1f + 0.2f));
       System.out.println("\t(When we look at more decimal places, we see float has an even larger error)\n");

       System.out.println("\t0.1 + 0.2 as double with extended precision: " + String.format("%.20f", 0.1 + 0.2));
       System.out.println("\t(Double has a smaller error, but still not exactly 0.3)\n");

       System.out.println("\tThis happens because decimal fractions like 0.1 cannot be precisely represented in binary floating-point format");

       displayBanner('-', 60);
   }

   public static void displayBanner(char c, int length) {
       for (int i = 0; i < length; i++) {
           System.out.print(c);
       }
       System.out.println();
   }
}
