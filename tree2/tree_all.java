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
    
    public static void Boundarytraversal(){








        
    }
    static int maxv= Integer.MIN_VALUE;
    public static int Max_path(Node root){
        if(root==null){
            return 0;
        }
        int l_max=Math.max(0,Max_path(root.left));
        int r_max=Math.max(0,Max_path(root.right));
        int slf_max=l_max+r_max+root.data;
        maxv=Math.max(max,slf_max);


        return Math.max(l_max,r_max)+root.data;
    }
    public static int lca(Node root,Node root1,Node root2){
        ArrayList<Integer> ll1=new ArrayList<>();
         ArrayList<Integer> ll2=new ArrayList<>();
        path(root,root1.data,ll1);
        path(root,root1.data,ll2);
        for(int i=0;i<ll1.size() && i<ll2.size();i++){
            if(ll1.get(i)!=ll2.get(i)){
                break;
            }

        }
        int lca=ll1.get(i-1);
        return lca;




    }
    public static boolean  path(Node root,int val,ArrayList<Integer> ll){
        if(root==null){
            return false;
        }
        ll.add(root.data);
        if(root.data==val){
            return true;
        }
        boolean left=path(root.left, val, ll);
        boolean right=path(root.right, val, ll);
        if(left|| right){
            return true;
        }
        ll.remove(ll.size()-1);
        return false;





    }   
    public static void morrisin(Node root){
        Node curr=root;
        while(curr!=null){
        if(curr.left==null){
            System.out.print(curr.data+" ");
            curr=curr.right;
        }
        else{
            Node prev=curr.left;
            while(prev.right!=null && prev.right!= curr){
                prev=prev.right;
            }
            if(prev.right==null){
                prev.right=curr;
                curr=curr.left;
            }
            else{
                prev.right=null;
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
        }
    }
    }
    public static void morrispre(Node root){
        Node curr=root;
        while(curr!=null){
            if(curr.left==null){
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
            else{
                Node prev=curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=curr;
                    System.out.print(curr.data+" ");
                    curr=curr.left;
                }
                else{
                    prev.right=null;
                    curr=curr.right;
                }
            }
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
        morrispre(root1);
        //System.out.print(root1.data);
        idx=nodes.length-1;
        //levelOrder(root1);
        //Zigzag(root1);
        
    }

    
}
