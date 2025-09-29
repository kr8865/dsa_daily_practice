public class traverse {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //Display(arr);
        //column(arr);
        //reverse(arr);
        //spiral(arr);
        int[][] a=new int[2][];
        arr[0]=new int[3];
        arr[1]=new int[5];
        System.out.println(a[1].length);

        

    }
    public static void Display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void column(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        
    }
    public static void reverse(int[][] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiral(int[][] arr){
        int i=0;
        int j=0;
        int n=arr.length;
        int c=0;
        int totalel=arr.length*arr.length;
        while(c<totalel && n>0){
        while(j<n && c<totalel){
            
            System.out.print(arr[i][j]+" ");//00 //01 //02 //03
            j++;
            c++;
            
        
        }
        j--;//3
        i++;//1
        while(i<n && c<totalel){
            System.out.print(arr[i][j]+" ");//13 //23 // 33
            i++;
            c++;
        }
        j--;//2
        i--;//3
        while(j>=0 && c<totalel){
            System.out.print(arr[i][j]+" ");//32 //31 // 30 
            j--;
            c++;
        }
        i--;//2
        j++;//0
        while(i>1 && c<totalel){
            System.out.print(arr[i][j]+" ");//20 //10
            i--;
            c++;
            
        }
        n--;
    }
        
    }
    
}
