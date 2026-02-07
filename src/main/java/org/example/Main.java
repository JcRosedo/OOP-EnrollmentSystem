package org.example;

import org.example.Course;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentID(000123);
        s.setStudentName("John Doe");
        s.setProgram("Information Technology \n");

        Student s1= new Student();

        s1.setStudentID(000124);
        s1.setStudentName("Jane Doe");
        s1.setProgram("Information Technology \n");

        System.out.println(s.getStudentID());
        System.out.println(s.getStudentName());
        System.out.println(s.getProgram());


        Course c = new Course();
        c.setCourseID(00001);
        c.setCourseName("Integrative Programming");
        c.setProgram("Information Technology \n");

        s.display();
        s1.display();
        c.display();

    }
}