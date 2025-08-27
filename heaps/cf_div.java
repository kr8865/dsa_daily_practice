package heaps;

import java.util.Scanner;

public class cf_div {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int na=sc.nextInt();
            int nb=sc.nextInt();
            if(nb>=na){
                if(n%2==nb%2){
                    System.out.println("Yes");

                }
                else{
                    System.out.println("No");
                }
            }
            else{
                if(na%2==n%2 && nb%2==n%2){
                    System.out.println("Yes");

                }
                else{
                    System.out.println("No");
                }
            }
        }
        
    }
    
}
