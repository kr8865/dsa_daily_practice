 import java.util.*;
public class cf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int te  = sc.nextInt();
        for(int i=0; i<te; i++){
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++){
                ar[j] = sc.nextInt();
            }
            
            HashSet<Integer> s = new HashSet<>();
            boolean y = false;
            
            for(int j=0; j<n; j++){
                if(s.contains(ar[j])){
                    y= true;
                    break;
                }
                s.add(ar[j]);
            }
            
            if(y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
