public class ArmStrong {
    public static void main(String[] args) {
        int n=153;int div=1;int sum=0;int temp=n;int digits=0;
        if (temp==0) digits=1;//if n=0 this will be applied
        while(temp>0){
            digits++;
            temp=temp/10;
        }
        while(div<=n && n>0){
            int ld = n%(div*10)/div;
            sum=sum+(int)Math.pow(ld,digits);
            div=div*10;
        }
        if(sum==n){
            System.out.print("Armstrong");
        }
        else{
           System.out.print("not Armstrong"); 
        }
    }
    
}
