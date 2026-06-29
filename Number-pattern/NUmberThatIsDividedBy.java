public class  NUmberThatIsDividedBy{
    public int countDigits(int num) {
        int count = 0; // Fix 1: Start at 0 instead of 1
        int div = 1;
        
        while (div <= num) {
            int ld = (num / div) % 10; // Fix 2: Much safer way to get the last digit
            
            // Fix 3: Avoid division by zero if a digit is 0
            if (ld != 0 && num % ld == 0) {
                count++;
            }
            
            // Stop div from multiplying endlessly and causing integer overflow
            if (num / 10 < div) {
                break;
            }
            div *= 10;
        }
        return count;
    }

    // Main method to make it executable
    public static void main(String[] args) {
        NUmberThatIsDividedBy solver = new  NUmberThatIsDividedBy();
        int input = 121; // '1' divides 121, '2' does not, '1' divides 121
        int output = solver.countDigits(input);
        
        System.out.println("Input number: " + input);
        System.out.println("Total dividing digits: " + output); // Expected output: 2
    }
}
