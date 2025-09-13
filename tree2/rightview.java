import java.util.ArrayList;

public class rightview {
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
    public static void rightview(Node root,ArrayList<Integer> ll,int level){
        if(root==null){
            return;
        }
        if(ll.size()==level){
            ll.add(root.data);
        }
        rightview(root.right, ll, level+1);
        rightview(root.left, ll, level+1);

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
        ArrayList<Integer> ll=new ArrayList<>();
        rightview(root1, ll, 0);
        System.out.println(ll);

        
    }
    
}

