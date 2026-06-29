
class ChessBoard {
    public boolean squareIsWhite(String c) {
        char []a=c.toCharArray();
        int num=0;
        for(char b:a){
            num=num+b;
        }
        if(num%2==0){return false;}
        else{return true;}
    }

    // Main function to run and test your code
    public static void main(String[] args) {
        // Fixed: Instantiated ChessBoard instead of Solution
        ChessBoard tester = new ChessBoard(); 
        
        // Test cases
        String test1 = "a1"; // Expected: false (Black)
        String test2 = "h3"; // Expected: true (White)
        String test3 = "c7"; // Expected: false (Black)
        
        System.out.println("Is " + test1 + " white? " + tester.squareIsWhite(test1));
        System.out.println("Is " + test2 + " white? " + tester.squareIsWhite(test2));
        System.out.println("Is " + test3 + " white? " + tester.squareIsWhite(test3));
    }
}
