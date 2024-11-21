package LinkedList;

import java.util.*;

public class RemoveElement {
    public static void main(String[] args){

        List<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List beofre: "+list);
//        Removing firist and last element
        list.remove(0);
        list.remove(list.size()-1);

        System.out.println("List after: "+list);
    }
}
