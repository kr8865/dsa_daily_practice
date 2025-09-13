import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class topview {
    static class Info{
        Node dat;
        int hd;
        Info(Node dat ,int hd){
            this.dat=dat;
            this.hd=hd;

        }
    }
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    static int i=-1;
    public static Node buildpre(int[] nodes){
        i++;
        if(nodes[i]==-1){
            return null;
        }

        Node newnode=new Node(nodes[i]);
        newnode.left=buildpre(nodes);
        newnode.right=buildpre(nodes);
        return newnode;


    }
    public static void topview(Node root){
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        q.add(new Info(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Info v=q.remove();
                Node l=v.dat;
                int hd=v.hd;
                if(!map.containsKey(hd)){
                    map.put(hd,l.data);
                    if(l.left!=null){
                        q.add(new Info(l.left,hd-1));
                    }
                    if(l.right!=null){
                        q.add(new Info(l.right,hd+1));
                    }   

                }

            }
        }
        for(int key:new TreeMap<>(map).keySet()){
                System.out.print(map.get(key)+" ");
        }
    }
     public static void main(String[] args) {
        int[] nodes={10,20,40,-1,-1,50,-1,-1,30,60,-1,-1,70,-1,-1};
        Node root1=buildpre(nodes);
        topview(root1);
        
     }
    
}
