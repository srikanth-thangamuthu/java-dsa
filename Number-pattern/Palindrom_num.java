public class Palindrom_num {
    public static void main(String[] args) {
        int n=1221;int div=1;int rev=0;
        while(div<=n){
            int ld=n%(div*10)/div;
            rev=rev*10+ld;//used to save all the variables 0=0*10+1=>1     1=1*10+2=>12    12=12*10+2=>122    122=122*10+1=>1221
            div=div*10;
        }
        if(rev==n){
            System.out.println("palindrome");
        }
        else{ 
            System.out.println("not an palindrome");
        }
    }
}
