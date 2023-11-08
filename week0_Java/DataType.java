public class JavaBasicsPractice {

    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bool;
    static char c;

    public static void main(String[] args) {
        // DefaultValues
        System.out.println("Default values:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);

        // ByteToBinary
        byte bValue = 10;
        System.out.println("Binary representation of " + bValue + ": " + toBinaryString(bValue));

        // ArraySpaceComparison
        short[] arr_short = {1, 2, 3};
        int[] arr_int = {1, 2, 3};
        System.out.println("Short array size: " + 2 * arr_short.length);
        System.out.println("Int array size: " + 4 * arr_int.length);

        // IntRange
        System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // LongInitialization
        long longValue = 10000000000L;
        System.out.println(longValue);

        // FloatVsDouble
        float floatValue = 1.234567890123456789f;
        double doubleValue = 1.234567890123456789;
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        // ShortInRangeOfByte
        short shortValue = 16;
        System.out.println("The result is: " + (shortValue <= Byte.MAX_VALUE && shortValue >= Byte.MIN_VALUE));

        // NextUnicodeChar
        char charValue = 'A';
        System.out.println("Next char: " + nextChar(charValue));
    }

    public static String toBinaryString(byte b) {
        return String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
    }

    public static char nextChar(char input) {
        return (char) (input + 1);
    }
}

// Summary of Mistakes:
// - Local variables must be initialized before use.
// - The main method should always have the signature 'public static void main(String[] args)'.
// - Direct casting from byte to String is not possible, use Integer.toBinaryString for binary representation.
// - Always check both upper and lower bounds when comparing ranges.
