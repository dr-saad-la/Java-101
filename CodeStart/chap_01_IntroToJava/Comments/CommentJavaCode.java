
/**
 * This is a Java program to demonstrate different types of comments.
 * Comments are important for explaining code, making it easier to read
 * and maintain.
 */

public class CommentJavaCode {

    public static void main(String[] args) {
        // Single-line comment
        // This type of comment is used to add short explanations or notes
        // It starts with two forward slashes (//) and extends to the end of the line.

        System.out.println("Demonstrating comments in Java");

        /*
         * Multi-line comment
         * This type of comment can span multiple lines.
         * It starts with a forward slash and an asterisk (/*)
         * and ends with an asterisk and a forward slash (//*).
         * Multi-line comments are useful for providing detailed explanations
         * or temporarily disabling blocks of code.
         */
        System.out.println("Multi-line comments can span multiple lines");

        // You can also use multi-line comments to disable code
        /*
        System.out.println("This line is commented out and won't be executed");
        System.out.println("This line is also commented out and won't be executed");
        */

        // Documentation comment
        // Documentation comments are a special type of multi-line comment
        // They start with a forward slash and two asterisks (/**)
        // and end with an asterisk and a forward slash (*/).
        // These comments are used to generate documentation for the code using tools like Javadoc.

        /**
         * This method demonstrates the use of a documentation comment.
         * Documentation comments are used to describe classes, methods, and fields.
         * They can contain HTML tags and special Javadoc tags such as @param and @return.
         *
         * @param message The message to be printed
         */
        printMessage("Documentation comments are used to generate documentation for the code");
    }

    /**
     * Prints a message to the console.
     *
     * @param message The message to be printed
     */
    public static void printMessage(String message) {
        System.out.println(message);
    }
}

