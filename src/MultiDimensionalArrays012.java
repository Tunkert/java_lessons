public class MultiDimensionalArrays012 {
    public static void main(String[] args) {
        // create a 3 x 3 array
        String[][] matrix = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };

        // loop through array (nested for loop 0(n^2) time complexity)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println(matrix[row][col]);
            }
        }
        System.out.println("End of for loop.");
        // print and individual item
        System.out.println(matrix[1][2]); // will print f

        // you can create different length sub-arrays within a multi-dimensional array
        int[][] nums = {
                {1, 2},
                {3, 4, 5},
                {4, 5}
        };

        System.out.println("Start enhanced for: ");
        // loop through nums with enhanced for
        for (int[] num : nums) {
            for (int i : num) {
                System.out.println(i);
            }
        }
    }
}
