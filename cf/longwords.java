package cf;

import java.util.Scanner;

public class longwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
        String st=sc.next();
        int le=st.length();
        String s="";
    

        if(le>10){
            char fr=st.charAt(0);
            char las=st.charAt(le-1);
            int l=le-2;
            s=fr+""+l+las+"";

        }
        else{
            s=st;
        }
        System.out.print(s);
    }
    }
    
}
