package com.singh.giflib.data;

import com.singh.giflib.model.Student;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StudentRepository {
    private static final List<Student> All_STUDENTS = Arrays.asList(
            new Student(1, "Jeff Ryke"),
            new Student(2, "Anna Nemo"),
            new Student(3, "Ricky Velo"),
            new Student(4, "Preeti Singh")
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
