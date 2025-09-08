import java.util.HashMap;

public class isomo {
    public static void main(String[] args) {
        /*Input: s = "paper", t = "title"
        Output: true

  */
        String s= "paper";
        String t= "titlee";
        HashMap<Character , Integer> map1=new HashMap<>();
        HashMap<Character , Integer> map2=new HashMap<>();
        /* unique char in s == unique char in t */
        int u=0;
        int o=0;
        
        for(int i=0;i<s.length();i++){
            if(!map1.containsKey(s.charAt(i))){
                u++;
                map1.put(s.charAt(i),1);
            }
            else{
                int c=map1.get(s.charAt(i));
                map1.put(s.charAt(i),c+1);
            }
        }
        for(int j=0;j<t.length();j++){
            if(!map2.containsKey(t.charAt(j))){
                o++;
                map2.put(t.charAt(j),1);
            }
            else{
                int c=map2.get(t.charAt(j));
                map2.put(t.charAt(j),c+1);
            }
        }
        if(o==u){
            System.out.print("true");
        }
        else{
            System.out.println("false");
        }
        /*"bbbaaaba"
t =
"aaabbbba" */


    }
}
