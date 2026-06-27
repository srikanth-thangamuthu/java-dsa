import java.util.Arrays;

class PlusOne { 
    public int[] plusOne(int[] digits) { 
        for(int i = digits.length - 1; i >= 0; i--) { 
            if(digits[i] != 9) { 
                digits[i] = digits[i] + 1; 
                return digits; 
            } 
            digits[i] = 0; 
        } 
        int[] newarr = new int[digits.length + 1]; 
        newarr[0] = 1; // Corrected array index assignment
        return newarr; 
    } 

    public static void main(String[] args) {
        PlusOne solver = new PlusOne();

        // Testing Input 2
        int[] input2 = {1, 6, 8, 9};
        System.out.println("Input 2:  " + Arrays.toString(input2));
        System.out.println("Output 2: " + Arrays.toString(solver.plusOne(input2)));

        System.out.println("--------------------");

        // Testing Input 3
        int[] input3 = {9, 9, 9};
        System.out.println("Input 3:  " + Arrays.toString(input3));
        System.out.println("Output 3: " + Arrays.toString(solver.plusOne(input3)));
    }
}
