class RobotMove {
    public boolean judgeCircle(String m) {
        int row=0,col=0;
        char []ch=m.toCharArray();
        for(char a:ch){//ud
            if(a=='U') row--;//-1
            else if(a=='D') row++;//0
            else if(a=='R') col--;
            else if(a=='L') col++;
        }
        if(row == 0&& col==0) return true;
        return false;
    }

    // Main function to run and test your code
    public static void main(String[] args) {
        RobotMove tester = new RobotMove();
        
        // Test cases
        String test1 = "UD";     // Expected: true (goes up then down, returns to start)
        String test2 = "LL";     // Expected: false (moves left twice, never returns)
        String test3 = "URDL";   // Expected: true (moves in a perfect square box)
        
        System.out.println("Does sequence '" + test1 + "' return to start? " + tester.judgeCircle(test1));
        System.out.println("Does sequence '" + test2 + "' return to start? " + tester.judgeCircle(test2));
        System.out.println("Does sequence '" + test3 + "' return to start? " + tester.judgeCircle(test3));
    }
}
