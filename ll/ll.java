public class ll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        static Node head=null;
    }
    public static int countNodes(Node head){
        Node slow=head;
        Node fast=head;
        if(head==null) return 0;
        int c=1;
        while(slow!=fast || c==1){
            slow=slow.next;
            fast=fast.next.next;    
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Node head =new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next = head;
        System.out.println(countNodes(head));

    }
    
}
