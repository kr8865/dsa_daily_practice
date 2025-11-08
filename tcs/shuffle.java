import java.util.Scanner;

public class shuffle{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] shuffled=new String[n];
        for(int i=0;i<n;i++){
            shuffled[i]=sc.nextLine().trim();
        }
        String[] ori=new String[n];
        for(int i=0;i<n;i++){
            ori[i]=sc.nextLine().trim();
        }
        
        int i=0;
        int j=0;
        int c=0;
        while(i<ori.length){
            int v=check(i, j, ori, shuffled);
            if(v==i){
                break;
            }
            if(v<ori.length){
                c++;
                i=v;
                j=0;
            }
            else{
                break;
            }
        }
        
        System.out.print(c);




    }
    public static int check(int i,int j,String[] ori,String[] shuffled){
        while (i < ori.length && j < shuffled.length) {
            if (shuffled[j].equals(ori[i])) {
                int ii = i;
                int jj = j;
                while (ii < ori.length && jj < shuffled.length && shuffled[jj].equals(ori[ii])) {
                    ii++;
                    jj++;
                }
                return ii;
            }
            j++;
        }
        return i;

    }
}