public class max_product{
    public static void main(String[] args){
        //nums = [2,3,-2,4]
        int[] nums={-2,0,-1};
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(left[i-1]==0){
                left[i]=nums[i];
            }else{
            left[i]=left[i-1]*nums[i];
            }
        }
        right[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            if(right[j+1]==0){
                right[j]=1;
            }
            else{
            right[j]=right[j+1]*nums[j];
            }
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=Math.max(result,Math.max(left[i],right[i]));
        }
        System.out.print(result);


    }
}