package cf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pathless {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int sum=0;
            
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                sum+=arr[i];
            }
            if(sum==s){
                System.out.println("-1");
            }
             int zeros = 0, ones = 0, twos = 0;
            for (int x : arr) {
                if (x == 0) zeros++;
                else if (x == 1) ones++;
                else twos++;
            }
            
            // candidate arrangement
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < zeros; i++) res.add(0);
            for (int i = 0; i < twos; i++) res.add(2);
            for (int i = 0; i < ones; i++) res.add(1);
            if(sum<s){
                System.out.println("-1");
            }
            else {
                for (int i = 0; i < res.size(); i++) {
                    System.out.print(i+ (i + 1 == res.size() ? "\n" : " "));
                }
            }

        }
    }
    
}
