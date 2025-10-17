public class string_con {
    public static void main(String[] args) {
        String str1="pear";
        String str2="sea";
        //only insertions and deletions allowed
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            dp[i][0]=i;

        }
        for(int j=0;j<=str2.length();j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];

                }
                else{
                    int max=dp[i-1][j];
                    int max1=dp[i][j-1];
                    dp[i][j]=Math.max(max,max1);

                }
            }
        }
        System.out.print(dp[str1.length()][str2.length()]);

    }
    
}
