/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Arrays and Strings
 * LESSON:     6.5 - String Operations and Methods
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class StringOperationsAndMethods {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("STRING OPERATIONS AND METHODS");
        System.out.println("============================");
        
        // Sample strings for demonstration
        String sample = "Java Programming Language";
        String empty = "";
        String withSpaces = "   Hello World   ";
        String repeated = "na";
        String mixedCase = "jAvA pRoGrAmMiNg";
        
        // 1. String length and emptiness
        System.out.println("\n1. String Length and Emptiness");
        
        // a) length() method
        System.out.println("   a) length() method:");
        System.out.println("      sample.length(): " + sample.length());
        System.out.println("      empty.length(): " + empty.length());
        System.out.println("      withSpaces.length(): " + withSpaces.length());
        
        // b) isEmpty() method
        System.out.println("\n   b) isEmpty() method:");
        System.out.println("      sample.isEmpty(): " + sample.isEmpty());
        System.out.println("      empty.isEmpty(): " + empty.isEmpty());
        
        // c) isBlank() method (Java 11+)
        System.out.println("\n   c) isBlank() method (Java 11+):");
        String blankString = "   ";
        System.out.println("      empty.isBlank(): " + empty.isBlank());
        System.out.println("      blankString.isBlank(): " + blankString.isBlank());
        System.out.println("      sample.isBlank(): " + sample.isBlank());
        
        // 2. Character extraction
        System.out.println("\n2. Character Extraction");
        
        // a) charAt() method
        System.out.println("   a) charAt() method:");
        System.out.println("      sample: \"" + sample + "\"");
        System.out.println("      sample.charAt(0): " + sample.charAt(0));
        System.out.println("      sample.charAt(5): " + sample.charAt(5));
        System.out.println("      sample.charAt(sample.length() - 1): " + sample.charAt(sample.length() - 1));
        
        // b) toCharArray() method
        System.out.println("\n   b) toCharArray() method:");
        char[] charArray = sample.toCharArray();
        System.out.print("      sample.toCharArray(): [");
        for (int i = 0; i < 5; i++) {  // Print first 5 characters for brevity
            System.out.print("'" + charArray[i] + "'");
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(", ...] (total " + charArray.length + " characters)");
        
        // c) getChars() method
        System.out.println("\n   c) getChars() method:");
        char[] destination = new char[10];
        sample.getChars(5, 15, destination, 0);
        System.out.print("      After sample.getChars(5, 15, destination, 0): ");
        for (int i = 0; i < destination.length; i++) {
            System.out.print(destination[i]);
        }
        System.out.println();
        
        // 3. String comparison
        System.out.println("\n3. String Comparison");
        
        String str1 = "Java";
        String str2 = "java";
        String str3 = new String("Java");
        
        // a) equals() and equalsIgnoreCase()
        System.out.println("   a) equals() and equalsIgnoreCase():");
        System.out.println("      str1: \"" + str1 + "\", str2: \"" + str2 + "\", str3: \"" + str3 + "\"");
        System.out.println("      str1.equals(str2): " + str1.equals(str2));
        System.out.println("      str1.equals(str3): " + str1.equals(str3));
        System.out.println("      str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        
        // b) compareTo() and compareToIgnoreCase()
        System.out.println("\n   b) compareTo() and compareToIgnoreCase():");
        System.out.println("      str1.compareTo(str3): " + str1.compareTo(str3));
        System.out.println("      str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("      str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2));
        System.out.println("      \"apple\".compareTo(\"banana\"): " + "apple".compareTo("banana"));
        
        // c) contentEquals()
        System.out.println("\n   c) contentEquals():");
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("      str1.contentEquals(sb): " + str1.contentEquals(sb));
        System.out.println("      str1.contentEquals(\"Java\"): " + str1.contentEquals("Java"));
        
        // 4. String searching
        System.out.println("\n4. String Searching");
        
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("   sentence: \"" + sentence + "\"");
        
        // a) indexOf() methods
        System.out.println("   a) indexOf() methods:");
        System.out.println("      sentence.indexOf('o'): " + sentence.indexOf('o'));
        System.out.println("      sentence.indexOf('o', 10): " + sentence.indexOf('o', 10));  // Start from index 10
        System.out.println("      sentence.indexOf(\"fox\"): " + sentence.indexOf("fox"));
        System.out.println("      sentence.indexOf(\"cat\"): " + sentence.indexOf("cat"));  // Not found
        
        // b) lastIndexOf() methods
        System.out.println("\n   b) lastIndexOf() methods:");
        System.out.println("      sentence.lastIndexOf('o'): " + sentence.lastIndexOf('o'));
        System.out.println("      sentence.lastIndexOf('o', 20): " + sentence.lastIndexOf('o', 20));  // Search up to index 20
        System.out.println("      sentence.lastIndexOf(\"the\"): " + sentence.lastIndexOf("the"));
        
        // c) contains(), startsWith(), and endsWith()
        System.out.println("\n   c) contains(), startsWith(), and endsWith():");
        System.out.println("      sentence.contains(\"fox\"): " + sentence.contains("fox"));
        System.out.println("      sentence.startsWith(\"The\"): " + sentence.startsWith("The"));
        System.out.println("      sentence.startsWith(\"quick\", 4): " + sentence.startsWith("quick", 4));  // Start from index 4
        System.out.println("      sentence.endsWith(\"dog\"): " + sentence.endsWith("dog"));
        
        // 5. String extraction
        System.out.println("\n5. String Extraction");
        
        // a) substring() methods
        System.out.println("   a) substring() methods:");
        System.out.println("      sample: \"" + sample + "\"");
        System.out.println("      sample.substring(5): \"" + sample.substring(5) + "\"");
        System.out.println("      sample.substring(5, 16): \"" + sample.substring(5, 16) + "\"");
        
        // b) split() method
        System.out.println("\n   b) split() method:");
        String[] words = sentence.split(" ");
        System.out.println("      sentence.split(\" \") results in " + words.length + " words:");
        for (int i = 0; i < Math.min(words.length, 5); i++) {  // Print first 5 for brevity
            System.out.println("      words[" + i + "]: \"" + words[i] + "\"");
        }
        
        // c) split() with limit
        System.out.println("\n   c) split() with limit:");
        String[] limitedWords = sentence.split(" ", 4);
        System.out.println("      sentence.split(\" \", 4) results in " + limitedWords.length + " parts:");
        for (int i = 0; i < limitedWords.length; i++) {
            System.out.println("      limitedWords[" + i + "]: \"" + limitedWords[i] + "\"");
        }
        
        // 6. String modification (creates new strings)
        System.out.println("\n6. String Modification (Creates New Strings)");
        
        // a) concat() method
        System.out.println("   a) concat() method:");
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("      firstName.concat(\" \").concat(lastName): \"" + 
                          firstName.concat(" ").concat(lastName) + "\"");
        
        // b) replace() methods
        System.out.println("\n   b) replace() methods:");
        System.out.println("      sample: \"" + sample + "\"");
        System.out.println("      sample.replace('a', 'A'): \"" + sample.replace('a', 'A') + "\"");
        System.out.println("      sample.replace(\"Java\", \"Python\"): \"" + 
                          sample.replace("Java", "Python") + "\"");
        
        // c) replaceFirst() and replaceAll() with regex
        System.out.println("\n   c) replaceFirst() and replaceAll() with regex:");
        String text = "apple apple orange apple";
        System.out.println("      text: \"" + text + "\"");
        System.out.println("      text.replaceFirst(\"apple\", \"banana\"): \"" + 
                          text.replaceFirst("apple", "banana") + "\"");
        System.out.println("      text.replaceAll(\"apple\", \"banana\"): \"" + 
                          text.replaceAll("apple", "banana") + "\"");
        System.out.println("      withSpaces: \"" + withSpaces + "\"");
        System.out.println("      withSpaces.replaceAll(\"\\\\s\", \"\"): \"" + 
                          withSpaces.replaceAll("\\s", "") + "\"");
        
        // 7. Case conversion
        System.out.println("\n7. Case Conversion");
        
        // a) toUpperCase() and toLowerCase()
        System.out.println("   a) toUpperCase() and toLowerCase():");
        System.out.println("      mixedCase: \"" + mixedCase + "\"");
        System.out.println("      mixedCase.toUpperCase(): \"" + mixedCase.toUpperCase() + "\"");
        System.out.println("      mixedCase.toLowerCase(): \"" + mixedCase.toLowerCase() + "\"");
        
        // b) Case-insensitive comparison
        System.out.println("\n   b) Case-insensitive comparison:");
        System.out.println("      \"java\".equalsIgnoreCase(\"JAVA\"): " + 
                          "java".equalsIgnoreCase("JAVA"));
        System.out.println("      \"java\".toLowerCase().equals(\"JAVA\".toLowerCase()): " + 
                          "java".toLowerCase().equals("JAVA".toLowerCase()));
        
        // 8. Whitespace handling
        System.out.println("\n8. Whitespace Handling");
        
        // a) trim() method
        System.out.println("   a) trim() method:");
        System.out.println("      withSpaces: \"" + withSpaces + "\"");
        System.out.println("      withSpaces.trim(): \"" + withSpaces.trim() + "\"");
        
        // b) strip(), stripLeading(), stripTrailing() (Java 11+)
        System.out.println("\n   b) strip(), stripLeading(), stripTrailing() (Java 11+):");
        System.out.println("      withSpaces.strip(): \"" + withSpaces.strip() + "\"");
        System.out.println("      withSpaces.stripLeading(): \"" + withSpaces.stripLeading() + "\"");
        System.out.println("      withSpaces.stripTrailing(): \"" + withSpaces.stripTrailing() + "\"");
        
        // 9. Formatting and joining strings
        System.out.println("\n9. Formatting and Joining Strings");
        
        // a) String.format()
        System.out.println("   a) String.format():");
        String formatted = String.format("Name: %s, Age: %d, Height: %.2f", "Alice", 25, 1.75);
        System.out.println("      " + formatted);
        
        // b) String.join()
        System.out.println("\n   b) String.join():");
        String[] fruits = {"Apple", "Banana", "Orange"};
        String joinedString = String.join(", ", fruits);
        System.out.println("      String.join(\", \", fruits): \"" + joinedString + "\"");
        
        // c) repeat() (Java 11+)
        System.out.println("\n   c) repeat() (Java 11+):");
        System.out.println("      repeated: \"" + repeated + "\"");
        System.out.println("      repeated.repeat(4): \"" + repeated.repeat(4) + "\"");
        
        // 10. Useful utilities and special operations
        System.out.println("\n10. Useful Utilities and Special Operations");
        
        // a) valueOf() methods
        System.out.println("   a) valueOf() methods:");
        String strFromInt = String.valueOf(42);
        String strFromBool = String.valueOf(true);
        String strFromChar = String.valueOf('X');
        
        System.out.println("      String.valueOf(42): \"" + strFromInt + "\"");
        System.out.println("      String.valueOf(true): \"" + strFromBool + "\"");
        System.out.println("      String.valueOf('X'): \"" + strFromChar + "\"");
        
        // b) Parsing methods (converting strings to other types)
        System.out.println("\n   b) Parsing methods:");
        int parsedInt = Integer.parseInt("42");
        double parsedDouble = Double.parseDouble("3.14");
        boolean parsedBool = Boolean.parseBoolean("true");
        
        System.out.println("      Integer.parseInt(\"42\"): " + parsedInt);
        System.out.println("      Double.parseDouble(\"3.14\"): " + parsedDouble);
        System.out.println("      Boolean.parseBoolean(\"true\"): " + parsedBool);
        
        // c) intern() method
        System.out.println("\n   c) intern() method:");
        String s1 = new String("Hello").intern();
        String s2 = "Hello";
        
        System.out.println("      s1 == s2 after s1.intern(): " + (s1 == s2));
        
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
