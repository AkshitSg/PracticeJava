package Java8Stream;

import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    Product(int id, String name, float price){
        this.id=id;
        this.name=name;
        this.price=price;
    };
}

public class FilteringCollection {
    public static void main(String[] args){
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(1,"Laptop",60000));
        productList.add(new Product(1,"Mobile",50000));
        productList.add(new Product(1,"TV",70000));
        productList.add(new Product(1,"Microwave",10000));

        ArrayList<Product> products=(ArrayList<Product>)productList.stream()
                .filter((product)->{return product.price==50000;})
                .collect(Collectors.toList());
    }
}
