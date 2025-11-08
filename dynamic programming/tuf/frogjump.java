public class frogjump {
    public static void main(String[] args) {
        int[] arr={30, 10, 60, 10, 60, 50};
        int ans=recur(arr,1,0);
        System.out.print(ans);
        
    }
    public static int recur(int[] arr,int i,int j){
        if(i==arr.length-1){
            return 0;
        }
        if(i>=arr.length){
            return Integer.MAX_VALUE;
        }

        int first = Integer.MAX_VALUE;
        int l=recur(arr,i+1,i);
        if(l!=Integer.MAX_VALUE){
            first=Math.abs(arr[i+1]-arr[j])+l;
        }
        int second = Integer.MAX_VALUE;
        int f=recur(arr,i+2,i);
        if(f!=Integer.MAX_VALUE){
            second=Math.abs(arr[i+2]-arr[j])+f;
        }
        return Math.min(first,second);
    }
    
}
