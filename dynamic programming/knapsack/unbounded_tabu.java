import java.util.Arrays;

public class unbounded_tabu {
    public static void main(String[] args) {
        int[] val={15,14,10,45,30};
        int[] wt={2,5,1,3,4};
        int maxW=7;
        int[][] dp=new int[val.length+1][maxW+1];
        for(int i=0;i<val.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<=val.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=maxW;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(wt[i-1]<=j){
                    int ans1=val[i-1]+dp[i][j-wt[i-1]];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.print(dp[dp.length-1][dp[0].length-1]);
    }
    
}
