public class SumOfNumbers {
    public static void main(String[] args) {
       int n=1553; int div=1; int sum=0;
       while(div<=n){
        int ld=n%(div*10)/div;
        sum=sum+ld;
        div=div*10;
       }
       System.out.print(sum);

    }
}
