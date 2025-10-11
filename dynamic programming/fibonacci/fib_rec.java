public class fib_rec{
    public static void main(String[] args) {
        int n=5;
        int f=recursion(n);
        System.out.print(f);
    }
    public static int recursion(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return recursion(n-1)+recursion(n-2);//0 1 1 2 3 5 
    }
}