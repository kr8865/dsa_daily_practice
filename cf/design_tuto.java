package cf;

import java.util.Scanner;
public class design_tuto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans1=0;
        int ans2=0;
        if(n%2==0){
            ans1=4;
            ans2=n-4;
            
        }
        else{
            ans1=9;
            ans2=n-9;
        }
        System.out.println(ans1);
        System.out.println(ans2);
        
    }
    
}
