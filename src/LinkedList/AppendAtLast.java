package LinkedList;

import java.util.*;

public class AppendAtLast {
public static void main(String[] args){
    List<String> list=new LinkedList<String>();
    list.add(list.size(), "Drishti");
    list.add(list.size(), "Akshit");
    list.add(list.size(), "Amritesh");
    System.out.println(list);
}
}
