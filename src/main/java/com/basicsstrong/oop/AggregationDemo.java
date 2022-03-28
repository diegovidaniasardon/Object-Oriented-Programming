package com.basicsstrong.oop;

import java.util.ArrayList;
import java.util.List;

class College{
    String name;
    private List<Teacher> teacher;


    public College(String name, List<Teacher> teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }
}
class Teacher{
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString(){
        return "Teacher: " + name + " , Subject : " +  subject ;
    }
}
// Example of Association
public class AggregationDemo {

    public static void main( String[] args ){
        List<Teacher> teacher = new ArrayList<Teacher>();
        teacher.add(new Teacher("Diego","Java"));
        teacher.add(new Teacher("Luis","Python"));

        College college = new College("MyCollege", teacher);
    }
}
