package org.designPatterns.c29_Data_Access_Object;

/**
 * @author Chen Hao
 * @date 2024/7/17 23:18
 */
import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}