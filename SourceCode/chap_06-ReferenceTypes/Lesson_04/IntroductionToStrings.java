/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Arrays and Strings
 * LESSON:     6.4 - Introduction to Strings
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class IntroductionToStrings {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("INTRODUCTION TO STRINGS");
        System.out.println("=======================");

        // 1. What are Strings?
        System.out.println("\n1. What Are Strings?");
        System.out.println("   - Strings are sequences of characters");
        System.out.println("   - In Java, strings are objects of the String class");
        System.out.println("   - Strings are immutable (cannot be changed after creation)");
        System.out.println("   - Java provides special support for strings through string literals");
        System.out.println("   - Strings are one of the most commonly used data types in Java");

        // 2. Creating Strings
        System.out.println("\n2. Creating Strings");

        // a) Using string literals
        System.out.println("   a) Using string literals:");
        String greeting = "Hello, World!";
        String empty = "";
        String withQuotes = "He said, \"Java is fun!\"";

        System.out.println("      greeting: " + greeting);
        System.out.println("      empty: \"" + empty + "\" (empty string)");
        System.out.println("      withQuotes: " + withQuotes);

        // b) Using the new keyword
        System.out.println("\n   b) Using the new keyword:");
        String str1 = new String("Hello, World!");
        String str2 = new String(greeting);

        System.out.println("      str1: " + str1);
        System.out.println("      str2: " + str2 + " (copy of greeting)");

        // c) Using character arrays
        System.out.println("\n   c) Using character arrays:");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String fromChars = new String(charArray);

        System.out.println("      fromChars: " + fromChars);

        // 3. String literals vs String objects
        System.out.println("\n3. String Literals vs String Objects");

        String literal1 = "Hello";
        String literal2 = "Hello";
        String object1 = new String("Hello");
        String object2 = new String("Hello");

        System.out.println("   Testing equality with ==:");
        System.out.println("   literal1 == literal2: " + (literal1 == literal2) + " (same object in string pool)");
        System.out.println("   object1 == object2: " + (object1 == object2) + " (different objects in heap)");
        System.out.println("   literal1 == object1: " + (literal1 == object1) + " (different objects)");

        System.out.println("\n   Testing equality with equals():");
        System.out.println("   literal1.equals(literal2): " + literal1.equals(literal2) + " (same content)");
        System.out.println("   object1.equals(object2): " + object1.equals(object2) + " (same content)");
        System.out.println("   literal1.equals(object1): " + literal1.equals(object1) + " (same content)");

        // 4. String immutability
        System.out.println("\n4. String Immutability");
        System.out.println("   - Strings in Java are immutable (cannot be changed after creation)");
        System.out.println("   - Operations that seem to modify a string actually create a new string");

        String original = "Hello";
        System.out.println("   original: " + original);

        String modified = original.concat(", World!");
        System.out.println("   After concatenation:");
        System.out.println("   original: " + original + " (unchanged)");
        System.out.println("   modified: " + modified + " (new string)");

        String uppercase = original.toUpperCase();
        System.out.println("   After toUpperCase():");
        System.out.println("   original: " + original + " (unchanged)");
        System.out.println("   uppercase: " + uppercase + " (new string)");

        // 5. Basic String operations
        System.out.println("\n5. Basic String Operations");

        // a) Getting string length
        System.out.println("   a) Getting string length:");
        String text = "Java Programming";
        System.out.println("      text: \"" + text + "\"");
        System.out.println("      text.length(): " + text.length());

        // b) Accessing characters in a string
        System.out.println("\n   b) Accessing characters in a string:");
        System.out.println("      text.charAt(0): " + text.charAt(0));
        System.out.println("      text.charAt(5): " + text.charAt(5));
        System.out.println("      text.charAt(text.length() - 1): " + text.charAt(text.length() - 1));

        // c) Concatenating strings
        System.out.println("\n   c) Concatenating strings:");
        String firstName = "John";
        String lastName = "Doe";

        String fullName1 = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);

        System.out.println("      Using + operator: " + fullName1);
        System.out.println("      Using concat(): " + fullName2);

        // 6. Comparing strings
        System.out.println("\n6. Comparing Strings");

        // a) equals() and equalsIgnoreCase()
        System.out.println("   a) equals() and equalsIgnoreCase():");
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = "hello";

        System.out.println("      s1: \"" + s1 + "\", s2: \"" + s2 + "\", s3: \"" + s3 + "\"");
        System.out.println("      s1.equals(s3): " + s1.equals(s3));
        System.out.println("      s1.equals(s2): " + s1.equals(s2));
        System.out.println("      s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));

        // b) compareTo() method
        System.out.println("\n   b) compareTo() method:");
        System.out.println("      s1.compareTo(s3): " + s1.compareTo(s3) + " (equal strings)");
        System.out.println("      s1.compareTo(s2): " + s1.compareTo(s2) + " (different case)");
        System.out.println("      \"apple\".compareTo(\"banana\"): " + "apple".compareTo("banana") + " (negative = comes before)");
        System.out.println("      \"banana\".compareTo(\"apple\"): " + "banana".compareTo("apple") + " (positive = comes after)");

        // 7. Searching within strings
        System.out.println("\n7. Searching Within Strings");

        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("   sentence: \"" + sentence + "\"");

        // a) indexOf and lastIndexOf
        System.out.println("   a) indexOf() and lastIndexOf():");
        System.out.println("      sentence.indexOf(\"fox\"): " + sentence.indexOf("fox"));
        System.out.println("      sentence.indexOf(\"cat\"): " + sentence.indexOf("cat") + " (not found)");
        System.out.println("      sentence.indexOf('o'): " + sentence.indexOf('o'));
        System.out.println("      sentence.lastIndexOf('o'): " + sentence.lastIndexOf('o'));

        // b) contains, startsWith, and endsWith
        System.out.println("\n   b) contains(), startsWith(), and endsWith():");
        System.out.println("      sentence.contains(\"fox\"): " + sentence.contains("fox"));
        System.out.println("      sentence.contains(\"cat\"): " + sentence.contains("cat"));
        System.out.println("      sentence.startsWith(\"The\"): " + sentence.startsWith("The"));
        System.out.println("      sentence.endsWith(\"dog\"): " + sentence.endsWith("dog"));

        // 8. Extracting substrings
        System.out.println("\n8. Extracting Substrings");

        // a) substring method
        System.out.println("   a) substring() method:");
        System.out.println("      sentence.substring(4): \"" + sentence.substring(4) + "\"");
        System.out.println("      sentence.substring(10, 19): \"" + sentence.substring(10, 19) + "\"");

        // b) split method
        System.out.println("\n   b) split() method:");
        String[] words = sentence.split(" ");
        System.out.println("      sentence.split(\" \") results in " + words.length + " words:");

        for (int i = 0; i < words.length; i++) {
            System.out.println("      words[" + i + "]: \"" + words[i] + "\"");
        }

        // 9. Modifying strings
        System.out.println("\n9. Modifying Strings (Creating New Strings)");

        String original2 = "  Java Programming  ";
        System.out.println("   original2: \"" + original2 + "\"");

        // a) Changing case
        System.out.println("   a) Changing case:");
        System.out.println("      original2.toUpperCase(): \"" + original2.toUpperCase() + "\"");
        System.out.println("      original2.toLowerCase(): \"" + original2.toLowerCase() + "\"");

        // b) Trimming
        System.out.println("\n   b) Trimming whitespace:");
        System.out.println("      original2.trim(): \"" + original2.trim() + "\"");

        // c) Replacing
        System.out.println("\n   c) Replacing characters/strings:");
        System.out.println("      original2.replace('a', 'A'): \"" + original2.replace('a', 'A') + "\"");
        System.out.println("      original2.replace(\"Java\", \"Python\"): \"" + original2.replace("Java", "Python") + "\"");
        System.out.println("      original2.replaceAll(\"\\\\s\", \"-\"): \"" + original2.replaceAll("\\s", "-") + "\"");

        // 10. Strings vs character arrays
        System.out.println("\n10. Strings vs Character Arrays");

        // a) Converting between strings and character arrays
        System.out.println("   a) Converting between strings and character arrays:");
        String word = "Hello";
        char[] charArray2 = word.toCharArray();

        System.out.println("      word: \"" + word + "\"");
        System.out.print("      word.toCharArray(): [");
        for (int i = 0; i < charArray2.length; i++) {
            System.out.print("'" + charArray2[i] + "'");
            if (i < charArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Modifying the character array
        charArray2[0] = 'J';
        String newWord = new String(charArray2);

        System.out.println("      After changing charArray2[0] to 'J':");
        System.out.println("      new String(charArray2): \"" + newWord + "\"");
        System.out.println("      original word: \"" + word + "\" (unchanged)");

        // b) Differences between strings and character arrays
        System.out.println("\n   b) Differences between strings and character arrays:");
        System.out.println("      - Strings are immutable, character arrays are mutable");
        System.out.println("      - Strings have many built-in methods for manipulation");
        System.out.println("      - Strings can be compared directly with equals()");
        System.out.println("      - Character arrays have better performance for certain operations");

        displayBanner('*', 72);
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
