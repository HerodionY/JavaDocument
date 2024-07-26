/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author ACER
 */
public class Student implements Learner {
 protected final static int NUM_OF_TESTS = 3;
 protected String name;
 protected int test1,test2,test3,grade;
 protected String courseGrade;
 public Student( ) {
 
 }
 public Student(String studentName) {
 name = studentName;


 }

 

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
 public int Grade(int test1,int test2,int test3) {
        int total=test1+test2+test3;
        return total;
        
    }

   

    public void setName(String name) {
        this.name = name;
    }

    void setCourseGrade(int grade){}

    public static int getNUM_OF_TESTS() {
        return NUM_OF_TESTS;
    }

    

    public int getTest3() {
        return test3;
    }

    public int getTest2() {
        return test2;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public String getName() {
        return name;
    }

 
 @Override
 public String getCourseGrade() {
 return courseGrade;
 }
}

