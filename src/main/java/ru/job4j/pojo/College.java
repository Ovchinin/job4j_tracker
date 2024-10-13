package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Igor");
        student.setGroup("Informatics");
        student.setAdmissionDate("2024-10-13");

        System.out.println("Full Name: " + student.getFullName());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Admission Date: " + student.getAdmissionDate());
    }
}