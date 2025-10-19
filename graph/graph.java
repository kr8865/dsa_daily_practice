import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph{
    static class Graph{
        int src;
        int destination;
        int weight;
        Graph(int s, int d, int w){
            this.src = s;
            this.destination = d;
            this.weight = w;
        }

    }
    public static void bfs(ArrayList<Graph>[] g, int start){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[g.length];
        q.add(start);   
        visited[start]=true;
        while(!q.isEmpty()){        
            int node=q.poll();
            System.out.print(node+" ");
            for(int i=0;i<g[node].size();i++){
                if(!visited[g[node].get(i).destination]){
                    q.add(g[node].get(i).destination);
                    visited[g[node].get(i).destination]=true;
                }
            }
        }


    }
    public static void dfs(ArrayList<Graph>[] g,int curr,boolean[] visited){
        
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<g [curr].size();i++){
            Graph gi=g[curr].get(i);
            if(!visited[gi.destination ]){
                dfs(g,gi.destination,visited);

            }

        }



        

    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Graph>[] g = new ArrayList[v];
        for(int i=0;i<v;i++){
            g[i]=new ArrayList<>();
        }
        g[0].add(new Graph(0, 1, 10));
        g[1].add(new Graph(1, 2, 20));
        g[2].add(new Graph(2, 0, 30));                     
        for(int i=0; i<g[2].size(); i++){
            System.out.println("Source: " + g[2].get(i).src + ", Destination: " + g[2].get(i).destination + ", Weight: " + g[2].get(i).weight);
        }
        bfs(g, 0);
        boolean[] visited=new boolean[g.length];
        dfs(g,0,visited);
        
    }
}