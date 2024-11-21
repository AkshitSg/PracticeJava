package LinkedList;

import java.util.*;

public class ElementsAndPosition {
    public static void main(String[] args){
//        creating a linkedlist.
        List<String> list=new LinkedList<String>();
        list.add("Amritesh");
        list.add("Akshit");
        list.add("Ajeet");
//       printing each element with its position in list.
        for(String s:list){
            System.out.println("Element: "+s+" Position: "+list.indexOf(s));
        }
    }
}
