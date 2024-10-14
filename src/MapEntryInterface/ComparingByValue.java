package MapEntryInterface;

import java.util.*;
public class ComparingByValue {

    public static void main(String[] args){

        Map<Integer,String> map=new HashMap<Integer,String>();

        map.put(100,"Drishti");
        map.put(101,"Sajid");
        map.put(102,"Tushar");
        map.put(103,"Amritesh");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
