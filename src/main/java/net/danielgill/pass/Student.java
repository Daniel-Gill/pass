package net.danielgill.pass;

public class Student {
    private String name;
    private int studentId;
    
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}