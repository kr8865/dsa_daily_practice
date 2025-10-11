import java.util.Arrays;

public class fib_memo {
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        fibo(n,dp);
        System.out.print(dp[n]);
    }
    public static int fibo(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    
}
