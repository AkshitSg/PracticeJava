package Java8Stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicate {

    public static void main(String[] args){
        List<String> ll=new LinkedList<String>();
        ll.add("Java");
        ll.add("Python");
        ll.add("C#");
        ll.add("Java");
        ll.add("Kotlin");
        ll.add("Python");
        System.out.println(ll);

//      1. Each word distinct in list.
//      2. Each distinct word has distinct alphabets.
        List<String>dl= ll.stream()
                // Step 1: Remove duplicate words.
                .distinct()
                // Step 2: Remove duplicate characters from each word.
                .map(e->{
                    return e.chars()                // Stream of int (Unicode code points).
                            .distinct()             // Removes duplicate int values.
                            .mapToObj(c->String.valueOf((char)c))       // Typecast each unicode(int) value to char and converts char to string.
                            .collect(Collectors.joining());             // Joins the string-characters correctly.
                })
                // Step 3: Collect the final result into a list.
                .collect(Collectors.toList());

        System.out.println(dl);


    }
}
