package heaps;

import java.util.PriorityQueue;

public class weakest_soldier {
    public static class soldier implements Comparable<soldier>{
        int sol;
        int i;
        soldier(int sol,int i){
            this.sol=sol;
            this.i=i;
        }
        @Override
        public int compareTo(soldier s2){

            if(this.sol==s2.sol){
                return this.i-s2.i;
            }
            else{
                return this.sol-s2.sol;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,0,0,0},
                         {1,1,1,1},{1,0,0,0},{1,0,0,0}};
        PriorityQueue<soldier> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int cs=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    cs+=arr[i][j];
                }
            }
                pq.add(new soldier(cs,i));
            

        }
        int k=2;
        for(int i=0;i<k;i++){
            System.out.println(pq.remove().i);
        }
        
    }
    
}
