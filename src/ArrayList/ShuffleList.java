package ArrayList;

import java.util.*;

public class ShuffleList {
public static void main(String[] args){

    ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    System.out.println("Array list before shuffling: ");
    al.forEach(System.out::println);
    System.out.println("Array list after shuffling: ");
//    Collection class has shuffle method to shuffle the elements of a collection.
    Collections.shuffle(al);
    al.forEach(System.out::println);
}
}
