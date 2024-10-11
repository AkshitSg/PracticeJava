package ArrayList;

import java.util.*;
public class SearchElement {
public static void main(String[] args){

//    Taking input from keyboard
    Scanner myObj=new Scanner(System.in);
    System.out.println("Enter a name you want to search: ");
    String name= myObj.nextLine();

//    Creating ArrayList
    ArrayList<String> names=new ArrayList<String>();
    names.add("Ajay");
    names.add("Amit");
    names.add("Kanika");
    names.add("Tushar");
    names.add("Kamal");

//    Searching element in list
    if(names.contains(name)){
        System.out.println("Yes! "+name+" is in the list at index "+names.indexOf(name)+".");
    }
    else {
        System.out.println(name+" is not on the list.");
    }
}
}
