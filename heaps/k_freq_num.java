import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class k_freq_num {
    static class Pair implements Comparable<Pair>{
        int val;
        int fr;
        Pair(int val,int fr){
            this.val=val;
            this.fr=fr;

        }
        @Override
        public int compareTo(Pair p2){
            return p2.fr-this.fr;
        }
    }
    public static void main(String[] args) {
        /*[1,1,1,2,2,3], k = 2 Output: [1,2] */

        int[] arr={1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int c=map.get(arr[i]);
                map.put(arr[i],c+1);
            }
        }
        /*for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        } */
       
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
            
        }
        for(int i=0;i<k;i++){
            System.out.print(pq.remove().val+" ");
        }
    }
    
}
