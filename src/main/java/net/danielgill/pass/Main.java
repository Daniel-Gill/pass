package net.danielgill.pass;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bob", 6267582);
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent(s);
        
        Student s2 = registry.getStudentById(6267582);
        System.out.println(s2.getName());
    }
}
