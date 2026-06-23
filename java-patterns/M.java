public class M {
    public static void main(String[] args) {
        int st=1;
        int n=7;
        int sp=n*2-3;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=st; j++) {
               System.out.print("* "); 
            }
         for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            if (i==n) st--;
            for(int j=1;j<=st;j++){
                System.out.print("* ");
            }
            st++;
            sp=sp-2;
            System.out.println();
        }
            
        }
    }

