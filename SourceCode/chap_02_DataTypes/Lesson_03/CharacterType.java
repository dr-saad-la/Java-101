/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     3.1 - Character Data Type
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    March 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class CharacterType {
    public static void main(String[] args) {
        displayBanner('=', 50);
        System.out.println("        Character Data Type in Java        ");
        displayBanner('=', 50);

        // Character data type
        char charVar = 'A';                          // Single 16-bit Unicode character
        char unicodeChar = '\u00A9';                 // Unicode representation (copyright symbol ©)
        char escapedChar = '\n';                     // Escape sequence (newline)

        // Print out the character type values
        System.out.println("Character Data Type:");

        System.out.println("\nchar:");
        System.out.println("\tValue: '" + charVar + "'");
        System.out.println("\tSize: 16 bits (2 bytes)");
        System.out.println("\tRange: 0 to 65,535 (Unicode values)");
        System.out.println("\tUse: Storing single characters, Unicode symbols");

        System.out.println("\nRepresenting Characters:");
        System.out.println("\tAs literal: '" + charVar + "'");
        System.out.println("\tUnicode point: '\u0041' (Unicode for 'A')");
        System.out.println("\tCopyright symbol: '" + unicodeChar + "' (Unicode \\u00A9)");

        // ASCII values and type casting
        System.out.println("\nCharacter and Numeric Conversions:");
        int asciiValue = (int) charVar;
        System.out.println("\tASCII value of 'A': " + asciiValue);
        char convertedChar = (char) 66;
        System.out.println("\tCharacter for ASCII 66: '" + convertedChar + "'");

        // Character operations and methods
        System.out.println("\nCharacter Operations:");
        char lowerChar = 'a';
        boolean isLetter = Character.isLetter(lowerChar);
        boolean isDigit = Character.isDigit('5');
        boolean isUpperCase = Character.isUpperCase(charVar);
        char upperChar = Character.toUpperCase(lowerChar);

        System.out.println("\tIs 'a' a letter? " + isLetter);
        System.out.println("\tIs '5' a digit? " + isDigit);
        System.out.println("\tIs 'A' uppercase? " + isUpperCase);
        System.out.println("\tUppercase of 'a': '" + upperChar + "'");

        // Common escape sequences
        System.out.println("\nCommon Escape Sequences:");
        System.out.println("\t\\n - Newline: 'Line1" + escapedChar + "Line2'");
        System.out.println("\t\\t - Tab: 'Column1\tColumn2'");
        System.out.println("\t\\' - Single quote: 'It\'s working'");
        System.out.println("\t\\\" - Double quote: \"Quoted text\"");
        System.out.println("\t\\\\ - Backslash: 'C:\\\\Program Files'");

        displayBanner('=', 50);
    }

    public static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
