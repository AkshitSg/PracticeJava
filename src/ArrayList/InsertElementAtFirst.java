package ArrayList;

import java.util.*;
public class InsertElementAtFirst {
public static void main(String[] args){
    List<String> names=new ArrayList<String>();
    names.add("Ajay");
    names.add("Amit");
    names.add("Kanika");
    names.add("Tushar");
    names.add("Kamal");
//    list before
    System.out.println("List before:");
    names.forEach(name->{
        System.out.println("Name: "+name);
    });
//    adding element at first (index 0)
    names.add(0,"Akshit");
// list after
    System.out.println("List after:");
    names.forEach(name->{
        System.out.println("Name: "+name);
    });
}
}
