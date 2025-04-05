/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     2.6 - Type Casting in Java
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class ArithmeticOperations {

    public static void main(String[] args) {
        String banner = repeatChar('=', 50);

        // String text = "Numeric Operations in Java";
        // int width = 52;
        
        // String centeredText = centerText(text, width);
        System.out.println(banner);
        System.out.println(centerText("Numeric Operations in Java", 50));
        System.out.println(banner);
        
        // Declare numeric variables
        int intA = 10;
        int intB = 20;
        double doubleA = 15.5;
        double doubleB = 4.5;

        // Type Casting
        System.out.println("\nType Casting:");
        int intC = (int) doubleA;  // Casting double to int
        double doubleC = intA;     // Implicit casting int to double
        System.out.println("Casting doubleA to int: " + intC);
        System.out.println("Implicit casting intA to double: " + doubleC);

        System.out.println(banner);
    }

    // Method to repeat a character n times and used as a banner
    public static String repeatChar(char ch, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    // Method to center text within a given width
    public static String centerText(String text, int width) {
        if (text.length() >= width) {
            return text;
        }
        
        int padding = width - text.length();
        int paddingLeft = padding / 2;
        int paddingRight = padding - paddingLeft;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paddingLeft; i++) {
            sb.append(' ');
        }
        sb.append(text);
        for (int i = 0; i < paddingRight; i++) {
            sb.append(' ');
        }
        
        return sb.toString();
    }
}
