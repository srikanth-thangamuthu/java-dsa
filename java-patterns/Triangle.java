public class Triangle {
    public static void main(String[] args) {
        int n=5;
        int st=1;
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=sp;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print(" *");
            }
            st++;
            sp--;
            System.out.println();
        }
    }
    
    
}
