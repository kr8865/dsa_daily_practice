public class knapsack{
    public static void main(String[] args){
        int[] val={15,14,10,45,30};
        int[] wt={2,5,1,3,4};
        int maxW=7;
        int p=knap(val,wt,maxW,0);
        System.out.print(p);

    }
    public static int knap(int[] val,int[] wt,int maxW,int i){
        if(maxW==0){
            return 0;

        }
        if(i==val.length){
            return 0;
        }

        if(wt[i]<=maxW){
            int ans1=val[i]+knap(val,wt,maxW-wt[i],i+1);//include
            int ans2=knap(val,wt,maxW,i+1);//exclude
            return Math.max(ans1,ans2);

        }
        else{
            return knap(val, wt, maxW, i+1);
        }
    }
}