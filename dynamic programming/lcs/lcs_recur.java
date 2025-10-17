public class lcs_recur{
    public static void main(String args[]){
        String s1="ABCDGH";
        String s2="ACDGHR";
        int[][] dp=new int[s1.length()][s2.length()];
        System.out.print( subst(s1,s2,0,0,dp));

    }
    static int max=-1;
    public static int subst(String s1,String s2,int i,int j,int[][] dp){
        if(i==s1.length() || j==s2.length() ){
            return 0;
        }
        

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+subst(s1,s2,i+1,j+1,dp);
        }
        else{
            int ans1=subst(s1, s2, i+1, j,dp);
            int ans2=subst(s1, s2, i, j+1,dp);
            int ans=Math.max(ans1,ans2);
            dp[i][j]=Math.max(ans,max);
            return dp[i][j];

        }
    }
}