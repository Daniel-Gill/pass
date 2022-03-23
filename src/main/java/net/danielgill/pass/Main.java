package net.danielgill.pass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bob", 6267582);
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent(s);
        
        Student s2 = registry.getStudentById(6267582);
        System.out.println(s2.getName());

        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);
    }
}
