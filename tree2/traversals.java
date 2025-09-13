import java.util.*;

public class traversals {
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
    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> finall = new ArrayList<>();
        if (root == null) return finall;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.remove();
                level.add(node.data);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            finall.add(level);
        }

        Collections.reverse(finall);
        return finall;
    }
    public static void Zigzag(Node root){
        Queue<Node> q=new LinkedList();
        q.add(root);
        boolean dir=false;

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node val=q.remove();
                level.add(val.data);
                if(val.left!=null){
                    q.add(val.left);
                }
                if(val.right!=null){
                    q.add(val.right);
                }
            }

                if(dir){
                    Collections.reverse(level);
                }
                dir=!dir;
                System.out.println(level);   

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
    public static void main(String[] args) {
        int[] nodes={10,20,40,-1,-1,50,-1,-1,30,60,-1,-1,70,-1,-1};
        Node root1=buildpre(nodes);
        levelOrder(root1);
        Zigzag(root1);
        
        
    }
    
}
