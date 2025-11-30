import java.util.*;

class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,30,20,40,30));

        ArrayList<Integer> unique = new ArrayList<>();

        for(Integer n : list){
            if(!unique.contains(n)){
                unique.add(n);
            }
        }

        System.out.println("Original List: " + list);
        System.out.println("After removing duplicates: " + unique);
    }
}
}
