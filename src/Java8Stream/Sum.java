package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sum {

    public static void sumByreduce(List<Product> productList){
        float total=productList.stream()
                .map((product)->{return product.price;}) // get the prices of each element in stream.
                .reduce(0.0f,(sum,price)->sum+price); // performs sum=sum+price with each element of stream. init sum=0.
//              .reduce(0.0f,Float::sum);    accumulating price, by referring method of Float class
        System.out.println("Sum by reduce():"+total);
    };
    public static void sumBycollectors(List<Product> productList){
        double total=productList.stream()
                .collect(Collectors.summingDouble((product)->product.price));
    };

    public static void main(String[] args){
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(1,"Laptop",70000));
        productList.add(new Product(2,"Mobile",20000));
        productList.add(new Product(3,"TV",30000));
        productList.add(new Product(4,"Microwave",10000));

        Sum.sumByreduce(productList);
        Sum.sumBycollectors(productList);
    }
}
