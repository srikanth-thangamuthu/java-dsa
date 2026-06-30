public class FrequencyCheck {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,5,6,7,4};
        int hash[]=new int[8];//use max to pass test case
        for(int i=0;i<arr.length;i++){
            int freq = hash[arr[i]];//takes the element on hash
            hash[arr[i]]=freq+1;//if the elements alrdy found just increment it
        }
        for(int i=0;i<8;i++){
            if(hash[i]>0){
                System.out.println(i+" "+hash[i]);
            }
        }

    }
    
}
