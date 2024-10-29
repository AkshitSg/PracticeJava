package ArrayList;

import java.util.*;
public class ComparingElementsOfArrayList {
    public static void main(String[] args){
//        first arraylist
        ArrayList<Integer> fl=new ArrayList<Integer>();
        fl.add(1);
        fl.add(2);
        fl.add(3);
        fl.add(4);
        fl.add(5);
        System.out.println("First list:"+fl);
//        Second arraylist
        ArrayList<Integer> sl=new ArrayList<Integer>();
        sl.add(1);
        sl.add(6);
        sl.add(3);
        sl.add(7);
        sl.add(5);
        System.out.println("Second list:"+sl);
//        Result arraylist
        ArrayList<String> rl=new ArrayList<String>();

        for (Integer element:fl){
            rl.add(sl.contains(element)?"Yes":"NO");
        }
        System.out.println(rl);
    }
}
