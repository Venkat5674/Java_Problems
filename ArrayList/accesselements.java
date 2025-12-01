import java.util.*;

public class Main {
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Red");
      list.add("Blue");
      list.add("Green");

      System.out.println(list.get(0));  // first item
      System.out.println(list.get(list.size() - 1)); // last item
    }
}
