/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Arrays and Strings
 * LESSON:     6.6 - StringBuilder and StringBuffer
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("STRINGBUILDER AND STRINGBUFFER");
        System.out.println("=============================");

        // 1. The problem with String concatenation
        System.out.println("\n1. The Problem with String Concatenation");
        System.out.println("   - Strings in Java are immutable");
        System.out.println("   - Each concatenation creates a new String object");
        System.out.println("   - This can lead to performance issues with many concatenations");

        // Demonstration of inefficient string concatenation
        System.out.println("\n   Demonstration of inefficient string concatenation:");
        String result = "";
        long startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            result += "a";
        }

        long endTime = System.nanoTime();
        System.out.println("   Time taken for String concatenation: " +
                         (endTime - startTime) / 1000000 + " milliseconds");
        System.out.println("   Final string length: " + result.length());

        // 2. Introduction to StringBuilder and StringBuffer
        System.out.println("\n2. Introduction to StringBuilder and StringBuffer");
        System.out.println("   - StringBuilder and StringBuffer are mutable sequence of characters");
        System.out.println("   - They provide efficient ways to manipulate strings");
        System.out.println("   - Their contents and capacity can change");

        System.out.println("\n   Main differences:");
        System.out.println("   - StringBuilder (Java 5+): Not synchronized, faster, not thread-safe");
        System.out.println("   - StringBuffer (Java 1.0+): Synchronized, thread-safe, but slower");
        System.out.println("   - Use StringBuilder for single-threaded contexts (most common)");
        System.out.println("   - Use StringBuffer for multi-threaded contexts");

        // 3. Creating StringBuilder and StringBuffer objects
        System.out.println("\n3. Creating StringBuilder and StringBuffer Objects");

        // a) Empty builder/buffer
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sbf1 = new StringBuffer();

        System.out.println("   a) Empty constructor:");
        System.out.println("      new StringBuilder(): capacity = " + sb1.capacity());
        System.out.println("      new StringBuffer(): capacity = " + sbf1.capacity());

        // b) With initial capacity
        StringBuilder sb2 = new StringBuilder(100);
        StringBuffer sbf2 = new StringBuffer(50);

        System.out.println("\n   b) With initial capacity:");
        System.out.println("      new StringBuilder(100): capacity = " + sb2.capacity());
        System.out.println("      new StringBuffer(50): capacity = " + sbf2.capacity());

        // c) With initial content
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuffer sbf3 = new StringBuffer("World");

        System.out.println("\n   c) With initial content:");
        System.out.println("      new StringBuilder(\"Hello\"): " + sb3 + ", capacity = " + sb3.capacity());
        System.out.println("      new StringBuffer(\"World\"): " + sbf3 + ", capacity = " + sbf3.capacity());

        // 4. Basic operations on StringBuilder
        System.out.println("\n4. Basic Operations on StringBuilder");
        StringBuilder builder = new StringBuilder("Java");

        // a) Appending data
        System.out.println("   a) Appending data:");
        System.out.println("      Original: " + builder);

        builder.append(" is");
        System.out.println("      After append(\" is\"): " + builder);

        builder.append(' ').append("awesome").append('!');
        System.out.println("      After chained appends: " + builder);

        builder.append(123);  // Appending non-string types
        System.out.println("      After append(123): " + builder);

        // b) Inserting data
        System.out.println("\n   b) Inserting data:");
        System.out.println("      Current: " + builder);

        builder.insert(5, " Programming");
        System.out.println("      After insert(5, \" Programming\"): " + builder);

        builder.insert(0, ">> ");
        System.out.println("      After insert(0, \">> \"): " + builder);

        builder.insert(builder.length(), " <<");
        System.out.println("      After insert at end: " + builder);

        // c) Deleting data
        System.out.println("\n   c) Deleting data:");
        System.out.println("      Current: " + builder);

        builder.delete(0, 3);  // Remove first 3 characters
        System.out.println("      After delete(0, 3): " + builder);

        builder.deleteCharAt(builder.length() - 1);  // Remove last character
        System.out.println("      After deleteCharAt(length-1): " + builder);

        // 5. Replacing and modifying content
        System.out.println("\n5. Replacing and Modifying Content");
        System.out.println("   Current: " + builder);

        // a) replace() method
        builder.replace(0, 4, "Python");
        System.out.println("   a) After replace(0, 4, \"Python\"): " + builder);

        // b) setCharAt() method
        builder.setCharAt(0, 'J');
        System.out.println("   b) After setCharAt(0, 'J'): " + builder);

        // c) Chaining multiple operations
        builder.delete(7, 18)
               .insert(7, "is fun")
               .append(" to learn!");

        System.out.println("   c) After chained operations: " + builder);

        // 6. Capacity and length management
        System.out.println("\n6. Capacity and Length Management");
        StringBuilder capacityDemo = new StringBuilder(10);

        System.out.println("   Initial: capacity = " + capacityDemo.capacity() +
                         ", length = " + capacityDemo.length());

        // a) Adding content beyond capacity
        capacityDemo.append("This is a test of how capacity grows automatically");

        System.out.println("   a) After append: capacity = " + capacityDemo.capacity() +
                         ", length = " + capacityDemo.length());

        // b) Setting length manually
        System.out.println("   b) Current content: \"" + capacityDemo + "\"");
        capacityDemo.setLength(10);
        System.out.println("      After setLength(10): \"" + capacityDemo + "\"");
        System.out.println("      New length = " + capacityDemo.length());

        // c) Ensuring capacity
        capacityDemo.ensureCapacity(50);
        System.out.println("   c) After ensureCapacity(50): capacity = " + capacityDemo.capacity());

        // d) Trimming capacity
        capacityDemo.trimToSize();
        System.out.println("   d) After trimToSize(): capacity = " + capacityDemo.capacity());

        // 7. StringBuilder vs StringBuffer performance
        System.out.println("\n7. StringBuilder vs StringBuffer Performance");

        // a) StringBuilder performance
        StringBuilder sbPerf = new StringBuilder();
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            sbPerf.append("a");
        }

        endTime = System.nanoTime();

        System.out.println("   a) StringBuilder performance:");
        System.out.println("      Time taken: " + (endTime - startTime) / 1000000 + " milliseconds");
        System.out.println("      Final length: " + sbPerf.length());

        // b) StringBuffer performance
        StringBuffer sbfPerf = new StringBuffer();
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            sbfPerf.append("a");
        }

        endTime = System.nanoTime();

        System.out.println("\n   b) StringBuffer performance:");
        System.out.println("      Time taken: " + (endTime - startTime) / 1000000 + " milliseconds");
        System.out.println("      Final length: " + sbfPerf.length());

        // 8. Common methods shared with String
        System.out.println("\n8. Common Methods Shared with String");
        StringBuilder common = new StringBuilder("Java Programming Language");

        // a) charAt() and length()
        System.out.println("   a) charAt() and length():");
        System.out.println("      common: \"" + common + "\"");
        System.out.println("      common.charAt(5): " + common.charAt(5));
        System.out.println("      common.length(): " + common.length());

        // b) substring()
        System.out.println("\n   b) substring():");
        System.out.println("      common.substring(5, 16): \"" + common.substring(5, 16) + "\"");
        System.out.println("      Note: substring() returns a String, not a StringBuilder");

        // c) indexOf() and lastIndexOf()
        System.out.println("\n   c) indexOf() and lastIndexOf():");
        System.out.println("      common.indexOf(\"a\"): " + common.indexOf("a"));
        System.out.println("      common.lastIndexOf(\"a\"): " + common.lastIndexOf("a"));

        // 9. Conversion between String and StringBuilder
        System.out.println("\n9. Conversion Between String and StringBuilder");

        // a) StringBuilder to String
        StringBuilder toConvert = new StringBuilder("Convert me");
        String converted = toConvert.toString();

        System.out.println("   a) StringBuilder to String:");
        System.out.println("      StringBuilder: " + toConvert);
        System.out.println("      After toString(): \"" + converted + "\" (String)");

        // b) String to StringBuilder
        String str = "Hello, StringBuilder";
        StringBuilder backToBuilder = new StringBuilder(str);

        System.out.println("\n   b) String to StringBuilder:");
        System.out.println("      String: \"" + str + "\"");
        System.out.println("      New StringBuilder: " + backToBuilder);

        // 10. Practical examples and best practices
        System.out.println("\n10. Practical Examples and Best Practices");

        // a) Building a formatted report
        System.out.println("   a) Building a formatted report:");
        StringBuilder report = new StringBuilder();
        report.append("SALES REPORT\n");
        report.append("============\n\n");
        report.append(String.format("%-15s %10s %10s%n", "Product", "Units", "Revenue"));
        report.append(String.format("%-15s %10d %10.2f%n", "Laptop", 10, 12500.00));
        report.append(String.format("%-15s %10d %10.2f%n", "Phone", 25, 15000.00));
        report.append(String.format("%-15s %10d %10.2f%n", "Tablet", 15, 7500.00));
        report.append("\nTotal Revenue: $35,000.00");

        System.out.println(report.toString());

        // b) Efficient string joining
        System.out.println("\n   b) Efficient string joining:");
        String[] words = {"Java", "is", "a", "programming", "language"};
        StringBuilder joined = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            joined.append(words[i]);
            if (i < words.length - 1) {
                joined.append(" ");
            }
        }

        System.out.println("      Joined: \"" + joined + "\"");

        // c) Best practices
        System.out.println("\n   c) Best practices:");
        System.out.println("      - Use StringBuilder for most single-threaded string manipulation");
        System.out.println("      - Set initial capacity if you know approximate final size");
        System.out.println("      - Use StringBuffer only when thread safety is required");
        System.out.println("      - For simple concatenations, the + operator may be optimized by compiler");
        System.out.println("      - Remember to call toString() when converting back to String");
        System.out.println("      - Chain method calls when performing multiple operations");

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
