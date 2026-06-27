class ChangeEachWordLetterOneAsUppercase {
    public String convert(String s) {
        String res="";
        String[]arr=s.split(" ");//[hi i am batman]
        for(String C:arr){//traverse till the end
            if (C.isEmpty()) {
                res = res + " ";
                continue;
            }
            char arr1[]=C.toCharArray();//[h,i]
            arr1[0]=Character.toUpperCase(arr1[0]);//[H,i]
            C=new String(arr1);//HiIAmBatman
            res=res+C+" ";//Hi I Am Batman
        }
        res = res.trim(); // Fixed: Reassigned so the trailing space is actually removed
        return res;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        ChangeEachWordLetterOneAsUppercase processor = new ChangeEachWordLetterOneAsUppercase();

        // Sample input string
        String input = "hi i am batman";

        // Call the convert method and store the result
        String output = processor.convert(input);

        // Print the results to the console
        System.out.println("Input:  \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
    }
}
