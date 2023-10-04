package java8.a4.stream;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class Stream1VsCollection {

    public static void main(String...args){
        List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");


        Stream<String> s = names.stream();
        s.forEach(System.out::println);
     }
}