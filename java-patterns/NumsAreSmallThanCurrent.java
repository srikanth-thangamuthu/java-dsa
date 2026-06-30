import java.util.Arrays;

class NumsAreSmallThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    temp++;
                }
            }
            arr[i] = temp;
        }
        return arr;
    }

    // Main method to test the logic
    public static void main(String[] args) {
        NumsAreSmallThanCurrent solver = new NumsAreSmallThanCurrent();

        // Example: nums = [8, 1, 2, 2, 3]
        // For 8: 1, 2, 2, 3 are smaller (4)
        // For 1: none are smaller (0)
        // For 2: 1 is smaller (1)
        // For 2: 1 is smaller (1)
        // For 3: 1, 2, 2 are smaller (3)
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = solver.smallerNumbersThanCurrent(nums);

        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result)); // Expected: [4, 0, 1, 1, 3]
    }
}