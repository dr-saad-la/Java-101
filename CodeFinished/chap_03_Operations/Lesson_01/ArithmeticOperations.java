public class ArithmeticOperations {

    public static void main(String[] args) {
        String banner = repeatChar('=', 50);

        // String text = "Numeric Operations in Java";
        // int width = 52;
        
        // String centeredText = centerText(text, width);
        System.out.println(banner);
        System.out.println(centerText("Numeric Operations in Java", 50));
        System.out.println(banner);
        
        // Declare numeric variables
        int intA = 10;
        int intB = 20;
        double doubleA = 15.5;
        double doubleB = 4.5;

        // Arithmetic Operations
        System.out.println(centerText("Arithmetic Operations:", 50));

        System.out.println("intA + intB = " + (intA + intB));  // Addition
        System.out.println("intA - intB = " + (intA - intB));  // Subtraction
        System.out.println("intA * intB = " + (intA * intB));  // Multiplication
        System.out.println("intA / intB = " + (intA / intB));  // Division
        System.out.println("intA % intB = " + (intA % intB));  // Modulus

        System.out.println("doubleA + doubleB = " + (doubleA + doubleB));  // Addition
        System.out.println("doubleA - doubleB = " + (doubleA - doubleB));  // Subtraction
        System.out.println("doubleA * doubleB = " + (doubleA * doubleB));  // Multiplication
        System.out.println("doubleA / doubleB = " + (doubleA / doubleB));  // Division
        System.out.println("doubleA % doubleB = " + (doubleA % doubleB));  // Modulus

        // Relational Operations
        System.out.println("\nRelational Operations:");
        System.out.println("intA == intB = " + (intA == intB));  // Equal to
        System.out.println("intA != intB = " + (intA != intB));  // Not equal to
        System.out.println("intA > intB = " + (intA > intB));    // Greater than
        System.out.println("intA < intB = " + (intA < intB));    // Less than
        System.out.println("intA >= intB = " + (intA >= intB));  // Greater than or equal to
        System.out.println("intA <= intB = " + (intA <= intB));  // Less than or equal to

        // Bitwise Operations
        System.out.println("\nBitwise Operations:");
        System.out.println("intA & intB = " + (intA & intB));  // Bitwise AND
        System.out.println("intA | intB = " + (intA | intB));  // Bitwise OR
        System.out.println("intA ^ intB = " + (intA ^ intB));  // Bitwise XOR
        System.out.println("~intA = " + (~intA));              // Bitwise NOT
        System.out.println("intA << 2 = " + (intA << 2));      // Left shift
        System.out.println("intA >> 2 = " + (intA >> 2));      // Right shift
        System.out.println("intA >>> 2 = " + (intA >>> 2));    // Unsigned right shift

        // Type Casting
        System.out.println("\nType Casting:");
        int intC = (int) doubleA;  // Casting double to int
        double doubleC = intA;     // Implicit casting int to double
        System.out.println("Casting doubleA to int: " + intC);
        System.out.println("Implicit casting intA to double: " + doubleC);

        System.out.println(banner);
    }

    // Method to repeat a character n times and used as a banner
    public static String repeatChar(char ch, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    // Method to center text within a given width
    public static String centerText(String text, int width) {
        if (text.length() >= width) {
            return text;
        }
        
        int padding = width - text.length();
        int paddingLeft = padding / 2;
        int paddingRight = padding - paddingLeft;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paddingLeft; i++) {
            sb.append(' ');
        }
        sb.append(text);
        for (int i = 0; i < paddingRight; i++) {
            sb.append(' ');
        }
        
        return sb.toString();
    }
}
