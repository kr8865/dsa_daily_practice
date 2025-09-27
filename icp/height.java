import java.util.*;


public class height {
    static class Person { //generic type 
        String name;
        int height;
        int age;
        Person(String name,int height,int age){
            this.name=name;
            this.height=height;
            this.age=age;
        }
        //@Override
        /*public int compareTo(Person p2){
            if(this.age==p2.age){
                if(this.height!=p2.height){
                return this.height-p2.height;
                }
                else{
                    this.name.compareTo(p2.name);
                }
            }
            return this.age-p2.age;
            


        }*/
        @Override
        public String toString(){
            return " name "+this.name +" age is " + this.age +" height " +this.height;
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
     
        list.add(new Person("kratika", 16, 19));
        list.add(new Person("krati", 165, 20));
        list.add(new Person("kr", 1, 20));
        list.add(new Person("deepika", 0, 20));
        Collections.sort(list,(a,b)->{
            if(a.age==b.age){
                return a.height-b.height;
            }
            return a.age-b.age;
        });
        System.out.println(list.toString());
       
        

     


        
    }
    
}
