package net.danielgill.pass;

import java.util.ArrayList;

public class StudentRegistry {
    private ArrayList<Student> students;
    
    public StudentRegistry() {
        students = new ArrayList<>();
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
    
    public Student getStudentById(int id) {
        for(int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }
}
