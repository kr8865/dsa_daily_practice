import java.util.Arrays;

public class unbounded {
    public static void main(String[] args){
        int[] val={15,14,10,45,30};
        int[] wt={2,5,1,3,4};
        int maxW=7;
        int[][] dp=new int[wt.length+1][maxW+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int p=knap(val,wt,maxW,0,dp);
        System.out.print(p);

    }
    public static int knap(int[] val,int[] wt,int maxW,int i,int[][] dp){
        if(maxW==0){
            return 0;

        }
        if(i==val.length){
            dp[i][maxW]=0;
            return 0;
        }
        if(dp[i][maxW]!=-1){
            return dp[i][maxW];
        }

        if(wt[i]<=maxW){
            int ans1=val[i]+knap(val,wt,maxW-wt[i],i,dp);//include
            int ans2=knap(val,wt,maxW,i+1,dp);//exclude
            return dp[i][maxW]=Math.max(ans1,ans2);

        }
        else{
            return dp[i][maxW]=knap(val, wt, maxW, i+1,dp);
        }
    }
}
