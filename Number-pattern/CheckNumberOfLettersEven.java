
public class CheckNumberOfLettersEven {
    public int findNumbers(int[] nums) {
        int count=0, div=1,digitCount=0,num=0;
        for(int i=0;i<nums.length;i++){
             num=nums[i];
             digitCount=String.valueOf(num).length();
           if(digitCount%2==0){
            count++;
           }
        }
           return count;
    }

    // Main method added to make the class executable
    public static void main(String[] args) {
        CheckNumberOfLettersEven checker = new CheckNumberOfLettersEven();
        int[] input = {12, 345, 2, 6, 7896};
        int output = checker.findNumbers(input);
        
        System.out.print("Input array: [");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + (i < input.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("Count of numbers with even digits: " + output);
    }
}
