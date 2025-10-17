public class lc_substring {
    public static void main(String[] args) {
        String s1="ABCDE";
        String  s2="ABGCE";
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<=s1.length();i++){
            dp[i][0]=0;

        }
        for(int j=0;j<=s2.length();j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        int max=-1;
        for(int i=0;i<=s1.length();i++){
            for(int j=0;j<=s2.length();j++){
                if(dp[i][j]>max){
                    max=dp[i][j];
                }

            }
        }
        System.out.print(max);

    }
    
}
