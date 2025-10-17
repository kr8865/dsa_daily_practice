public class edit {
    public static void main(String[] args) {
        /*Given two strings word1 and word2, 
        return the minimum number of operations required to convert word1 to word2.
        You have the following three operations permitted on a word:
        Insert a character
        Delete a character
        Replace a character */
        String word1 = "intention";
        String word2 = "execution";
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=word2.length();j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int delete=1+dp[i-1][j];
                    int inserr=1+dp[i][j-1];
                    int replace=1+dp[i-1][j-1];
                    dp[i][j]=Math.min(delete,Math.min(inserr,replace));

                }
            }
        }
        System.out.print(dp[word1.length()][word2.length()]);


    }
    
}
