class CountIntWithEvenDigitSum {
    public int countEven(int num) {
        int sum = 0, div = 1;
        
        // Extract digits of 'num' to find its digit sum
        while (div <= num) {
            sum += (num % (div * 10)) / div;
            div *= 10;
        }
        
        // Your exact mathematical shortcut logic
        if (sum % 2 == 0) {
            return num / 2;
        } else {
            return (num - 1) / 2;
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        CountIntWithEvenDigitSum solver = new CountIntWithEvenDigitSum();
        
        // Example 1: num = 4 -> Even digit sums are 2, 4. Output: 2
        System.out.println("Result for 4: " + solver.countEven(4)); 
        
        // Example 2: num = 30 -> Numbers with even digit sum: 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, 28. Output: 14
        System.out.println("Result for 30: " + solver.countEven(30)); 
    }
}