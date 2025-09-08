import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class zig_za {
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

    public static void Zig_zag(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean dir=false;
        q.add(null);

        while(!q.isEmpty()){
            Node t=q.remove();
            if(t!=null){
                System.out.print(t.val+" ");
                if(dir){
                    if(t.left!=null){
                        q.add(t.left);
                    }
                    if(t.right!=null){
                        q.add(t.right);
                    }
                }
                else{
                    ArrayList<Node> ll=new ArrayList<>();
                    if(t.left!=null){
                        ll.add(t.left);
                    }
                    if(t.right!=null){
                        ll.add(t.right);
                    }
                    Collections.reverse(ll);
                    for(int i=0;i<ll.size();i++){
                        q.add(ll.get(i));   // ✅ keep original nodes
                    }
                }

            }
            else {
                if(!q.isEmpty()){
                    q.add(null);
                }
                System.out.println();
                dir=!dir;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] tree={"10","true","20","true","40","false","false","true","50","false",
        "false","true","30","true","60","false","false","true","73","false","false"};
        Node root=buildtree(tree);
        Zig_zag(root);
    }
}
