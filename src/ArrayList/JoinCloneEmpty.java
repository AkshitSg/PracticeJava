package ArrayList;

import java.util.*;
public class JoinCloneEmpty {
    public static void main(String[] args){
//        ArrayList declaration
        ArrayList<String> al=new ArrayList<String>(50);
        al.add("Tushar");
        al.add("Sajid");
        al.add("Amritesh");
        al.add("Drishti");
        al.add("Akshit");
        al.add("Tarun");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Yogesh");
        al2.add("Ajeet");
        al2.add("Rahul");
//        joining two lists
        System.out.println("List before joining:"+al);
        al.addAll(al2);
        System.out.println("List after joining: "+al);

//        duplicate arraylist
        ArrayList<String> angularJava= (ArrayList<String>) al.clone();
        System.out.println("Angular Java team members: "+angularJava);

//        clearing list al
        al.clear();
        System.out.println(al.isEmpty()?"Yes":"No");

    }
}
