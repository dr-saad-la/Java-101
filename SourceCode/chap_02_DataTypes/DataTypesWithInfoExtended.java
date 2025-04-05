public class DataTypesWithInfoExtended {

    // Method to repeat a character n times
    public static String repeatChar(char ch, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    // Method to get the type of a variable
    public static String getType(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getSimpleName();
    }

    // Method to get the size of a variable
    public static int getSize(Object obj) {
        if (obj instanceof Byte) {
            return Byte.BYTES;
        } else if (obj instanceof Short) {
            return Short.BYTES;
        } else if (obj instanceof Integer) {
            return Integer.BYTES;
        } else if (obj instanceof Long) {
            return Long.BYTES;
        } else if (obj instanceof Float) {
            return Float.BYTES;
        } else if (obj instanceof Double) {
            return Double.BYTES;
        } else if (obj instanceof Character) {
            return Character.BYTES;
        } else if (obj instanceof Boolean) {
            return 1;  // Boolean size is not precisely defined, using 1 bit.
        } else if (obj instanceof String) {
            return ((String) obj).length() * Character.BYTES;
        } else {
            return -1; // Unknown type or complex object
        }
    }

    public static void main(String[] args) {
        String banner = repeatChar('=', 40);

        System.out.println(banner);
        System.out.println("        Data Types in Java               ");
        System.out.println(banner);

        // Primitive Data Types
        byte byteVar = 127;                          
        short shortVar = 32767;                      
        int intVar = 2147483647;                     
        long longVar = 9223372036854775807L;         
        float floatVar = 3.14f;                     
        double doubleVar = 3.141592653589793;       
        boolean booleanVar = true;                  
        char charVar = 'A';                         
        // Reference Data Types
        String stringVar = "Hello, World!"; 

        // Print out the values, types, and sizes
        System.out.println("Primitive Data Types:");
        System.out.println("\tbyte: " + byteVar + " (Type: " + getType(byteVar) + ", Size: " + getSize(byteVar) + " bytes)");
        System.out.println("\tshort: " + shortVar + " (Type: " + getType(shortVar) + ", Size: " + getSize(shortVar) + " bytes)");
        System.out.println("\tint: " + intVar + " (Type: " + getType(intVar) + ", Size: " + getSize(intVar) + " bytes)");
        System.out.println("\tlong: " + longVar + " (Type: " + getType(longVar) + ", Size: " + getSize(longVar) + " bytes)");
        System.out.println("\tfloat: " + floatVar + " (Type: " + getType(floatVar) + ", Size: " + getSize(floatVar) + " bytes)");
        System.out.println("\tdouble: " + doubleVar + " (Type: " + getType(doubleVar) + ", Size: " + getSize(doubleVar) + " bytes)");
        System.out.println("\tboolean: " + booleanVar + " (Type: " + getType(booleanVar) + ", Size: " + getSize(booleanVar) + " bytes)");
        System.out.println("\tchar: " + charVar + " (Type: " + getType(charVar) + ", Size: " + getSize(charVar) + " bytes)");

        System.out.println("\nReference Data Types:");
        System.out.println("\tString: " + stringVar + " (Type: " + getType(stringVar) + ", Size: " + getSize(stringVar) + " bytes)");

        System.out.println(banner);
    }
}
