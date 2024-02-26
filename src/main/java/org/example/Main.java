package org.example;

public class Main {
    public static void main(String[] args) {

        StudentManagementSystem system = new StudentManagementSystem();

        Student student1 = new HighSchoolStudent("Alice", 16, "Mat", 10);
        Student student2 = new UniversityStudent("Bob", 26, "Computer Sience", "QA Automation");
        system.addStudent(student1);
        system.addStudent(student2);
        system.displayAllStudents();
    }
}

// da nqma nevalidni stojnosti, w get i w set (moje da sa prjwat)
//