public class Arrays010 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // print first item in the list
        System.out.println(nums[0]);
        // print out the last item in the list
        System.out.println(nums[nums.length - 1]);

        // create a new array that is 10 items long
        int[] nums2 = new int[10];
        // populate array
        for (int j = 0; j < nums2.length; j++) {
            nums2[j] = j + 1;
        }
        System.out.println("Foreach loop starts here");
        // print out nums2 array using foreach
        for (int num : nums2) {
            System.out.println(num);
        }
    }
}
