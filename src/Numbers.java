public class Numbers {
    public static int square(int num) {
        return num * num;
    }

    /**
     * Takes in a base and a power and returns the exponent value
     * @param base
     * @param power
     * @return product, the exponent value
     */
    public static int exponent(int base, int power) {
        int product = 1;
        for (int i = 0; i < power; i++) {
            product *= base;
        }
        return product;
    }

    /**
     * Takes in no parameters
     * @return The string "You're a dingleberry"
     */
    public static String insult() {
        return "You're a dingleberry.";
    }

    /**
     * Name: sayHi
     * Purpose: prints "Hi!" to the screen, in other words it's completely useless.
     */
    public static void sayHi() {
        System.out.println("Hi!");
    }
}
