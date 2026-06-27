
import java.util.Arrays;

class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int st=0;int st1=n;
        int res[]=new int[n*2];
        for(int k=0;k<n*2;k+=2){
            res[k]=nums[st];
            res[k+1]=nums[st1];
            st++;
            st1++;
        }
        return res;
    }

    public static void main(String[] args) {
        ShuffleArray obj = new ShuffleArray();
        
        int[] ip = {1, 2, 3, 4, 1, 2, 3, 4};
        int[] op = obj.shuffle(ip, 4);
        
        System.out.println(Arrays.toString(op));
    }
}
