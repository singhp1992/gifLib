package com.singh.giflib.data;

import com.singh.giflib.model.Student;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StudentRepository {
    private static final List<Student> All_STUDENTS = Arrays.asList(
            new Student(1, "PERSON 1"),
            new Student(2, "PERSON 2"),
            new Student(3, "PERSON 3")
            );

    public List<Student> getAllStudents() {
        return All_STUDENTS;
    }

    public  Student findById(int id) {
        for(Student student : All_STUDENTS) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
