
import java.util.Collections;
import java.util.PriorityQueue;

public class last_stone {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] stones={1,3};
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);

        }
        while(pq.size()>1){
            int y=pq.remove();
            int x=pq.remove();
            if(y!=x){
                int ny=y-x;
                pq.add(ny);

            }
        }
        System.out.print(pq.peek());
    }
    
}
