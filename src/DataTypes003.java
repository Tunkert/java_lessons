public class DataTypes003 {
    public static void main(String[] args) {
        // data types .. integer
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // print out integer max and min values
        System.out.println("The max value of an integer is " + maxInt + ".");
        System.out.println("The min value of an integer is " + minInt + ".");

        // doubles
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        // print out double max and min values
        System.out.println("The maximum value of a double is " + maxDouble + ".");
        System.out.println("The minimum value of a double is " + minDouble + ".");

        // lets go short!
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        // print them out
        System.out.println("The maximum value of a short is " + maxShort + ".");
        System.out.println("The minimum value of a short is " + minShort + ".");

        // differentish than doubles
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;

        // print them out, notice the range is smaller than the double.
        System.out.println("The maximum value of a float is " + maxFloat + ".");
        System.out.println("The minimum value of a float is " + minFloat + ".");
    }
}
