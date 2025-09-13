import org.w3c.dom.Node;

public class order {
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
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null){
            return ;
        }
       
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
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
        
    }
    
}
