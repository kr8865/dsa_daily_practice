import java.util.Arrays;

public class count_ways_memo {
     public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int g=count(n,dp);
        System.out.print(g);
    }
    public static int count(int n,int[]dp){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return count(n-1,dp)+count(n-2,dp);
    }
}
