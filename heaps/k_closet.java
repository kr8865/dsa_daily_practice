

import java.util.PriorityQueue;

public class k_closet {
    public static class axis implements Comparable<axis>{
        int x;
        int y;
        int dist;
        axis(int x,int y,int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
        @Override
        public int compareTo(axis a2){
            return this.dist-a2.dist;
        }
    }
    public static void main(String[] args) {

       int[][] points = {{1,3},{-2,2}};
       PriorityQueue<axis> pq=new PriorityQueue<>();
        int k=1;
        for(int i=0;i<points.length;i++){
            int dis=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new axis(points[i][0], points[i][1], dis));

        }
        int[][] arr=new int[k][2];
        for(int i=0;i<arr.length;i++){
                arr[i][0]=pq.remove().x;
                arr[i][1]=pq.remove().y;
            
        }
        System.out.print(arr[0][0]);

        
    }
    
}
