public class Harshad {
    public static void main(String[] args) {
        int n=18;int div=1;int sum=0;
        while(div<=n){
            int ld=n%(div*10)/div;
            sum=sum+ld;
            div=div*10;
        }
        if(sum==n/2){
            System.out.print(sum+"\t\t");
            System.out.println("its harshad number");
        }
        else{
            System.out.println("its not harshad number");
        }

    }
}
