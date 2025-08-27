package cf;

import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wat=sc.nextInt();
         int c=2;//c=2
        //6;
        if(wat%2==0){//yes
           
            
            while(c<wat){//2<6 3<6 
                int f=wat/c;// 6/2=3 6/3=2
                int fr=wat-f;// 6-3=3 4
                if(f%2==0 && fr%2==0){
                    System.out.println("Yes");
                    break;
                }
                else{
                    c++;//3
                }
            }
            if(c>=wat){
                System.out.println("No");
            }
            
        }
        
        else{
            System.out.println("No");
        }
        
    }
}