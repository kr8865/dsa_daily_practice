public class ninja{
    public static void main(String[] args) {
        int[][] arr={
            {10,40,70},
            {20,50,80},
            {30,60,90}  
        };
        int[][]dp=new int[arr.length][3];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<3;j++){
                dp[i][j]=-1;    
            }
        }
        //int ans=tabu(0,-1,arr,dp);
        //System.out.println(ans);


    }
    
    /*public static int profit(int i,int prevj,int[][] arr,int[][]dp){
        if(i==arr.length){
            return 0;
        }
        if(prevj!=-1){
            if(dp[i][prevj]!=-1){
            return dp[i][prevj];
        }
    }
        int currProfit=Integer.MIN_VALUE;
        for(int j=0;j<=2;j++){
            if(prevj!=j){
                currProfit = Math.max(currProfit, arr[i][j]+profit(i+1,j,arr,dp));
                
            }
        }
        if(prevj!=-1){
            dp[i][prevj]=currProfit;
        }
        return currProfit;
    }*/
    public static void tabu(){


        

    }
}