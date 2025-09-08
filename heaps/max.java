import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int  ans = -1;
            for (int d = 1; d * d <= b; d++) {
                if (b % d == 0) {
                    int k1 = d;
                    int k2 = b / d;
                    
                    int s1 = a * k1 + b / k1;
                    if (s1 % 2 == 0) ans = Math.max(ans, s1);
                    
                    int s2 = a * k2 + b / k2;
                    if (s2 % 2 == 0) ans = Math.max(ans, s2);
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb.toString());
    }
}