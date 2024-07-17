package org.designPatterns.c26_MVC;

/**
 * @author Chen Hao
 * @date 2024/7/17 22:51
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
