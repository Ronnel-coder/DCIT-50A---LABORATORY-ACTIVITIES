/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teacherstudentassignment;

/**
 *
 * @author Admin
 */
class Person {
    String name, gender;
    int age;
    
    
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        
        
    }
    
    void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
    }
    
}

class Student extends Person {
    String studentId;
    
    
    Student(String name, int age, String gender, String studentId) {
        super(name, age, gender);
        this.studentId = studentId;
        
    }
    
    void displayStudent() {
        System.out.println("\n========Student Information========");
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher extends Person {
    String department;
    Course[] c;
    
    Teacher(String name, int age, String gender, String department, Course[] c) {
        super(name, age, gender);
        this.department = department;
        this.c = c;
        
    }
     
    void displayTeacher() {
        System.out.println("\n========Teacher Information========");
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Courses Handled:");
        for (Course courses : c) {
        courses.displayCourse();
        
        }
    }
}

class Course {
    String courseCode;
    String courseName;
    
    
    Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName= courseName;
        
    }
    
    void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
       
    }

}