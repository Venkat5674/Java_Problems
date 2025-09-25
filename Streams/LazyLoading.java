package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Anantapur","Kadapa","Vizag","Vijayawada","Tirupathi");
        
        Predicate<String> p = str -> { 
            System.out.println("Predicate implementation");
            return str.startsWith("V");
        };
        
        Stream<String> stream = cities.stream().filter(p);
//      List<String> list = stream.toList();
        
        System.out.println("End of the program");
    }
}
