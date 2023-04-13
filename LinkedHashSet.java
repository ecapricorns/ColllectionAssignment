import java.util.*;
class LinkedHashSet{
    public static void main(String[] args) {
        LinkedHashSet <String> set = new LinkedHashSet();
         
       set.add("one");
       set.add("Two");
       set.add("Four");
       set.add("Three");
       set.add("five");

       Iterator <String> i =set.Iterator();
       while(i.hasNext()){
        System.out.println(i.next());
       }

    }
}