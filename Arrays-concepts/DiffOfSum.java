import java.util.Arrays;

public class DiffOfSum {

    // Your logic made fully workable without changing variables or core structure
    public static int differenceOfSum(int[] nums) { 
        int sumnum=0;
        int sumdig=0; 
        
        for(int i=0;i<nums.length;i++){ 
            int n=nums[i]; 
            sumnum=sumnum+nums[i]; 
            int div=1; 
            
            // Fixed loop condition to prevent integer overflow and handle large numbers safely
            while(div<=n && n/div > 0){ 
                int ld=n%(div*10)/div; 
                div=div*10; 
                sumdig=sumdig+ld; 
            }
        } 
        
        int sub=sumnum-sumdig; 
        if(sub<0) {
            sub=-sub;
        } 
        return sub; 
    }

    // The requested main function to execute and test the code
    public static void main(String[] args) {
        // Test Case 1: Standard input
        int[] test1 = {1, 15, 6, 3};
        int result1 = differenceOfSum(test1);
        System.out.println("Input Array: " + Arrays.toString(test1));
        System.out.println("Absolute Difference: " + result1); // Expected output: 9
        System.out.println("----------------------------------------");

        // Test Case 2: Array with identical single and multi-digit numbers
        int[] test2 = {1, 2, 3, 4};
        int result2 = differenceOfSum(test2);
        System.out.println("Input Array: " + Arrays.toString(test2));
        System.out.println("Absolute Difference: " + result2); // Expected output: 0
    }
}
