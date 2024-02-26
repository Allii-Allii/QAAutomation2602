package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents(){
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());

            if (student instanceof HighSchoolStudent) {
                System.out.println("Grade: " + ((HighSchoolStudent) student).getGrade());
            } else if (student instanceof UniversityStudent) {
                System.out.println("Major: " + ((UniversityStudent) student).getMajor());
            }

        }
    }
    // searchStudentByName(String name) - da tyrsi po ime student i da go printira info za syotwetniq student. samo za nego


}
