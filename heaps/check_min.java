public class check_min {
    public static void main(String[] args) {
        /*Given an array of integers nums. Check whether the array represents a binary min-heap or not. 
        Return true if it does, otherwise return false.
        :
        Input: nums = [10, 20, 30, 21, 23]

        Output: true

        Explanation: Each node has a lower or equal value than its children. */
        int[] nums={10,20,30,21,5};
        System.out.print(is_min_heap(nums,0));




    }
    public static boolean is_min_heap(int[] nums,int i){
        int left=2*i+1;
        int right=2*i+2;
        if(left>=nums.length && right>=nums.length){
            return true;
        }
        if(nums[i]<nums[left] && nums[i]<nums[right]){
            boolean l=is_min_heap(nums, left);
            boolean r=is_min_heap(nums, right);
            return l&&r;
        }
        else{
            return false;
        }
        
        

        
    }
    
}
