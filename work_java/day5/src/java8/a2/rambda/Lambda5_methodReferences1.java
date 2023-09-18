package java8.a2.rambda;

import java.util.List;
import java.util.ArrayList;

public class Lambda5_methodReferences1 {
   public static void main(String args[]){
      List names = new ArrayList();
		
      names.add("Mahesh");
      names.add("Suresh");
      names.add("Ramesh");
      names.add("Naresh");
      names.add("Kalpesh");
		
      names.forEach(System.out::println);
   }
}