public class lcsubstring {
    public static void main(String[] args) {
        String s1="ABCDGH";
        String s2="ACDGHR";
       System.out.print( subst(s1,s2,0,0));
    }
    static int max=-1;
    public static int subst(String s1,String s2,int i,int j){
        if(i==s1.length() || j==s2.length() ){
            return 0;
        }
        

        if(s1.charAt(i)==s2.charAt(j)){
            return 1+subst(s1,s2,i+1,j+1);
        }
        else{
            int ans1=subst(s1, s2, i+1, j);
            int ans2=subst(s1, s2, i, j+1);
            int ans=Math.max(ans1,ans2);
            max=Math.max(ans,max);
            return max;

        }


    }
    
}
