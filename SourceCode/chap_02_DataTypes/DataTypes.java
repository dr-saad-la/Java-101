public class DataTypes {

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

        // Print out the values
        System.out.println("Primitive Data Types:");
        System.out.println("\tbyte: " + byteVar);
        System.out.println("\tshort: " + shortVar);
        System.out.println("\tint: " + intVar);
        System.out.println("\tlong: " + longVar);
        System.out.println("\tfloat: " + floatVar);
        System.out.println("\tdouble: " + doubleVar);
        System.out.println("\tboolean: " + booleanVar);
        System.out.println("\tchar: " + charVar);

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringVar);

        System.out.println(banner);
    }
}
