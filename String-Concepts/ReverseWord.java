public class ReverseWord {
    public String reverseWords(String s) {
        // Code here
        String[] Str=s.split("\\.");//use\\ia used bcz . is spl char when we use spl char we will use this
        StringBuilder res=new StringBuilder();
        for(int i=Str.length-1;i>=0;i--){
            res.append(Str[i]);
            if(i>0){//thala this helps us to add . after each word uhhh
                res.append(".");
            }
        }
        return res.toString();
    }

    // Main method added to make the class executable
    public static void main(String[] args) {
        ReverseWord rw = new ReverseWord();
        String input = "i.love.batman";
        String output = rw.reverseWords(input);
        
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
}
