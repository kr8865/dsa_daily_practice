import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_l {
    static class Pair implements Comparable<Pair>{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val=val;
            this.freq=freq;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.freq-this.freq;
        }

    }
    public static void main(String[] args) {
        //nums = [1,1,1,2,2,3], k = 2
        int[] nums={1,2,1,2,1,2,3,1,3,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int v=map.get(nums[i]);
                map.put(nums[i],v+1);
            }
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
            
        }
        int k=2;
        while(k>0){
            Pair p=pq.remove();
            int f=p.val;
            System.out.print(f);
            k--;
        }
    }
    
}
