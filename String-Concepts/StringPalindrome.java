class StringPalindrome {
    boolean isPalindrome(String s) {
        // code here
        int st1=0,st2=s.length()-1;
        while(st1<st2){
            if(s.charAt(st1)!=s.charAt(st2)){
                return false;
            }
            st1++;st2--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Create an instance of the class
        StringPalindrome checker = new StringPalindrome();
        
        // Test Case 1: A valid palindrome
        String test1 = "racecar";
        boolean result1 = checker.isPalindrome(test1);
        System.out.println("Is \"" + test1 + "\" a palindrome? " + result1); // Expected: true
        
        // Test Case 2: An invalid palindrome
        String test2 = "batman";
        boolean result2 = checker.isPalindrome(test2);
        System.out.println("Is \"" + test2 + "\" a palindrome? " + result2); // Expected: false
    }
}