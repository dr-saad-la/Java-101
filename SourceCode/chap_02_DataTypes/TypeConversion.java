/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Introduction to Java Fundamentals
 * LESSON:     1.4 - Type Conversion & Casting
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    March 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class TypeConversion {
    // Method to repeat a character n times for creating banners
    public static String repeatChar(char ch, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String banner = repeatChar('=', 60);
        System.out.println(banner);
        System.out.println("          Type Conversion and Casting in Java          ");
        System.out.println(banner);

        // 1. Implicit Conversion (Widening)
        System.out.println("1. IMPLICIT CONVERSION (Widening)");
        System.out.println("   Automatic conversion from smaller to larger data types");
        System.out.println("   byte → short → int → long → float → double");

        byte byteValue = 100;
        short shortValue = byteValue;  // Implicit conversion from byte to short
        int intValue = shortValue;     // Implicit conversion from short to int
        long longValue = intValue;     // Implicit conversion from int to long
        float floatValue = longValue;  // Implicit conversion from long to float
        double doubleValue = floatValue; // Implicit conversion from float to double

        System.out.println("\n   Example: byte value " + byteValue +
                           " is widened through the type hierarchy:");
        System.out.println("   byte: " + byteValue);
        System.out.println("   short: " + shortValue);
        System.out.println("   int: " + intValue);
        System.out.println("   long: " + longValue);
        System.out.println("   float: " + floatValue);
        System.out.println("   double: " + doubleValue);

        System.out.println("\n   Note: No explicit casting is required for widening.");

        // 2. Explicit Casting (Narrowing)
        System.out.println("\n2. EXPLICIT CASTING (Narrowing)");
        System.out.println("   Conversion from larger to smaller data types");
        System.out.println("   double → float → long → int → short → byte");
        System.out.println("   Requires explicit casting and may lose information");

        double largeDouble = 123456789.123456789;
        float largeFloat = (float) largeDouble;    // Explicit cast, precision loss
        long largeLong = (long) largeFloat;        // Explicit cast, decimal part loss
        int largeInt = (int) largeLong;            // Explicit cast, possible value loss
        short largeShort = (short) largeInt;       // Explicit cast, possible value loss
        byte largeByte = (byte) largeShort;        // Explicit cast, possible value loss

        System.out.println("\n   Example: double value " + largeDouble +
                           " is narrowed through explicit casting:");
        System.out.println("   double: " + largeDouble);
        System.out.println("   float (after cast): " + largeFloat + " (precision loss)");
        System.out.println("   long (after cast): " + largeLong + " (decimal part lost)");
        System.out.println("   int (after cast): " + largeInt);
        System.out.println("   short (after cast): " + largeShort + " (possible value truncation)");
        System.out.println("   byte (after cast): " + largeByte + " (significant value loss)");

        // 3. Potential Data Loss Scenarios
        System.out.println("\n3. POTENTIAL DATA LOSS SCENARIOS");

        // Example 1: Overflow
        int bigNumber = 130;
        byte smallByte = (byte) bigNumber;
        System.out.println("\n   Example 1 - Overflow:");
        System.out.println("   int value: " + bigNumber);
        System.out.println("   byte value after cast: " + smallByte);
        System.out.println("   Explanation: 130 exceeds byte's max value (127), so it wraps around.");

        // Example 2: Precision Loss
        double preciseValue = 3.14159265359;
        float lessPresiceValue = (float) preciseValue;
        System.out.println("\n   Example 2 - Precision Loss:");
        System.out.println("   double value: " + preciseValue);
        System.out.println("   float value after cast: " + lessPresiceValue);
        System.out.println("   Explanation: float has fewer significant digits than double.");

        // Example 3: Truncation
        double valueWithDecimal = 9.9;
        int truncatedValue = (int) valueWithDecimal;
        System.out.println("\n   Example 3 - Truncation:");
        System.out.println("   double value: " + valueWithDecimal);
        System.out.println("   int value after cast: " + truncatedValue);
        System.out.println("   Explanation: Casting from floating point to integer truncates decimal part.");

        // 4. Converting Between Primitives and Wrapper Classes
        System.out.println("\n4. CONVERTING BETWEEN PRIMITIVES AND WRAPPER CLASSES");

        // Primitive to Wrapper (Boxing)
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);  // Explicit boxing
        Integer autoboxedInt = primitiveInt;                // Autoboxing (Java does this automatically)

        System.out.println("\n   4.1 Primitive to Wrapper (Boxing):");
        System.out.println("   Primitive int: " + primitiveInt);
        System.out.println("   Explicitly boxed: " + wrappedInt);
        System.out.println("   Autoboxed: " + autoboxedInt);

        // Wrapper to Primitive (Unboxing)
        Double wrappedDouble = Double.valueOf(3.14);
        double primitiveDouble = wrappedDouble.doubleValue();  // Explicit unboxing
        double autounboxedDouble = wrappedDouble;              // Auto-unboxing

        System.out.println("\n   4.2 Wrapper to Primitive (Unboxing):");
        System.out.println("   Wrapper Double: " + wrappedDouble);
        System.out.println("   Explicitly unboxed: " + primitiveDouble);
        System.out.println("   Auto-unboxed: " + autounboxedDouble);

        // String conversions
        System.out.println("\n   4.3 String Conversions:");

        // String to primitive
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        double parsedDouble = Double.parseDouble("456.789");

        System.out.println("   String to primitive:");
        System.out.println("   String value: \"" + numberString + "\"");
        System.out.println("   Parsed int: " + parsedInt);
        System.out.println("   Parsed double: " + parsedDouble);

        // Primitive to String
        int number = 789;
        String convertedString = Integer.toString(number);
        String formattedFloat = String.format("%.2f", 3.14159);

        System.out.println("\n   Primitive to String:");
        System.out.println("   Int value: " + number);
        System.out.println("   Converted to String: \"" + convertedString + "\"");
        System.out.println("   Formatted float: \"" + formattedFloat + "\"");

        System.out.println(banner);
    }
}
