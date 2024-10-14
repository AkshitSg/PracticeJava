package ArrayList;

import java.util.*;
public class ReverseArrayList {

    public static void main(String[] args){

        List<String> al=new ArrayList<>();
        al.add("Akshit");
        al.add("Drishti");
        al.add("Amritesh");
        al.add("Rahul");

        Collections.reverse(al);
        al.forEach(System.out::println);
    }
}
