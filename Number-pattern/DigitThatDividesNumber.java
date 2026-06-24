public class DigitThatDividesNumber {
    public static void main(String[] args) {
        int n=1248;int div=1;int count=0;
        while(div<=n){
            int ld=n%(div*10)/div;
            if(n%ld==0) count++; //1248%8==0 count 1 1248%4==0 count 2 1248%2==0 count 3 1248%1==0 count 4
            div*=10;
        }
        System.out.println(count);
    }
}
