package LinkedList;

import java.util.*;
public class InsertAtIndex {
    public static void main(String[] args){
        List<String> list=new LinkedList<String>();
        list.add("Drishti");
        list.add("Akshit");
//      insert element at specified index.
        list.add(1,"Amritesh");
        System.out.println(list);
    }
}
