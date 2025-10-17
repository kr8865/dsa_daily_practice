import java.util.Arrays;

public class lis {
    public static void main(String[] args) {
        int[] arr={50,3,10,7,40,80};
        int[] arr1=arr.clone();
        Arrays.sort(arr1);
        int[][] dp=new int[arr.length+1][arr.length+1];
        arr1 = Arrays.stream(arr1).distinct().toArray();
        for(int i=0;i<=arr.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=arr.length;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=arr.length;j++){
                if(arr[i-1]==arr1[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    int max=dp[i][j-1];
                    int max1=dp[i-1][j];
                    dp[i][j]=Math.max(max,max1);
                }
            }
        }
        System.out.print(dp[arr.length][arr.length]);
        
        
    }
    
}
