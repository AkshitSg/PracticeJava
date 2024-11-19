package LinkedList;

import java.util.*;
public class InsertElementsAtSpecfiedIndex {
    public static void main(String[] args){
//        create main list
        List<Integer> alist=new LinkedList<Integer>();
        alist.add(1);
        alist.add(6);
        alist.add(7);
        alist.add(8);
        alist.add(9);
        System.out.println("List before appending: "+alist);
//        create list for elements you want to append at the specified index.
        List<Integer> blist=new LinkedList<Integer>();
        blist.add(2);
        blist.add(3);
        blist.add(4);
        blist.add(5);

//        append b_list in a_list at specfied index.
        alist.addAll(1,blist);
        System.out.println("List after appending: "+alist);
    }
}
