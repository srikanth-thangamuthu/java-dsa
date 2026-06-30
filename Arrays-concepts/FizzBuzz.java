import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                ans.add("FizzBuzz");
            }
            else if(i%3==0){
                ans.add("Fizz");
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else{
               ans.add(i+"");
            }  
        }
        return ans;
    }

    // Main function to run and test your code
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();
        
        // Change this value to test different limits
        int n = 15; 
        
        List<String> result = tester.fizzBuzz(n);
        
        // Prints the final list output to the console
        System.out.println(result);
    }
}
