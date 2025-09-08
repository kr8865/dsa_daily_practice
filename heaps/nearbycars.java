
import java.util.PriorityQueue;

public class nearbycars {
    static class cars implements Comparable<cars>{
        int x;
        int y;
        int dis;
        int idx;
        cars(int x,int y,int dis,int idx){
            this.x=x;
            this.y=y;
            this.dis=dis;
            this.idx=idx;
        }


        @Override
        public int compareTo(cars c2){
            return this.dis-c2.dis;
        }
    }

    public static void main(String[] args) {
        
        PriorityQueue<cars> pq=new PriorityQueue<>();
        int axis[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        for(int i=0;i<axis.length;i++){
            int dissq=axis[i][0]*axis[i][0]+axis[i][1]*axis[i][1];
            pq.add(new cars (axis[i][0],axis[i][1],dissq,i));
        }

        for(int i=0;i<k;i++){
            System.out.println(pq.remove().idx);
        }
    }
    
}
