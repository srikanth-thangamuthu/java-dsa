public class Diamond {
    public static void main(String[] args) {
        int n=7;int mid=n/2+1;int sp=mid-1;int st=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=sp; j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("* ");
            }
            if(i<mid){
                st=st+2;
                sp--;
            }
            else{
                st=st-2;
                sp++;
            }
            System.out.println();
        }
    }
}
