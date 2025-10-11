public class count_ways_rec {
    public static void main(String[] args) {
        int n=5;
        int g=count(n);
        System.out.print(g);
    }
    public static int count(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return count(n-1)+count(n-2);
    }
    
}
