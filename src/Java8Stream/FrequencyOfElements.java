package Java8Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> arrayList= Arrays.asList("Aen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> resultList=arrayList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(resultList);

    }
}
