package MapEntryInterface;

import java.util.*;

public class ComparingByKeyDescending {

    public static void main(String[] args){

        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        hm.put(100,"Amritesh");
        hm.put(101,"Drishti");
        hm.put(102,"Akshit");

        hm.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
