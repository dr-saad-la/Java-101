/*****************************************************************************
 * PROJECT:    JAVA-101 COMPREHENSIVE PROGRAMMING COURSE
 * MODULE:     INTRODUCTION TO JAVA FUNDAMENTALS
 * LESSON:     1.2 - COMMENTS AND STRING FORMATTING
 *
 * AUTHOR:     DR. SAAD LAOUADI, PH.D.
 * CREATED:    MARCH 2025
 *
 * COPYRIGHT © 2025 DR. SAAD LAOUADI. ALL RIGHTS RESERVED.
 * SEE LICENSE FILE FOR COMPLETE TERMS.
 *****************************************************************************/

/**
 * This class demonstrates the different types of comments in Java
 * and how to create simple text banners.
 */
public class CommentDemoWithDocstring {
    /**
     * Creates a string by repeating a character a specified number of times.
     *
     * @param ch The character to repeat
     * @param n The number of times to repeat the character
     * @return A string containing the character repeated n times
     */
    public static String repeatChar(char ch, int n) {
        StringBuilder sb = new StringBuilder();      // Create a string builder
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();        // return a string object from this method
    }

    /**
     * The main method demonstrates comment usage and displays a formatted banner.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create a banner with repeated characters
        String banner = repeatChar('=', 52);

        // Display the banner and title
        System.out.println(banner);
        System.out.println("      Comments in Java             ");
        System.out.println(banner);

        // This shows how to use single-line comments for brief explanations
        System.out.println("program run successfully and ended here!");

        /*
         * This is an example of a multi-line comment block.
         * Notice how each line starts with an asterisk for readability.
         * This style is commonly used in professional Java code.
         */

        // Using the method to add empty lines at the end
        addEmptyLineAtEnd(3);
    }

    /**
     * Adds empty lines to the console output.
     * Note: This method is not used in the current implementation.
     *
     * @param nlines The number of empty lines to add
     */
    public static void passAfterEnd(int nlines) {
        for (int i = 0; i < nlines; i++) {
            System.out.println("\n");
        }
    }

    /**
     * Adds a specified number of empty lines to the console output.
     * This method uses a more efficient approach than passAfterEnd.
     *
     * @param nlines The number of empty lines to add
     * @throws IllegalArgumentException if nlines is negative
     */
    public static void addEmptyLineAtEnd(int nlines) {
        if (nlines < 0) {
            throw new IllegalArgumentException("Number of lines must be non-negative.");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nlines; i++) {
            sb.append(System.lineSeparator());
        }
        System.out.print(sb.toString());
    }
}
