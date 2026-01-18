/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teacherstudentassignment;

/**
 *
 * @author Admin
 */
public class TeacherStudentAssignment {
    public static void main(String[] args){
    
    
    Student std1 = new Student("Anna Santos", 19, "Female", "S1023");
   
    
    Course c1 = new Course("    DCIT 24A", "Object Oriented Programming");
    Course c2 = new Course("    DCIT 26A", "Object Oriented Programming 2");
    
    Course[] TeacherCourse = {c1, c2};
    Teacher teach1 = new Teacher("Mr. Dela Cruz", 45, "male", "Computer Studies", TeacherCourse);
    
    
    
    std1.displayStudent();
    teach1.displayTeacher();
    
    System.out.println();
    c1.displayCourse();
    
    
    
    
    
    }
}

