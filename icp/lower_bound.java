public class lower_bound {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,7,9};//if ele exists return first occur if not then return greater value
        int lo=0;
        int ans=-1;
        int target=3;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=target){
                ans=mid;
                hi=mid-1;
            }
            
            else{
                lo=mid+1;
            }
        }
        System.out.print(ans);
    }
    
}
/*Lower bound is the first occurrence of target element. If element not found index of first element greater than target is returned.

Upper bound is the first occurence of element greater than target element. */