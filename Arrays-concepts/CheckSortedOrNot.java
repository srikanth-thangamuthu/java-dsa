class CheckSortedOrNot {
    
    public static void main(String[]args){
        int []arr={10,50,70,30};
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                System.out.print("flase");
                return;
            }
        }
        System.out.print("true");
    }
    }

