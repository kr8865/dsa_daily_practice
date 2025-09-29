import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class hero {
    public static void main(String[] args) {
        int vi=5;
        int heroes=1;
        int heocap=4;
        int[] villaians={1,2,3,1,3};
        Deque<Integer> hero=new LinkedList<>();
        Deque<Integer> vil=new LinkedList<>();
        for(int i=villaians.length-1;i>=0;i--){
            vil.add(villaians[i]);
        }
        for(int i=0;i<heroes;i++){
            hero.add(heocap);
        }
        while(!hero.isEmpty() && !vil.isEmpty()){
            int her=hero.remove();
            int v=vil.remove();
            if (her > v) {
                // hero wins, loses some health
                hero.addFirst(her - v); // same hero continues (add to FRONT)
            } else if (her < v) {
                // villain wins, hero dies -> villain stays for next hero
                vil.addFirst(v);
            } else {
                // both die -> do nothing
            }

        }
        
System.out.print(vil.size());
        
    }
    
}
