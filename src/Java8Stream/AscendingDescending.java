package Java8Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDescending {
    public static void main(String[] args) {
      List<Double> al= Arrays.asList(12.00, 14.00, 16.00, 42.89, 33.78, 71.85, 56.98, 21.12);

       al.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

       al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        double sum=al.stream().filter(a->a%2==0).mapToDouble(value -> value).sum();
        System.out.println(sum);

    }
}
