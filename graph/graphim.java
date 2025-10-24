import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphim {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;

        }

    }
    public static void bfs(int v,ArrayList<Edge>[] graph){
        boolean[] vis=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                int dest=graph[curr].get(i).dest;
                if(!vis[dest]){
                    
                    q.add(dest);
                    vis[dest]=true;
                }
            }
        }
        
    }
    public static void dfs(boolean[]vis,ArrayList<Edge>[] graph,int curr){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            int dest=graph[curr].get(i).dest;
            if(!vis[dest]){
                dfs(vis,graph,dest);
            }

        }

    }
    public static void bfs_connected(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfs_util(graph,vis,q,i);
            }
        }

    }
    public static boolean is_cycle(int curr,ArrayList<Edge> graph[],boolean[] vis,int par){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            int dest=graph[curr].get(i).dest;
            if(!vis[dest]){
                return is_cycle(dest, graph, vis,dest);
            }
            else if(vis[dest] && par!=dest){
                return true;
            }

        }
    }


    public static void bfs_util(ArrayList<Edge>[] graph,boolean[] vis,Queue<Integer> q,int curr){
        q.add(curr);
        vis[curr]=true;
         while(!q.isEmpty()){
            int cur=q.poll();
            System.out.print(cur+" ");
            for(int i=0;i<graph[cur].size();i++){
            int dest=graph[cur].get(i).dest;
            if(!vis[dest]){
                q.add(dest);
                vis[dest]=true;
            }
        }
 }
        


    }
    public static boolean hasPath(int src,int des,ArrayList<Edge>[] graph,boolean[] vis){
        if(src==des){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            int dest=graph[src].get(i).dest;
            if(!vis[dest]&& hasPath(dest, des, graph, vis)){
                return true;
            }
        }
        return false;
        

    }
    public static void main(String[] args) {
        int v=8;
        ArrayList<Edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 0));
        graph[4].add(new Edge(4, 3));
        graph[7].add(new Edge(6,7));
        //bfs(v, graph);
        //boolean[] vis=new boolean[v];
        //dfs(vis, graph, 0);
        //System.out.print(hasPath(1, 3, graph, vis));
        bfs_connected(graph);

        
    }
    
}
