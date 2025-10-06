public class string {
    public static void main(String[] args) {
        String str="1111";
        int a = 0;
        int k=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            String st=ch+"";
            a=(int)(a+Integer.parseInt(st)*Math.pow(2,k));
            k++;


        }
        int c=0;
        while(a>0){
            if(a%2==0){
                a=a/2;
            }
            else{
                a=a-1;
            }
            c++;

        }
        System.out.print(c);
    }
    
}
