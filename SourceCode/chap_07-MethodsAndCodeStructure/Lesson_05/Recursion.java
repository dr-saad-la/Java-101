/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Methods and Program Structure
 * LESSON:     7.5 - Recursion
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        displayBanner('*', 72);
        System.out.println("RECURSION");
        System.out.println("=========");

        // 1. Introduction to recursion
        System.out.println("\n1. Introduction to Recursion");
        System.out.println("   - Recursion is a programming technique where a method calls itself");
        System.out.println("   - It's used to solve problems that can be broken down into simpler subproblems");
        System.out.println("   - Every recursive solution requires at least one base case to terminate");
        System.out.println("   - Recursive calls create a new stack frame for each invocation");

        // 2. Basic recursion example: Factorial
        System.out.println("\n2. Basic Recursion Example: Factorial");
        System.out.println("   - The factorial of n (written as n!) is the product of all positive integers ≤ n");
        System.out.println("   - For example: 5! = 5 × 4 × 3 × 2 × 1 = 120");
        System.out.println("   - Recursive definition: n! = n × (n-1)! and 0! = 1 (base case)");

        System.out.println("\n   Factorial calculation examples:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("   factorial(" + i + ") = " + factorial(i));
        }

        // 3. Understanding the call stack
        System.out.println("\n3. Understanding the Call Stack");
        System.out.println("   - Each method call creates a stack frame on the call stack");
        System.out.println("   - The stack frame stores local variables and the return address");
        System.out.println("   - Let's trace the execution of factorial(4):");

        System.out.println("\n   factorial(4)");
        System.out.println("   = 4 × factorial(3)");
        System.out.println("   = 4 × (3 × factorial(2))");
        System.out.println("   = 4 × (3 × (2 × factorial(1)))");
        System.out.println("   = 4 × (3 × (2 × (1 × factorial(0))))");
        System.out.println("   = 4 × (3 × (2 × (1 × 1)))");
        System.out.println("   = 4 × (3 × (2 × 1))");
        System.out.println("   = 4 × (3 × 2)");
        System.out.println("   = 4 × 6");
        System.out.println("   = 24");

        System.out.println("\n   Call stack diagram (grows downward):");
        System.out.println("   +---------------------+");
        System.out.println("   | main()             | ← Initial method");
        System.out.println("   +---------------------+");
        System.out.println("   | factorial(4)       | ← First recursive call");
        System.out.println("   +---------------------+");
        System.out.println("   | factorial(3)       | ← Second recursive call");
        System.out.println("   +---------------------+");
        System.out.println("   | factorial(2)       | ← Third recursive call");
        System.out.println("   +---------------------+");
        System.out.println("   | factorial(1)       | ← Fourth recursive call");
        System.out.println("   +---------------------+");
        System.out.println("   | factorial(0)       | ← Base case reached");
        System.out.println("   +---------------------+");

        // 4. Common recursive algorithms: Fibonacci
        System.out.println("\n4. Common Recursive Algorithms: Fibonacci");
        System.out.println("   - The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...");
        System.out.println("   - Each number is the sum of the two preceding ones");
        System.out.println("   - Recursive definition: fib(n) = fib(n-1) + fib(n-2), with fib(0) = 0 and fib(1) = 1");

        System.out.println("\n   Fibonacci sequence (first 10 numbers):");
        System.out.print("   ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // 5. Recursion vs. iteration
        System.out.println("\n5. Recursion vs. Iteration");
        System.out.println("   - Many recursive algorithms can be rewritten using iteration (loops)");
        System.out.println("   - Let's compare recursive and iterative approaches for factorial:");

        int n = 5;
        long startTime, endTime;

        // Recursive factorial
        startTime = System.nanoTime();
        long recursiveResult = factorial(n);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Iterative factorial
        startTime = System.nanoTime();
        long iterativeResult = factorialIterative(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        System.out.println("\n   Factorial of " + n + ":");
        System.out.println("   - Recursive approach: " + recursiveResult);
        System.out.println("     Time: " + recursiveTime + " ns");
        System.out.println("   - Iterative approach: " + iterativeResult);
        System.out.println("     Time: " + iterativeTime + " ns");

        System.out.println("\n   Considerations:");
        System.out.println("   - Recursion is often more elegant and easier to understand");
        System.out.println("   - Iteration is typically more efficient (no overhead of function calls)");
        System.out.println("   - Recursion can lead to stack overflow for large inputs");
        System.out.println("   - Iteration may require additional data structures to replace the call stack");

        // 6. Tail recursion
        System.out.println("\n6. Tail Recursion");
        System.out.println("   - A special form of recursion where the recursive call is the last operation");
        System.out.println("   - Can be optimized by the compiler into iteration (tail call optimization)");
        System.out.println("   - Note: Java does not currently implement tail call optimization");

        System.out.println("\n   Regular recursive factorial vs. tail recursive factorial:");

        // Regular recursive factorial (as shown earlier)
        System.out.println("   factorial(5) = " + factorial(5));

        // Tail recursive factorial
        System.out.println("   factorialTail(5, 1) = " + factorialTail(5, 1));

        // 7. Recursive data structures
        System.out.println("\n7. Recursive Data Structures");
        System.out.println("   - Some data structures are naturally recursive (e.g., trees, linked lists)");
        System.out.println("   - Let's implement a simple binary tree and recursive traversal:");

        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("\n   Binary tree structure:");
        System.out.println("        1");
        System.out.println("       / \\");
        System.out.println("      2   3");
        System.out.println("     / \\ / \\");
        System.out.println("    4  5 6  7");

        System.out.println("\n   Tree traversals:");

        System.out.print("   - In-order traversal:   ");
        inOrderTraversal(root);
        System.out.println();

        System.out.print("   - Pre-order traversal:  ");
        preOrderTraversal(root);
        System.out.println();

        System.out.print("   - Post-order traversal: ");
        postOrderTraversal(root);
        System.out.println();

        // 8. Recursive problem solving: Tower of Hanoi
        System.out.println("\n8. Recursive Problem Solving: Tower of Hanoi");
        System.out.println("   - A classic problem that demonstrates the power of recursion");
        System.out.println("   - Goal: Move a stack of disks from one peg to another");
        System.out.println("   - Rules: Only move one disk at a time, and never place a larger disk on a smaller one");

        int disks = 3;
        System.out.println("\n   Solution for " + disks + " disks:");

        solveHanoi(disks, 'A', 'C', 'B');

        // 9. Backtracking: A powerful recursive technique
        System.out.println("\n9. Backtracking: A Powerful Recursive Technique");
        System.out.println("   - Backtracking is used to find all (or some) solutions to a problem");
        System.out.println("   - It incrementally builds candidates and abandons those that cannot work");

        // Example: Generate all binary strings of length n
        int length = 3;
        System.out.println("\n   All binary strings of length " + length + ":");

        char[] binary = new char[length];
        generateBinaryStrings(binary, 0);

        // 10. Stack overflow and recursion limits
        System.out.println("\n10. Stack Overflow and Recursion Limits");
        System.out.println("    - Each recursive call adds a frame to the call stack");
        System.out.println("    - Too many recursive calls can cause a StackOverflowError");
        System.out.println("    - The maximum recursion depth depends on the available stack size");

        System.out.println("\n    Demonstration of deep recursion:");
        try {
            System.out.println("    factorial(20) = " + factorial(20));
            System.out.println("    This works fine.");

            System.out.println("\n    For demonstration purposes, we'll avoid actually causing a stack overflow.");
            System.out.println("    In practice, a method like factorial(10000) would likely cause:");
            System.out.println("    Exception in thread \"main\" java.lang.StackOverflowError");
        } catch (StackOverflowError e) {
            System.out.println("    StackOverflowError caught!");
        }

        // 11. Techniques to avoid stack overflow
        System.out.println("\n11. Techniques to Avoid Stack Overflow");

        System.out.println("    a) Use tail recursion when possible:");
        System.out.println("       - Allows for potential compiler optimization");
        System.out.println("       - factorialTail(5, 1) = " + factorialTail(5, 1));

        System.out.println("\n    b) Use memoization to avoid redundant calculations:");
        System.out.println("       - Stores previously computed results to avoid recalculation");
        System.out.println("       - Particularly useful for Fibonacci and similar problems");

        // Reset fibonacci cache
        fibCache = new long[100];
        Arrays.fill(fibCache, -1);
        fibCache[0] = 0;
        fibCache[1] = 1;

        System.out.println("       - fibonacciMemoized(40) = " + fibonacciMemoized(40));

        System.out.println("\n    c) Convert to iteration when appropriate:");
        System.out.println("       - Often more efficient and less prone to stack overflow");
        System.out.println("       - Shown earlier with factorialIterative()");

        // 12. Practical examples of recursion
        System.out.println("\n12. Practical Examples of Recursion");

        // a) Calculating the sum of an array
        System.out.println("    a) Sum of array elements:");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("       Array: " + Arrays.toString(numbers));
        System.out.println("       Sum: " + sumArray(numbers, 0));

        // b) Binary search
        System.out.println("\n    b) Binary search:");
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 60;
        int index = binarySearch(sortedArray, target, 0, sortedArray.length - 1);

        System.out.println("       Array: " + Arrays.toString(sortedArray));
        System.out.println("       Searching for: " + target);

        if (index != -1) {
            System.out.println("       Found at index: " + index);
        } else {
            System.out.println("       Not found in array");
        }

        // c) Palindrome check
        System.out.println("\n    c) Palindrome check:");
        String[] testStrings = {"radar", "hello", "level", "Java"};

        for (String str : testStrings) {
            System.out.println("       \"" + str + "\" is " +
                              (isPalindrome(str, 0, str.length() - 1) ? "" : "not ") +
                              "a palindrome");
        }

        displayBanner('*', 72);
    }

    // 2. Factorial - recursive implementation
    public static long factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    // 4. Fibonacci - recursive implementation
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 5. Factorial - iterative implementation
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 6. Factorial - tail recursive implementation
    public static long factorialTail(int n, long accumulator) {
        // Base case
        if (n <= 1) {
            return accumulator;
        }
        // Recursive case (tail call)
        return factorialTail(n - 1, n * accumulator);
    }

    // 7. Tree traversal methods
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

    public static void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    // 8. Tower of Hanoi solution
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("   Move disk 1 from peg " + source + " to peg " + destination);
            return;
        }

        solveHanoi(n - 1, source, auxiliary, destination);
        System.out.println("   Move disk " + n + " from peg " + source + " to peg " + destination);
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    // 9. Generate all binary strings of length n
    public static void generateBinaryStrings(char[] binary, int position) {
        if (position == binary.length) {
            System.out.println("   " + new String(binary));
            return;
        }

        // Put '0' at current position and recurse
        binary[position] = '0';
        generateBinaryStrings(binary, position + 1);

        // Put '1' at current position and recurse
        binary[position] = '1';
        generateBinaryStrings(binary, position + 1);
    }

    // 11b. Fibonacci with memoization
    private static long[] fibCache = new long[100];

    public static long fibonacciMemoized(int n) {
        // Check if result is already in cache
        if (fibCache[n] != -1) {
            return fibCache[n];
        }

        // Calculate and store in cache
        if (n <= 1) {
            return n;
        }

        fibCache[n] = fibonacciMemoized(n - 1) + fibonacciMemoized(n - 2);
        return fibCache[n];
    }

    // 12a. Sum of array elements
    public static int sumArray(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    // 12b. Binary search
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;  // Element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;  // Element found
        }

        if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);  // Search left half
        } else {
            return binarySearch(arr, target, mid + 1, right);  // Search right half
        }
    }

    // 12c. Palindrome check
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive case
        return isPalindrome(str, start + 1, end - 1);
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // TreeNode class for binary tree example
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
