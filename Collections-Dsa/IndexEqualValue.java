import java.util.ArrayList;

class IndexEqualsValue { 
    public static ArrayList<Integer> valEqualToPos(int[] arr) { 
        // code here 
        ArrayList<Integer> NewArr = new ArrayList<>(); 
        for(int i = 0; i < arr.length; i++){ 
            if(arr[i] == i + 1){ 
                NewArr.add(arr[i]); 
            } 
        } 
        return NewArr; 
    } 
}
