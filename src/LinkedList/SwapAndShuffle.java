package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwapAndShuffle {
    public static void main(String[] args){
        List<String> list=new LinkedList<>();
        list.add("Akshit");
        list.add("Drishti");
        System.out.println("Before swapping: "+list);
        Collections.swap(list,0,1);
        System.out.println("After swapping: "+list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
