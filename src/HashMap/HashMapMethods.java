package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMethods {
    public static void main(String[] args){

//      1.  associate the specified value with the specified key
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"Akshit");
        map.put(2,"Amritesh");
        map.put(3,"Ajeet");
        System.out.println("Created map: "+map);
        map.put(3,"Tuhshar");
        System.out.println("Updated map: "+map);

//      2. count the number of key-value (size) mappings
        System.out.println("No of entries in map: "+map.size());

//      3. copy all mappings from the specified map to another map.
        Map<Integer, String> mapCopy = new HashMap<>(map);
        System.out.println("Copy of map: "+mapCopy);

//      4. remove all mappings from a map.
        mapCopy.clear();

//      5. check whether a map is empty or not.
        System.out.println("Map after .clear() method: "+mapCopy.isEmpty());

//      6. to get a shallow copy of a HashMap instance.
        HashMap<Integer,String> clonedMap=new HashMap<Integer,String>((HashMap)map.clone());
        System.out.println(clonedMap);

//      7. test if a map contains a mapping for the specified key.
        System.out.println("Map contains specfied key: "+map.containsKey(1));

//      8. create a set view of the mappings and keys contained in a map.
        System.out.println("Set view of entries od map: "+map.entrySet()+"\nSet view of keys in map:"+map.keySet());

//      9. get the value of a specified key in a map.
        System.out.println("value of specified key: "+map.get(1));

    }
}
