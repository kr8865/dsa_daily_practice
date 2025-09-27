import java.util.Scanner;

public class is_bal {
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
    public static int is_balance(Node root){
        if(root==null){
            return 0;
        }
        int lh=is_balance(root.left);
        if(lh==-1){
            return -1;
        }

        int rh=is_balance(root.right);
        if(rh==-1){
            return -1;
        }

        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh,rh)+1;

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String[] tree={
  "10","true","20","true","40","false","false","false","false"
};

        Node root=buildtree(tree);
        int l=is_balance(root);
        System.out.print(l);
        
        
    }
    
}
