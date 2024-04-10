public class LongestTask {
    public static int hardestWorker(int n, int[][] logs) {
        int task = Integer.MIN_VALUE;
        int prev = 0;
        int out = -1;

        for(int i=0; i<logs.length; i++){
            int temp = logs[i][1]-prev;
            prev = logs[i][1];
            if(temp >= task){
                if(temp == task){
                    out = Math.min(out, logs[i][0]);
                }else{
                    out = logs[i][0];
                }
                task = temp;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] nums = {{0,10},{1,20}};
        System.out.println(hardestWorker(2,nums));
    }
}
