import java.util.*;
class HashSet{
    public static void main(String[] args) {
      HashSet <String> set = new <String> HashSet();
       
       
       set.add("one");
       set.add("Two");
       set.add("Four");
       set.add("Three");
       set.add("five");

       Iterator <String> i=set.Iterator();
       while(i.hasNext()){
        System.out.println(i.next());
       }
    }
}