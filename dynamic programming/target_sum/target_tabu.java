public class target_tabu {
    public static void main(String[] args) {
        int[] arr={4,2,7,1,3};
        int target=3;
        boolean[][] dp=new boolean[arr.length+1][target+1];
        dp[0][0]=true;
        for(int i=1;i<=target;i++){
            dp[0][i]=false;
        }
        for(int i=1;i<=arr.length;i++){
            dp[i][0]=true;

        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=target;j++){
                if(arr[i-1]<=j){
                    boolean ans1=dp[i-1][j-arr[i-1]];
                    boolean ans2=dp[i-1][j];
                    dp[i][j]=ans1||ans2;
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.print(dp[arr.length][target]);

        
    }
    
}
