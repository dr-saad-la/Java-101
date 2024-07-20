// This is a Java program that prints "Hello world!!!" to the console.

// The 'public' keyword is an access modifier that makes the class accessible by any other class.
public class HelloWorldDocumented {

    // The 'public' keyword makes the method accessible from any other class.
    // The 'static' keyword means that the method belongs to the class, not instances of the class.
    // The 'void' keyword means that the method does not return any value.
    // 'main' is the name of the method. It is the entry point for any Java application.
    // 'String[] args' is a parameter that is an array of strings. It stores command-line arguments.
    public static void main(String[] args) {
        System.out.println("========================================\n");
        System.out.println("This is a very simple program in Java");
        
        // 'System' is a class from the 'java.lang' package.
        // 'out' is a static member of the 'System' class. It is an instance of 'PrintStream' and represents the standard output stream.
        // 'println' is a method of 'PrintStream' that prints a line of text to the console.
        // In this case, it prints "Hello world!!!" to the console.
        System.out.println("Hello world!!!");

        System.out.println("The end of the program");
        System.out.println("========================================\n");
    }

    // Closing curly brace for the class 'HelloWorld'.
}
// Closing curly brace for the main method.
