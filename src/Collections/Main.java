package Collections;

import java.util.*;


class Student {
    int number;
    Student(int n) {
        number = n;
    }
}

public class Main {
    public static void main(String args[]) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(1));

        students.add(new Student(3));

        students.add(new Student(4));

        students.add(new Student(1));

        students.add(new Student(3));
        System.out.println(students.size());

    }

}