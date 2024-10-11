package ArrayList;

import java.util.*;
public class SixWaysToPrintArrayList {
    public static void main(String [] args){

        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");

//        There are 6 ways to print an array list

//        6. using forEachRemaining() method java 8
        //        1. using iterator interface
        Iterator itr= colors.iterator();
        while (itr.hasNext()){
            System.out.println("Colors: "+itr.next());
        }
//        2. using listIterator interface
        Iterator lItr= colors.listIterator();
        while(lItr.hasNext()){
            System.out.println("Colors: "+lItr.next());
        }
//        3. using forEach loop
        for(String color:colors){
            System.out.println("Colors: "+color);
        }
//        4. using for loop
        for(int i=0;i< colors.size();i++){
            System.out.println("Colors: "+colors.get(i));
        }
//        5. using forEach() Method java 8
        colors.forEach(color->{
            System.out.println("Colors: "+color);
        });

//        6. using forEachRemaining() method java 8
        System.out.println("Using forEachRemaing() method on iterator, this will print only last two colors");
        Iterator itr2= colors.iterator();
        itr2.next();
        itr2.next();
        itr2.forEachRemaining(color->{
            System.out.println("Colors: "+color);
        });
    }
}
