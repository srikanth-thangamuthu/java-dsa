public class Harshad {
    public static void main(String[] args) {
        int n=18;int div=1;int sum=0;
        while(div<=n){
            int ld=n%(div*10)/div;
            sum=sum+ld;
            div=div*10;
        }
        if(n%sum==0){//18%9==0 then harshad 10%1==0 then harshad
            System.out.print(sum+"\t\t");
            System.out.println("its harshad number");
        }
        else{
            System.out.println("its not harshad number");
        }

    }
}
