package streams;

import java.util.Optional;

public class Test8 {
    public static void main(String[] args) {
        
        String s = findById(10);
        
        Optional<String> optional = Optional.ofNullable(s);
        
//      System.out.println(optional.isEmpty());
//      System.out.println(optional.isPresent());
        
//      if(optional.isPresent()) {
//          System.out.println(optional.get());
//      }
        
//      String data = optional.orElseThrow(() -> new ArithmeticException("Data is not present"));
//      System.out.println(data);
        
//      System.out.println(optional.orElse("Python"));
        
//      optional.ifPresent(str -> System.out.println(str.length()));
        
        Optional<String> map = optional.map(str -> new StringBuilder(str).reverse().toString());
        System.out.println(map);
        
        System.out.println("End of the prog");
    }
    
    public static String findById(int id) {
        if(id % 2 == 0) {
            return "Java";
        } else {
            return null;
        }
    }
}
