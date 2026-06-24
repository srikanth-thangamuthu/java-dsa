public class SubProductAndSum {
    public static void main(String[] args) {
        int n=234;int mul=1;int sum=0;int div=1;
        while(div<=n){
            int ld = n%(div*10)/div;
            sum=sum+ld;
            mul=mul*ld;
            div=div*10;
        }
        int diff=mul-sum;
        System.out.print(diff);
    }
}
