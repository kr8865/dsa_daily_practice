public class min_steps {
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        int n=arr.length;
        int c=0;
        for(int i=n-1;i>=1;i--){
            int ns=arr[i-1];
            
            for(int j=i;j<n;j++){
                
                arr[j]=ns;
                c++;
                
            }
        }
        System.out.print(c);
    }
    
}
