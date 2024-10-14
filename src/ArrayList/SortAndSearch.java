package ArrayList;

import java.util.*;
public class SortAndSearch {

    public static void main(String[] args){

//        ArrayList implementation of list.
        List<String> al=new ArrayList<String>();
//        adding elements in list.
        al.add("Drishti");
        al.add("Akshit");
        al.add("Yogesh");
        al.add("Tushar");
        al.add("Saurabh");
        al.add("Amritesh");

        System.out.println("List before sorting: ");
        al.forEach(System.out::println);

//      sorting the list
        Collections.sort(al);

        System.out.println("List after sorting: ");
        al.forEach(System.out::println);

//        Taking user input
        Scanner myObj=new Scanner(System.in);
        System.out.println("Please enter a name you want to search in the list: ");
        String name=myObj.nextLine();

        if(al.contains(name)){
            int index=al.indexOf(name);
            System.out.println(name+" exists in our list at index "+index+".");
        }else{
            System.out.println(name+" is not on our list. Please try some other name.");
        }
    }
}
