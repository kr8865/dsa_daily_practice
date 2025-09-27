public class upper_bound {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,7,9}; //if ele exists return last occur otherwise return just greater value
        int lo=0;
        int ans=-1;
        int target=5;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                ans=mid;
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
                ans=mid;
            }
            else{
                lo=mid+1;
            }
            
        }
        System.out.print(ans);
    }
    
}
