import java.util.*;


public class tree_all {
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
    public static Node buildTree(Scanner sc){
        int val=sc.nextInt();
        Node newnode=new Node(val);
        boolean hlc=sc.nextBoolean();
        if(hlc){
            newnode.left=buildTree(sc);
        }
        boolean rlc=sc.nextBoolean();
        if(rlc){
            newnode.right=buildTree(sc);
        }
        return newnode;

    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    static  int max=-1;
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int slf=ld+rd;
        max=Math.max(slf,max);
        return Math.max(ld,rd)+1;
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
    static int idx;
   
    public static Node buildpost(int[] nodes){
        if(nodes[i]==-1){
            idx--;
            return null;
            
        }

        Node newnode=new Node(nodes[i]);
        idx--;
        newnode.right=buildpost(nodes);
        newnode.left=buildpost(nodes);
        
        
        return newnode;

    }
    public static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> finall=new ArrayList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> level=new ArrayList<>();

        while(!q.isEmpty()){
           
            Node val=q.remove();
            if(val==null){
                finall.add((level));
                level=new ArrayList<>();

                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                level.add(val.data);
                if(val.left!=null){
                    q.add(val.left);
                }
                if(val.right!=null){
                    q.add(val.right);
                }

            }

        }
        Collections.reverse(finall);
        for(int i=0;i<finall.size();i++){
            System.out.println(finall.get(i));
        }
        System.out.println();
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
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
         
        Node root=buildTree(sc);
        System.out.println(root.data);
        int h=height(root);
        System.out.println(h);
        diameter(root);
        System.out.println(max);*/
        int[] nodes={10,20,40,-1,-1,50,-1,-1,30,60,-1,-1,70,-1,-1};
        Node root1=buildpre(nodes);
        //System.out.print(root1.data);
        idx=nodes.length-1;
        //levelOrder(root1);
        Zigzag(root1);
        
    }

    
}
