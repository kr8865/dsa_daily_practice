package cf;

import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int p=0;
        while(t-->0){
            int d=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==1){
                d++;
            }
            if(b==1){
                d++;
            }
            if(c==1){
                d++;
            }
            if(d>=2){
                p++;
            }
            
            

        }
        System.out.println(p);
    }
    
}
