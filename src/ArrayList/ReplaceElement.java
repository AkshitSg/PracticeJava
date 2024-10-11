package ArrayList;

import java.util.*;
public class ReplaceElement {
public static void main(String[] args){
//    Taking input from user
    Scanner myObj=new Scanner(System.in);       // creating object of scanner class.
    System.out.println("Enter a name:");        // taking input from keyboard.
    String name= myObj.nextLine();              // reading input from keyboard

    ArrayList<String> names=new ArrayList<String>();
    names.add("Ajay");
    names.add("Amit");
    names.add("Kanika");
    names.add("Tushar");
    names.add("Kamal");
//    list before
    System.out.println("List before:");
    names.forEach(n->{
        System.out.println("Name: "+n);
    });
//    replacing element with input
    names.set(1,name);
//    list after
    System.out.println("List after:");
    names.forEach(n->{
        System.out.println("Name: "+n);
    });
}
}
