package MapEntryInterface;

import java.util.*;
public class ComparingByValueDescending {

    public static void main(String[] args){

//        creating hash map.
        Map<Integer,String> hm=new HashMap<Integer, String>();

//        adding entries in has map.
        hm.put(100,"Akshit");
        hm.put(101,"Drishti");
        hm.put(102,"Saurabh");
        hm.put(103,"Yogesh");

//        returns set view of this collection
        hm.entrySet()
//                returns sequential stream with this collection as its source.
                .stream()
//                returns sorted stream as per the given comparator.
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                performs action on each element of the stream.
                .forEach(System.out::println);

    }
}
