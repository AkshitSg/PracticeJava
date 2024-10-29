package ArrayList;
import java.util.*;
public class SubList {
    public static void main(String[] args){

        ArrayList<Integer> sublist=new ArrayList<Integer>();
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        sublist.addAll(al.subList(3,7));
        System.out.println("Array List: ");
        al.forEach(System.out::println);
        System.out.println("Sub List: ");
        sublist.forEach(System.out::println);
    }
}
