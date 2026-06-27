
    import java.util.Arrays; // Required for Arrays.sort() and Arrays.toString()

public class SquareAndSort {
    // Your original logic kept exactly intact
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    // The main function to execute and run your solution
    public static void main(String[] args) {
        SquareAndSort solution = new SquareAndSort();

        // Test Case 1: Mixed negative and positive numbers
        int[] test1 = {-4, -1, 0, 3, 10};
        System.out.println("Original Array 1: [-4, -1, 0, 3, 10]");
        int[] result1 = solution.sortedSquares(test1);
        System.out.println("Sorted Squares 1: " + Arrays.toString(result1)); 
        // Expected Output: [0, 1, 9, 16, 100]
        System.out.println("----------------------------------------");

        // Test Case 2: Array with descending negative numbers
        int[] test2 = {-7, -3, 2, 3, 11};
        System.out.println("Original Array 2: [-7, -3, 2, 3, 11]");
        int[] result2 = solution.sortedSquares(test2);
        System.out.println("Sorted Squares 2: " + Arrays.toString(result2)); 
        // Expected Output: [4, 9, 9, 49, 121]
    }
}


