/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Methods and Program Structure
 * LESSON:     7.1 - Method Declaration and Invocation
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class MethodDeclarationAndInvocation {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("METHOD DECLARATION AND INVOCATION");
        System.out.println("================================");

        // 1. Introduction to methods
        System.out.println("\n1. Introduction to Methods");
        System.out.println("   - Methods are reusable blocks of code that perform specific tasks");
        System.out.println("   - Methods improve code organization, reusability, and maintainability");
        System.out.println("   - They encapsulate logic and help implement abstraction");
        System.out.println("   - Every Java program has at least one method: main()");

        // 2. Method declaration syntax
        System.out.println("\n2. Method Declaration Syntax");
        System.out.println("   Basic syntax:");
        System.out.println("   [modifiers] returnType methodName([parameters]) [throws exceptions] {");
        System.out.println("       // Method body");
        System.out.println("       [return statement;]");
        System.out.println("   }");

        System.out.println("\n   Components explained:");
        System.out.println("   - modifiers: public, private, protected, static, final, abstract, etc.");
        System.out.println("   - returnType: data type of the value returned, or void for no return value");
        System.out.println("   - methodName: identifier following Java naming conventions");
        System.out.println("   - parameters: comma-separated list of input parameters (optional)");
        System.out.println("   - exceptions: types of exceptions the method may throw (optional)");
        System.out.println("   - return statement: returns a value of the specified return type (if not void)");

        // 3. Simple method examples
        System.out.println("\n3. Simple Method Examples");

        // Demonstrate a simple void method
        System.out.println("   a) Void method with no parameters:");
        greet();

        // Demonstrate a method that returns a value
        System.out.println("\n   b) Method with a return value:");
        int sum = add(5, 7);
        System.out.println("      add(5, 7) returned: " + sum);

        // Demonstrate a method with multiple parameters
        System.out.println("\n   c) Method with multiple parameters:");
        double average = calculateAverage(85.5, 90.0, 78.5);
        System.out.println("      Average of 85.5, 90.0, and 78.5: " + average);

        // 4. Method parameters
        System.out.println("\n4. Method Parameters");
        System.out.println("   - Parameters allow methods to receive input values");
        System.out.println("   - They are declared in the method signature");

        // Demonstrate method with primitive parameters
        System.out.println("\n   a) Primitive type parameters:");
        int x = 10;
        int y = 20;
        System.out.println("      Before call: x = " + x + ", y = " + y);

        swap(x, y);

        System.out.println("      After call: x = " + x + ", y = " + y);
        System.out.println("      Note: Values remain unchanged (pass-by-value)");

        // Demonstrate method with reference parameters
        System.out.println("\n   b) Reference type parameters:");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("      Before call: numbers = [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        modifyArray(numbers);

        System.out.print("      After call: numbers = [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("      Note: Array elements are modified (reference is passed by value)");

        // 5. Return values
        System.out.println("\n5. Return Values");
        System.out.println("   - Methods can return values using the return statement");
        System.out.println("   - The return type must match the declared return type in the method signature");
        System.out.println("   - Methods declared as void do not return a value");

        // Demonstrate various return types
        System.out.println("\n   a) Different return types:");
        int intResult = square(7);
        double doubleResult = getPI();
        boolean boolResult = isEven(10);
        String stringResult = getGreeting("John");

        System.out.println("      square(7): " + intResult);
        System.out.println("      getPI(): " + doubleResult);
        System.out.println("      isEven(10): " + boolResult);
        System.out.println("      getGreeting(\"John\"): " + stringResult);

        // Demonstrate early returns
        System.out.println("\n   b) Early returns:");
        System.out.println("      getLetterGrade(95): " + getLetterGrade(95));
        System.out.println("      getLetterGrade(85): " + getLetterGrade(85));
        System.out.println("      getLetterGrade(75): " + getLetterGrade(75));
        System.out.println("      getLetterGrade(65): " + getLetterGrade(65));
        System.out.println("      getLetterGrade(55): " + getLetterGrade(55));

        // 6. Method invocation
        System.out.println("\n6. Method Invocation");
        System.out.println("   - Methods are called (invoked) by using their name followed by parentheses");
        System.out.println("   - Arguments are provided within the parentheses if the method has parameters");

        // Different ways to invoke methods
        System.out.println("\n   a) Basic method calls:");
        printMessage("Hello, world!");

        int result = multiply(6, 7);
        System.out.println("      multiply(6, 7): " + result);

        // Method calls as arguments to other methods
        System.out.println("\n   b) Method calls as arguments:");
        int nestedResult = add(square(3), square(4));
        System.out.println("      add(square(3), square(4)): " + nestedResult);

        // Calling methods on objects
        System.out.println("\n   c) Calling methods on objects:");
        String text = "Java Programming";
        System.out.println("      text.length(): " + text.length());
        System.out.println("      text.toUpperCase(): " + text.toUpperCase());

        // 7. Static vs instance methods
        System.out.println("\n7. Static vs Instance Methods");
        System.out.println("   - Static methods belong to the class and not to any instance of the class");
        System.out.println("   - Instance methods belong to objects (instances of a class)");

        // Demonstrate static methods
        System.out.println("\n   a) Static methods:");
        System.out.println("      Math.max(10, 20): " + Math.max(10, 20));
        System.out.println("      Math.sqrt(25): " + Math.sqrt(25));

        // Demonstrate instance methods
        System.out.println("\n   b) Instance methods:");
        Calculator calc = new Calculator();
        System.out.println("      calc.add(15, 25): " + calc.add(15, 25));
        System.out.println("      calc.subtract(50, 30): " + calc.subtract(50, 30));

        // 8. Method overloading
        System.out.println("\n8. Method Overloading");
        System.out.println("   - Multiple methods can have the same name with different parameters");
        System.out.println("   - Return type alone is not sufficient for overloading");

        // Demonstrate method overloading
        System.out.println("\n   Examples of overloaded methods:");
        System.out.println("      sum(3, 5): " + sum(3, 5));
        System.out.println("      sum(3, 5, 7): " + sum(3, 5, 7));
        System.out.println("      sum(3.5, 2.5): " + sum(3.5, 2.5));

        // 9. Recursive methods
        System.out.println("\n9. Recursive Methods");
        System.out.println("   - Methods that call themselves");
        System.out.println("   - Require a base case to prevent infinite recursion");

        // Demonstrate recursion with factorial
        System.out.println("\n   a) Factorial calculation using recursion:");
        for (int i = 0; i <= 5; i++) {
            System.out.println("      factorial(" + i + "): " + factorial(i));
        }

        // Demonstrate Fibonacci sequence
        System.out.println("\n   b) Fibonacci sequence using recursion:");
        System.out.print("      Fibonacci sequence (first 10 numbers): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // 10. Method best practices
        System.out.println("\n10. Method Best Practices");

        System.out.println("    a) Naming conventions:");
        System.out.println("       - Use verbs for method names (e.g., calculateTotal, processPayment)");
        System.out.println("       - Follow camelCase convention (e.g., displayMessage, computeAverage)");
        System.out.println("       - Be descriptive and clear about the method's purpose");

        System.out.println("\n    b) Method design principles:");
        System.out.println("       - Single Responsibility: Each method should do one thing well");
        System.out.println("       - Keep methods small and focused");
        System.out.println("       - Limit the number of parameters (typically 3-4 max)");
        System.out.println("       - Consider creating a class for related parameters");

        System.out.println("\n    c) Documentation:");
        System.out.println("       - Add Javadoc comments for methods, especially in public APIs");
        System.out.println("       - Document parameters, return values, and exceptions");
        System.out.println("       - Include examples for complex methods");

        displayBanner('*', 72);
    }

    // Simple method with no parameters and no return value
    public static void greet() {
        System.out.println("      Hello! This is a simple method.");
    }

    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with multiple parameters
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Method demonstrating pass-by-value for primitives
    public static void swap(int a, int b) {
        System.out.println("      Inside swap: before swap, a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("      Inside swap: after swap, a = " + a + ", b = " + b);
    }

    // Method demonstrating pass-by-value for references
    public static void modifyArray(int[] arr) {
        System.out.print("      Inside modifyArray: before modification, arr = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Modify the array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        System.out.print("      Inside modifyArray: after modification, arr = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Method with int return type
    public static int square(int number) {
        return number * number;
    }

    // Method with double return type
    public static double getPI() {
        return 3.14159265359;
    }

    // Method with boolean return type
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method with String return type
    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }

    // Method with early returns
    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method for demonstration
    public static void printMessage(String message) {
        System.out.println("      Message: " + message);
    }

    // Method for demonstration
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded methods
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;  // Base case
        } else {
            return n * factorial(n - 1);  // Recursive case
        }
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base cases: fib(0) = 0, fib(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
        }
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Inner class for demonstration
    static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }
    }
}
