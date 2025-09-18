package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

class Student implements Comparable<Student> {
    String name;
    int englishMarks;
    int mathsMarks;

    public Student(String name, int englishMarks, int mathsMarks) {
        this.name = name;
        this.englishMarks = englishMarks;
        this.mathsMarks = mathsMarks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", englishMarks=" + englishMarks + ", mathsMarks=" + mathsMarks + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(englishMarks, mathsMarks, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return englishMarks == other.englishMarks &&
               mathsMarks == other.mathsMarks &&
               Objects.equals(name, other.name);
    }

    // Sorting by mathsMarks in descending order
    @Override
    public int compareTo(Student o) {
        System.out.println("compareTo method called");
        return -(this.mathsMarks - o.mathsMarks);
    }
}

public class Test3 {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();

        Student s1 = new Student("Mahesh", 30, 40);
        Student s2 = new Student("Bobby", 10, -10);
        Student s3 = new Student("Khan", -19, -100);

        list.add(s1);
        list.add(s3);
        list.add(s2);

        System.out.println("Before Sorting:");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list);

        System.out.println("----After Sorting-------");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
