public class strin {
    public static void main(String[] args) {
          String str="1111010101111";
          int c=0;
          for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                c++;
            }
          }
          System.out.print(2*c-1);
    }
}
