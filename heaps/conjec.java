import java.util.Scanner;

public class conjec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long k = sc.nextLong();
            long val = sc.nextLong();
            
            for (long i = 0; i < k; i++) {
                if ((val- 1) % 3 == 0) {
                    long prev = (val - 1) / 3;
                    if (prev % 2 == 1) {
                        val = prev;
                        continue;
                    }
                }
                val= val * 2; 
            }
            
            System.out.println(val);
        }
        
    }
    
}
