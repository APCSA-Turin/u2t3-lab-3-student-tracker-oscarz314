package com.example.project;
public class StudentRunner{
    public static void main(String[] args) {
        //use this StudentRunner class if you need to test your code 
        Student stu1 = new Student("John", "willams", 2009);
        stu1.addTestScore(23);
        stu1.addTestScore(14);
        stu1.printStudentInfo();
    }
}