public class target_memo {
    public static void main(String[] args) {
        int[] arr={4,2,7,1,3};
        int target=90;
        Boolean[][] dp=new Boolean[arr.length+1][target+1];
        System.out.print(func(arr,target,0,dp));
    }
    public static boolean func(int[] arr,int target,int i,Boolean[][] dp){
        if(i==arr.length){
            return false;
        }
        if(target==0){
            return true;

        }
        if(dp[i][target]!=null){
            return dp[i][target];
        }
        if(arr[i]<=target){
            boolean ans1= func(arr,target-arr[i],i+1,dp);
            boolean ans2=func(arr, target, i+1,dp);
            return dp[i][target]=ans1||ans2;
        }
        else{
            return dp[i][target]=func(arr, target, i+1,dp);
        }
    }
    
}
