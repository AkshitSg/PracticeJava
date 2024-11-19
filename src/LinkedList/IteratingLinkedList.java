package LinkedList;

import java.util.*;

public class IteratingLinkedList {
    public static void main(String [] args){
//        Creating linked list
        List<String> list=new LinkedList<String>();
//         adding elements in list
        list.add("Amritesh");
        list.add("Akshit");
        list.add("Drishti");
        list.add("Tushar");
        System.out.println(list);
        ListIterator itr= list.listIterator(list.size());
        System.out.println(itr.next());
    }
}
