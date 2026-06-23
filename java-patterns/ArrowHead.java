public class ArrowHead {
    public static void main(String[] args) {
        int n=7;int st=1;int mid=n/2+1;
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=st; j++) {
                System.out.print("* ");
            }
            if(i<mid){
                st++;
            }else{
                st--;
            }
            System.out.println();
        }
    }
}
