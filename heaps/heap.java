import java.util.ArrayList;


public class heap {

   
        ArrayList<Integer> ll=new ArrayList<>();
        public void insert(int val){
            ll.add(val);
            int n=ll.size()-1;
            int par=(n-1)/2;
            while(ll.get(par)>ll.get(n)){
                int temp=ll.get(n);
                ll.set(n,ll.get(par));
                ll.set(par,temp);
                n=par;
                par=(n-1)/2;


            }

        }
        
        public int peek(){
            return ll.get(0);
        }
        public void heapify(int i){
            int left=2*i+1;
            int right =2*i+2;
            int minidx=i;
            if(left<ll.size() && ll.get(left)<ll.get(minidx)){
                minidx=left;
            }
            if(right<ll.size() && ll.get(right)<ll.get(minidx)){
                minidx=left;
            }
            if(minidx!=i){
                int temp=ll.get(minidx);
                ll.set(minidx,ll.get(i));
                ll.set(i,temp);
                heapify(minidx);
            }
        }
        public int remove(){

            int data=ll.get(0);//step-1 0th element nika lo
            int temp=ll.get(0);//0th elemenet htado 
            int n=ll.size()-1;
            ll.set(0,ll.get(n));//last ele ko 0 pr rkhdo
            ll.set(n,temp);//last jgh pr 0 ko rkhdo
            ll.remove(ll.get(n)); // last element udado 
            heapify(0);


            return data;
        }
        public boolean isEmpty(){
            return ll.size()==0;
        }
    
    public static void main(String[] args) {
        heap h=new heap();
        h.insert(0);
        h.insert(10);
        h.insert(1);
        while(!h.isEmpty()){
            System.out.print(h.remove()+" ");
        }
        
    }
    
}
