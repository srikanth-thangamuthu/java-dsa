public class HourWithoutTop {
    public static void main(String[] args) {
        int n=7;int mid=n/2+1;int st=n;int sp=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=sp; j++) {
                System.out.print("  ");
            }
           
            for(int j=1;j<=st;j++){
                if(j==st&&i<mid||j==1&&i<mid||i==1||i>=mid){
                System.out.print("* ");}
                else{
                System.out.print("  ");
            }
            }
            
            
            if(i<mid){
                sp++;
                st=st-2;
            }
            else{
                sp--;
                st=st+2;
            }
            System.out.println();
        }
    }
}
