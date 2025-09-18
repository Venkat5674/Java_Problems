package list;

import java.util.Stack;

public class Test4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("Bhargav");
        stack.add("Rishi");
        stack.add("Sunil");
        stack.add("Rahul");
        stack.add(1, "Sunny");  // Insert at index 1

        System.out.println("Pop element: " + stack.pop()); // Removes last element

        System.out.println("Remaining elements (LIFO order):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Stack after popping all elements: " + stack);
    }
}
