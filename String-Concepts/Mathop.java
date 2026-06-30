import java.util.Scanner;

class Mathop {
    public int finalValueAfterOperations(String[] o) {
        int count = 0;
        
        for (int i = 0; i < o.length; i++) {
            if (o[i].equals("X++") || o[i].equals("++X")) {
                count++;
            } 
            else if (o[i].equals("X--") || o[i].equals("--X")) {
                count--;
            }
        }
        return count; 
    }

    // Main method added to make the code fully runnable
    public static void main(String[] args) {
        Mathop solver = new Mathop();
        
        // Example test case: ["--X", "X++", "X++"]
        String[] operations = {"--X", "X++", "X++"};
        
        int result = solver.finalValueAfterOperations(operations);
        System.out.println("Final Value: " + result); // Expected output: 1
    }
}