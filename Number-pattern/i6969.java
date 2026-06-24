public class i6969 {
    public static void main(String[] args) {
        int div=1;
        int n=6969; 
        int sum=0;
        int diff=3;//difference of 9 to 6 is 3
        while(div<=n){
            int ld = n%(div*10)/div;
            if (ld==6){ sum=diff;}//9!= 6 diff=3*10=30    6==6 sum=30 diff=30*10=300 9!=6 diff=300*10=3000 6==6 sum=3000 diff=3000*10=30000       print(6969+3000=9969)
            diff*=10;
            div*=10;
        }
        System.out.println(sum+n);
    }
}
