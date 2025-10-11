public class target_Sum{
    public static void main(String[] args){
        int[] arr={4,2,7,1,3};
        int target=10;
        System.out.print(func(arr,target,0));

    }
    public static boolean func(int[] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        if(target==0){
            return true;
        }
        if(arr[i]<=target){
            boolean ans1= func(arr,target-arr[i],i+1);
            boolean ans2=func(arr, target, i+1);
            return ans1||ans2;
        }
        else{
            return func(arr, target, i+1);
        }

    }
}