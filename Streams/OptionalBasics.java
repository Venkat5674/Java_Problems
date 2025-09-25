package streams;

import java.util.Optional;

public class Test7 {
    public static void main(String[] args) {
        
        String s = findById(1);
        
//      if(s!=null) {
//          System.out.println(s.length());
//      }
//      else {
//          s = "Python";
//      }
        
        Optional<Object> optional = Optional.empty();
        System.out.println(optional);
        
        Optional<String> op = Optional.of("Java");
        System.out.println(op);
        
        Optional<Object> nullable = Optional.ofNullable("Java");
        System.out.println(nullable);
    }
    
    public static String findById(int id) {
        if(id % 2 == 0) {
            return "Java";
        } else {
            return null;
        }
    }
}
