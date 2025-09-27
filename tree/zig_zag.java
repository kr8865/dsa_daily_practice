import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class zig_zag{
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static int i=-1;
    public static Node buildtree(String[] tree){
        int val=Integer.parseInt(tree[++i]);
        boolean hlc= Boolean.parseBoolean(tree[++i]);
       
        Node newnode=new Node(val);
        if(hlc){
            newnode.left=buildtree(tree);
        }
        boolean rlc= Boolean.parseBoolean(tree[++i]);
        if(rlc){
            newnode.right=buildtree(tree);
        }
        return newnode;
    }
    public static void zigzag(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean lefttor=false;
        while(!q.isEmpty()){
            int size=q.size();
            
            ArrayList<Integer> ll=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node v=q.poll();
                ll.add(v.val);
                if(v.left!=null){
                    q.add(v.left);
                }
                if(v.right!=null){
                    q.add(v.right);
                }
            }
            if(lefttor){
                Collections.reverse(ll);

            }
            lefttor=!lefttor;
            for(int i=0;i<ll.size();i++){
                System.out.print(ll.get(i)+" ");
            }
            
        }

    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] tree={"10","true","20","true","40","false","false","true","50","false",
        "false","true","30","true","60","false","false","true","73","false","false"};
        Node root=buildtree(tree);
        zigzag(root);
    }
}
