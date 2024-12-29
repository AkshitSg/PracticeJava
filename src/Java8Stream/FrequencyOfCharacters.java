package Java8Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String inputString="java code is running";
        String trimmedInput=inputString.replaceAll("\\s","");
        System.out.println(trimmedInput);
        Map<Character,Long> frequencyMap=trimmedInput
                .chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequencyMap);
    }
}


