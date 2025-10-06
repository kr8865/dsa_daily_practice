import java.util.Arrays;

public class arr_n {
    public static void main(String[] args) {
        int[] arr={11, 1, 8, 12, 14};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                System.out.print("true");
                return;
            }
        }
        System.out.print("false");

    }
    
}
