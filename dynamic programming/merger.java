public class merger{
    public static void main(String[] args) {
        int[] arr={1,10,9,7,5};
        int[] arr1=merge_sort(arr,0,arr.length-1);
        System.out.print(arr1[1]);
        
    }
    public static int[]  merge_sort(int[] arr,int si,int ei){
        if(si==ei){
            return new int[]{arr[si]};
        }
        int mid=(si+ei)/2;
        int[] left=merge_sort(arr, si, mid);
        int[] right=merge_sort(arr, mid+1, ei);
        return merge(left,right);

    }
    public static int[] merge(int[] left,int[] right){
        int[] newarr=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                newarr[k]=left[i];
                i++;
            }
            else{
                newarr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            newarr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            newarr[k]=right[j];
            j++;
            k++;
        }
        return newarr;
    }
}