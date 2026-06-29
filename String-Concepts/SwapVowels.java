
public class SwapVowels {
    public String reverseVowels(String s) {
        char c[]=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if((c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'||
            c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')&&
            (c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U'||
            c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u')){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
            else if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'||
            c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
                j--;
            }
            else if(c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U'||
            c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'){
                 i++;
            }
            else{
                i++;j--;
            }
        }
        return new String(c);
    }

    // Main method added to make the class executable
    public static void main(String[] args) {
        SwapVowels sv = new SwapVowels();
        String input = "ImbaTMAniLLsAveGOtham";
        String output = sv.reverseVowels(input);
        
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
}
