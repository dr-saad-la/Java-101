/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Methods and Program Structure
 * LESSON:     7.2 - Method Parameters and Return Types
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

import java.util.Arrays;

public class MethodParametersAndReturnTypes {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("METHOD PARAMETERS AND RETURN TYPES");
        System.out.println("=================================");

        // 1. Parameter passing mechanisms
        System.out.println("\n1. Parameter Passing Mechanisms");
        System.out.println("   - Java uses pass-by-value for all parameter types");
        System.out.println("   - For primitive types, the value itself is copied");
        System.out.println("   - For reference types, the reference is copied (not the object)");

        // a) Pass-by-value with primitives
        System.out.println("\n   a) Pass-by-value with primitives:");
        int number = 10;
        System.out.println("      Before calling method: number = " + number);

        modifyPrimitive(number);

        System.out.println("      After calling method: number = " + number);
        System.out.println("      Note: The original value remains unchanged");

        // b) Pass-by-value with references
        System.out.println("\n   b) Pass-by-value with references:");
        int[] numbers = {1, 2, 3};
        System.out.println("      Before calling method: numbers = " + Arrays.toString(numbers));

        modifyArray(numbers);

        System.out.println("      After calling method: numbers = " + Arrays.toString(numbers));
        System.out.println("      Note: The array elements are modified because the same object is referenced");

        // c) Reassigning references inside methods
        System.out.println("\n   c) Reassigning references inside methods:");
        int[] data = {5, 10, 15};
        System.out.println("      Before calling method: data = " + Arrays.toString(data));

        reassignArray(data);

        System.out.println("      After calling method: data = " + Arrays.toString(data));
        System.out.println("      Note: The original array is unchanged when the reference is reassigned in the method");

        // 2. Primitive type parameters
        System.out.println("\n2. Primitive Type Parameters");
        System.out.println("   - Primitive types include: byte, short, int, long, float, double, char, boolean");

        // a) Example with different primitive types
        System.out.println("   a) Examples with different primitive types:");
        byte byteValue = 10;
        short shortValue = 100;
        int intValue = 1000;
        long longValue = 10000L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159;
        char charValue = 'A';
        boolean boolValue = true;

        System.out.println("      addIntegers(5, 7): " + addIntegers(5, 7));
        System.out.println("      multiplyDoubles(2.5, 4.0): " + multiplyDoubles(2.5, 4.0));
        System.out.println("      isUpperCase('A'): " + isUpperCase('A'));
        System.out.println("      isUpperCase('a'): " + isUpperCase('a'));
        System.out.println("      negate(true): " + negate(true));

        // b) Type conversion in parameters
        System.out.println("\n   b) Type conversion in parameters:");
        System.out.println("      Java automatically performs widening conversions:");

        // Widening conversions (implicit)
        System.out.println("      addIntegers(byteValue, shortValue): " + addIntegers(byteValue, shortValue));
        System.out.println("      multiplyDoubles(floatValue, intValue): " + multiplyDoubles(floatValue, intValue));

        // Narrowing conversions (explicit)
        System.out.println("\n      Narrowing conversions require explicit casting:");
        // This would cause a compile error: int result = longValue;
        int narrowedLong = (int) longValue;
        System.out.println("      (int) longValue: " + narrowedLong);

        // 3. Reference type parameters
        System.out.println("\n3. Reference Type Parameters");
        System.out.println("   - Reference types include objects (String, arrays, custom classes, etc.)");

        // a) String parameters
        System.out.println("   a) String parameters:");
        String greeting = "Hello";
        System.out.println("      Original string: \"" + greeting + "\"");

        String processedGreeting = processString(greeting);

        System.out.println("      After processing: \"" + greeting + "\"");
        System.out.println("      Processed result: \"" + processedGreeting + "\"");
        System.out.println("      Note: Strings are immutable, so the original is unchanged");

        // b) Array parameters
        System.out.println("\n   b) Array parameters:");
        int[] values = {3, 7, 1, 9, 4};
        System.out.println("      Original array: " + Arrays.toString(values));

        sortArray(values);

        System.out.println("      After sorting: " + Arrays.toString(values));
        System.out.println("      Note: Arrays are mutable, so the original is modified");

        // c) Custom object parameters
        System.out.println("\n   c) Custom object parameters:");
        Person person = new Person("John", 30);
        System.out.println("      Original person: " + person);

        incrementAge(person);

        System.out.println("      After incrementing age: " + person);
        System.out.println("      Note: The object's state is modified");

        // 4. Parameter passing patterns
        System.out.println("\n4. Parameter Passing Patterns");

        // a) Input parameters
        System.out.println("   a) Input parameters:");
        System.out.println("      calculateArea(5.0, 3.0): " + calculateArea(5.0, 3.0));

        // b) Output parameters (simulated with arrays or objects)
        System.out.println("\n   b) Output parameters (using objects):");
        Result result = new Result();
        divideWithRemainder(17, 5, result);
        System.out.println("      17 ÷ 5 = " + result.quotient + " remainder " + result.remainder);

        // c) Input-output parameters
        System.out.println("\n   c) Input-output parameters:");
        Counter counter = new Counter(5);
        System.out.println("      Initial counter: " + counter.value);

        incrementCounter(counter);
        System.out.println("      After increment: " + counter.value);

        // 5. Varargs (variable-length argument lists)
        System.out.println("\n5. Varargs (Variable-Length Argument Lists)");
        System.out.println("   - Allows methods to accept a variable number of arguments");
        System.out.println("   - Syntax: methodName(type... paramName)");
        System.out.println("   - Varargs parameter must be the last parameter");

        // a) Basic varargs example
        System.out.println("   a) Basic varargs example:");
        System.out.println("      sum(): " + sum());
        System.out.println("      sum(5): " + sum(5));
        System.out.println("      sum(1, 2, 3): " + sum(1, 2, 3));
        System.out.println("      sum(10, 20, 30, 40, 50): " + sum(10, 20, 30, 40, 50));

        // b) Combining regular parameters with varargs
        System.out.println("\n   b) Combining regular parameters with varargs:");
        System.out.println("      joinWithSeparator(\"-\", \"Java\", \"is\", \"fun\"): " +
                          joinWithSeparator("-", "Java", "is", "fun"));

        // c) Passing arrays to varargs methods
        System.out.println("\n   c) Passing arrays to varargs methods:");
        String[] words = {"This", "is", "an", "array"};
        System.out.println("      joinWithSeparator(\" \", words): " +
                          joinWithSeparator(" ", words));

        // 6. Method return types
        System.out.println("\n6. Method Return Types");
        System.out.println("   - Methods can return a single value of the specified type");
        System.out.println("   - Methods declared as void do not return a value");

        // a) Primitive return types
        System.out.println("   a) Primitive return types:");
        System.out.println("      square(7): " + square(7));
        System.out.println("      calculateCircleArea(3.0): " + calculateCircleArea(3.0));
        System.out.println("      isPositive(-5): " + isPositive(-5));

        // b) Reference return types
        System.out.println("\n   b) Reference return types:");
        int[] generatedArray = generateArray(5);
        System.out.println("      generateArray(5): " + Arrays.toString(generatedArray));

        String reversed = reverseString("Hello");
        System.out.println("      reverseString(\"Hello\"): " + reversed);

        // c) Void return type
        System.out.println("\n   c) Void return type:");
        printMessage("This method doesn't return anything");

        // 7. Returning multiple values
        System.out.println("\n7. Returning Multiple Values");
        System.out.println("   - Java methods can only return a single value");
        System.out.println("   - However, there are several ways to return multiple values");

        // a) Using arrays
        System.out.println("   a) Using arrays:");
        int[] stats = calculateStatistics(new int[]{4, 8, 15, 16, 23, 42});
        System.out.println("      Sum: " + stats[0] + ", Average: " + stats[1]);

        // b) Using custom objects
        System.out.println("\n   b) Using custom objects:");
        Rectangle rect = createRectangle(5.0, 3.0);
        System.out.println("      Rectangle: width=" + rect.width + ", height=" + rect.height +
                          ", area=" + rect.getArea());

        // c) Using holder classes
        System.out.println("\n   c) Using holder classes:");
        MinMax minMax = findMinMax(new int[]{7, 3, 9, 2, 8, 5});
        System.out.println("      Min: " + minMax.min + ", Max: " + minMax.max);

        // 8. Parameter validation
        System.out.println("\n8. Parameter Validation");
        System.out.println("   - Good practice to validate parameters before using them");
        System.out.println("   - Helps detect errors early");

        // a) Basic validation with if statements
        System.out.println("   a) Basic validation with if statements:");
        try {
            System.out.println("      divide(10, 2): " + divide(10, 2));
            System.out.println("      divide(10, 0): " + divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("      Exception caught: " + e.getMessage());
        }

        // b) Null checks
        System.out.println("\n   b) Null checks:");
        try {
            System.out.println("      getStringLength(\"Hello\"): " + getStringLength("Hello"));
            System.out.println("      getStringLength(null): " + getStringLength(null));
        } catch (NullPointerException e) {
            System.out.println("      Exception caught: " + e.getMessage());
        }

        // c) Range and constraint validation
        System.out.println("\n   c) Range and constraint validation:");
        try {
            System.out.println("      createArray(5): " + Arrays.toString(createArray(5)));
            System.out.println("      createArray(-3): " + Arrays.toString(createArray(-3)));
        } catch (IllegalArgumentException e) {
            System.out.println("      Exception caught: " + e.getMessage());
        }

        // 9. Method chaining
        System.out.println("\n9. Method Chaining");
        System.out.println("   - Calling multiple methods in sequence, where each method returns an object");
        System.out.println("   - Allows for fluent and concise code");

        // a) String method chaining
        System.out.println("   a) String method chaining:");
        String processed = "  Hello, World!  "
            .trim()
            .toLowerCase()
            .replace("hello", "hi")
            .concat(" How are you?");

        System.out.println("      Original: \"  Hello, World!  \"");
        System.out.println("      Processed: \"" + processed + "\"");

        // b) Custom class method chaining
        System.out.println("\n   b) Custom class method chaining:");
        Builder builder = new Builder();

        String built = builder
            .append("Hello")
            .append(" ")
            .append("World")
            .append("!")
            .toUpperCase()
            .build();

        System.out.println("      Built string: \"" + built + "\"");

        // 10. Best practices for parameters and return types
        System.out.println("\n10. Best Practices for Parameters and Return Types");

        System.out.println("    a) Parameter best practices:");
        System.out.println("       - Keep the number of parameters small (typically ≤ 4)");
        System.out.println("       - Consider using objects to group related parameters");
        System.out.println("       - Place most important parameters first");
        System.out.println("       - Validate parameters when appropriate");
        System.out.println("       - Use descriptive parameter names");

        System.out.println("\n    b) Return type best practices:");
        System.out.println("       - Return values that are directly useful to the caller");
        System.out.println("       - Be consistent with null returns (avoid if possible)");
        System.out.println("       - Consider returning empty collections instead of null");
        System.out.println("       - Document the return value and its meaning");
        System.out.println("       - For methods that modify object state, consider returning");
        System.out.println("         the modified object for method chaining");

        System.out.println("\n    c) General method design:");
        System.out.println("       - Follow the Single Responsibility Principle");
        System.out.println("       - Methods should either perform actions or return values");
        System.out.println("         (avoid doing both extensively)");
        System.out.println("       - Be consistent with similar methods");
        System.out.println("       - Use clear naming that indicates what the method does");

        displayBanner('*', 72);
    }

    // 1a) Method showing pass-by-value with primitives
    public static void modifyPrimitive(int value) {
        System.out.println("      Inside method (before): value = " + value);
        value = value * 2;
        System.out.println("      Inside method (after): value = " + value);
    }

    // 1b) Method showing pass-by-value with references
    public static void modifyArray(int[] arr) {
        System.out.println("      Inside method (before): arr = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println("      Inside method (after): arr = " + Arrays.toString(arr));
    }

    // 1c) Method showing reference reassignment
    public static void reassignArray(int[] arr) {
        System.out.println("      Inside method (before reassignment): arr = " + Arrays.toString(arr));
        arr = new int[]{100, 200, 300};  // This creates a new array and reassigns the local reference
        System.out.println("      Inside method (after reassignment): arr = " + Arrays.toString(arr));
    }

    // 2a) Methods with primitive parameters
    public static int addIntegers(int a, int b) {
        return a + b;
    }

    public static double multiplyDoubles(double a, double b) {
        return a * b;
    }

    public static boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    public static boolean negate(boolean b) {
        return !b;
    }

    // 3a) Method with String parameter
    public static String processString(String input) {
        return input.toUpperCase() + "!";
    }

    // 3b) Method with array parameter
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    // 3c) Method with custom object parameter
    public static void incrementAge(Person person) {
        person.age++;
    }

    // 4a) Method with input parameters
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // 4b) Method with output parameters
    public static void divideWithRemainder(int dividend, int divisor, Result result) {
        result.quotient = dividend / divisor;
        result.remainder = dividend % divisor;
    }

    // 4c) Method with input-output parameters
    public static void incrementCounter(Counter counter) {
        counter.value++;
    }

    // 5a) Method with varargs
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // 5b) Method with regular parameters and varargs
    public static String joinWithSeparator(String separator, String... strings) {
        if (strings.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            result.append(separator).append(strings[i]);
        }

        return result.toString();
    }

    // 6a) Methods with primitive return types
    public static int square(int num) {
        return num * num;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    // 6b) Methods with reference return types
    public static int[] generateArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // 6c) Method with void return type
    public static void printMessage(String message) {
        System.out.println("      Message: " + message);
    }

    // 7a) Method returning multiple values using an array
    public static int[] calculateStatistics(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        int average = sum / numbers.length;

        return new int[]{sum, average};
    }

    // 7b) Method returning a custom object
    public static Rectangle createRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    // 7c) Method returning a holder class
    public static MinMax findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new MinMax(min, max);
    }

    // 8a) Method with basic validation
    public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) dividend / divisor;
    }

    // 8b) Method with null check
    public static int getStringLength(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        return str.length();
    }

    // 8c) Method with range validation
    public static int[] createArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Array size must be positive");
        }
        return new int[size];
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Inner classes for demonstration

    // Used for 3c
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (age " + age + ")";
        }
    }

    // Used for 4b
    static class Result {
        int quotient;
        int remainder;
    }

    // Used for 4c
    static class Counter {
        int value;

        public Counter(int value) {
            this.value = value;
        }
    }

    // Used for 7b
    static class Rectangle {
        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }
    }

    // Used for 7c
    static class MinMax {
        int min;
        int max;

        public MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    // Used for 9b
    static class Builder {
        private StringBuilder sb = new StringBuilder();

        public Builder append(String text) {
            sb.append(text);
            return this;
        }

        public Builder toUpperCase() {
            String content = sb.toString().toUpperCase();
            sb = new StringBuilder(content);
            return this;
        }

        public String build() {
            return sb.toString();
        }
    }
}
