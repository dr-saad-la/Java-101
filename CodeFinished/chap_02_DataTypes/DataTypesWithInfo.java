public class DataTypesWithInfo {

    // Method to repeat a character n times
    public static String repeatChar(char ch, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String banner = repeatChar('=', 40);

        System.out.println(banner);
        System.out.println("        Data Types in Java               ");
        System.out.println(banner);

        // Primitive Data Types
        byte byteVar = 127;                          // 8-bit signed integer
        short shortVar = 32767;                      // 16-bit signed integer
        int intVar = 2147483647;                     // 32-bit signed integer
        long longVar = 9223372036854775807L;         // 64-bit signed integer

        float floatVar = 3.14f;                     // Single-precision 32-bit floating point
        double doubleVar = 3.141592653589793;       // Double-precision 64-bit floating point

        boolean booleanVar = true;                  // Boolean value (true or false)

        char charVar = 'A';                         // Single 16-bit Unicode character

        // Reference Data Types
        String stringVar = "Hello, World!"; // String

        // Print out the values, types, and sizes
        System.out.println("Primitive Data Types:");
        System.out.println("\tbyte: " + byteVar + " (Type: byte, Size: 1 byte)");
        System.out.println("\tshort: " + shortVar + " (Type: short, Size: 2 bytes)");
        System.out.println("\tint: " + intVar + " (Type: int, Size: 4 bytes)");
        System.out.println("\tlong: " + longVar + " (Type: long, Size: 8 bytes)");
        System.out.println("\tfloat: " + floatVar + " (Type: float, Size: 4 bytes)");
        System.out.println("\tdouble: " + doubleVar + " (Type: double, Size: 8 bytes)");
        System.out.println("\tboolean: " + booleanVar + " (Type: boolean, Size: 1 bit)");
        System.out.println("\tchar: " + charVar + " (Type: char, Size: 2 bytes)");

        System.out.println("\nReference Data Types:");
        System.out.println("\tString: " + stringVar + " (Type: String, Size: varies)");

        System.out.println(banner);
    }
}
