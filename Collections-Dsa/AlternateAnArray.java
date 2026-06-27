import java.util.ArrayList;

class AlternateAnArray {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            // Changed to != 0 to capture odd indices (20 and 40)
            if(i%2!=0){
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        AlternateAnArray obj = new AlternateAnArray();
        
        int[] in = {10, 20, 30, 40};
        ArrayList<Integer> op = obj.getAlternates(in);
        
        System.out.println(op);
    }
}
