import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class k_freq {
    
    static class Pair implements Comparable<Pair>{
        String word;
        int freq;
    Pair(String word,int freq){
        this.word=word;
        this.freq=freq;
    }
    @Override
public int compareTo(Pair p2) {
    if (this.freq == p2.freq) {
        return this.word.compareTo(p2.word); // lexicographic order if freq equal
    }
    return p2.freq - this.freq; // higher frequency first
}


    }
    public static void main(String[] args) {
         //words = ["i","love","leetcode","i","love","coding"], k = 2
         String[] word={"i","love","leetcode","i","love","coding"};
         int  k = 2;
         ArrayList<String> ll=new ArrayList<>();
         PriorityQueue<Pair> pq=new PriorityQueue<>();
         HashMap<String,Integer> map=new HashMap<>();
         for(int i=0;i<word.length;i++){
            if(!map.containsKey(word[i])){
                map.put(word[i],1);
            }
            else{
                int c=map.get(word[i]);
                map.put(word[i],c+1);
            }
         }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
         for(int i=0;i<k;i++){
            ll.add(pq.remove().word);
         }
         

         

         
    }
    
}
