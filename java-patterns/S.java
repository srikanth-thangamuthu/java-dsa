public class S {
    public static void main(String[]args){
        int n=7;
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1&&i<mid||j==n&&i>mid||i==n||i==1||i==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}