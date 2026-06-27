class StudentQuery {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime&&endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StudentQuery s = new StudentQuery();
        
        // Case 1
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;
        
        System.out.println(s.busyStudent(startTime, endTime, queryTime)); // Output: 1
    }
}
