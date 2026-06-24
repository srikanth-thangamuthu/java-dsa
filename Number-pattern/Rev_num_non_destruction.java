public class Rev_num_non_destruction {
    public static void main(String[] args) {
        int n=6619;int div=1;
        while(div<=n){
            int ld = n%(div*10)/div;//ld=6619%10/1=>6619%10=>9
            System.out.print(ld);
            div=div*10;//helps to exit from the loop after number finishes
        }
    }
}
