package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class ImportantMethods {
    public static void main(String[] args){
//        creating a hashset.
        HashSet<String> set=new HashSet<>();
//        1. add()- adding elements in set.
        set.add("Akshit");
        set.add("Tushar");
        set.add("Ajeet");
        set.add("Kanika");
        set.add("Drishit");
        set.add("Rahul");
        System.out.println(set);

//        2. clone()- returns a shallow copy of hashset.
        HashSet<String> set1=(HashSet<String>) set.clone();
        System.out.println(set1);

//        3. contains()- checks if set contains specified character.
        System.out.println(set.contains("Rahul"));

//        4. isEmpty()- checks if the set is empty.
        System.out.println(set.isEmpty());


//        5. Iterator- for iterating the set.
        Iterator itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        6. clear()- remove all elements from set.\
        set1.clear();
        System.out.println("Set1: "+set1);
    }
}
