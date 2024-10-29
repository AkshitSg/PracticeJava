package ArrayList;
import java.util.*;
public class SwappingElementsOfArrayList {
    public static void main(String[] args){
//        ArrayList declaration
        ArrayList<String> al=new ArrayList<String>();
        al.add("Red");
        al.add("Green");
        al.add("Black");
        al.add("White");
        al.add("Pink");

//        printing original al
        System.out.println(al);

//        getting input from  user
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter color you want to swap: ");
        String color1=myObj.nextLine();
        System.out.println("Enter color you want to swap with: ");
        String color2=myObj.nextLine();

//        swapping elements
        if(al.contains(color1)&&al.contains(color2)){
            al.set(al.indexOf(color1),color2);
            al.set(al.indexOf(color2),color1);
            System.out.println(al);
        }
        else{
            System.out.println("Please select colors from the below list.");
        }
    }
}
