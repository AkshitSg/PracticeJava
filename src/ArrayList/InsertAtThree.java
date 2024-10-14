package ArrayList;

import java.util.*;
public class InsertAtThree {

    public static void main(String[] args){
//        creating array list.
        List<String> al=new ArrayList<String>();
//        adding elements in list
        al.add("Aksit");
        al.add("Drishti");
        al.add("Amritesh");
        al.add("Rahul");

//        adding element at third (index=2) in list.
        al.add(2,"Tushar");
//        printing elements using forEach method.
        al.forEach(System.out::println);
    }

}
