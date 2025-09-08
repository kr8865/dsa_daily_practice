

import java.util.ArrayList;

 class heaps {
    class heap{
    ArrayList<Integer> arr=new ArrayList<>();
    public void insert(int item){

        arr.add(item);
        int idx=arr.size()-1;
        int pidx=(idx-1)/2;
        while(idx>0 && arr.get(idx)<arr.get(pidx)){
            swap(idx,pidx);
            idx=pidx;
            pidx=(idx-1)/2;

        }

    }
    public  void swap(int idx,int pidx){
        int temp=arr.get(idx);
        arr.set(idx,arr.get(pidx));
        arr.set(pidx,temp);
    }

    public int peek(){
        return arr.get(0);
    }
    public  boolean isEmpty(){
        return arr.size()==0;
    }
    public int remove(){
        swap(0,arr.size()-1);
        int data=arr.get(arr.size()-1);

        arr.remove(arr.size()-1);

        heapify(0);
        return data;
        



    }
    public  void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int minidx=i;
        if(left<arr.size() && arr.get(left)<arr.get(minidx)){
            minidx=left;
        }
        if(right<arr.size() && arr.get(right)<arr.get(minidx)){
            minidx=right;
        }
        if(minidx!=i){
            swap(i,minidx);
            heapify(minidx);

        }



    }
    
    }


    public  void main(String[] args) {
        heap h=new heap();

        h.insert(1);
        h.insert(9);
        h.insert(5);
        h.insert(4);
        while(!h.isEmpty()){
            System.out.println(h.remove());
        }

    }
    
}
