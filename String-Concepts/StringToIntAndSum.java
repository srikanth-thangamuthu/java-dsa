class StringToIntAndSum {
    public int getLucky(String s, int k) {
        char ch[] = s.toCharArray();
        int sum = 0, div = 0; // Keeping 'div' as requested, though it's unused

        // Step 1: Convert characters to position digits and do the 1st sum transformation
        for (char ch1 : ch) {
            int val = ch1 - 'a' + 1;
            for (char dig : String.valueOf(val).toCharArray()) {
                sum = sum + (dig - '0');
            }
        }
        
        // Step 2: Perform the remaining k - 1 transformations
        for (int i = 1; i < k; i++) {
            int sum1 = 0;
            for (char ch1 : String.valueOf(sum).toCharArray()) {
                sum1 = sum1 + (ch1 - '0');
            }
            sum = sum1;
        }
        return sum;
    }

    // Main method to test the logic
    public static void main(String[] args) {
        StringToIntAndSum solver = new StringToIntAndSum();

        // Example 1: s = "iiii", k = 1
        // 'i' -> 9. Four 'i's -> "9999" -> 9 + 9 + 9 + 9 = 36
        System.out.println("Result for ('iiii', 1): " + solver.getLucky("iiii", 1)); // Output: 36

        // Example 2: s = "leetcode", k = 2
        // "leetcode" -> 12 5 5 20  3 15  4  5 -> Sum of digits = 1+2+5+5+2+0+3+1+5+4+5 = 33 (k=1)
        // 33 -> 3 + 3 = 6 (k=2)
        System.out.println("Result for ('leetcode', 2): " + solver.getLucky("leetcode", 2)); // Output: 6
    }
}