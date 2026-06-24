public class Rev_num_destruction{
    public static void main(String[] args) {
        int n=6991;
        while(n!=0){
int ld=n%10;
        System.out.print(ld);
        n=n/10;//helps to exit from loop after number finishes
        }
        
    }
}