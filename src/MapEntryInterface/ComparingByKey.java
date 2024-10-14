package MapEntryInterface;

import java.util.*;

public class ComparingByKey {

    public static void main(String[] args){
//      creating a map
        Map<Integer,String> map=new HashMap<Integer, String>();
//      adding entries in map
        map.put(101,"Akshit");
        map.put(100,"Amritesh");
        map.put(102,"Drishti");

//      returns set view of the entries in the map.
        map.entrySet()

//      returns sequential stream with this collection as its source.
        .stream()

//      returns sorted stream as per the given comparator.
        .sorted(Map.Entry.comparingByKey())

//       performs action on each element of this stream.
        .forEach(System.out::println);
    }
}
