package LinkedList;

import java.util.*;

public class LinkedListToHashSetConversion {
    public static void main(String[] args){

//        Create an empty hash set.
        HashSet<String> set=new HashSet<String>();
//        create LinkedList
        List<String> list=new LinkedList<String>();
        list.add("Akshit");
        list.add("Akshit");
        list.add("Amritesh");
        list.add("Ajeet");
//        Print list
        System.out.println("Size of list: "+list.size()); // size is 4
        System.out.println(list);
//        Iterate list and add elements to the set one by one.
        for (String s :list){
            set.add(s);
        }
        System.out.println("Size of set: "+set.size()); // size is 3 because only unique elements allowed in set.
//        printing elements of the set.
        for(String s:set){
            System.out.println(s);
        }
    }
}