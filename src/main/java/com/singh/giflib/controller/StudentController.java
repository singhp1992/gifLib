package com.singh.giflib.controller;

import com.singh.giflib.data.GifRepository;
import com.singh.giflib.data.StudentRepository;
import com.singh.giflib.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/students")
    public String listCategories(Model model) {
        List<Student> students = studentRepository.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @RequestMapping("/students/{id}")
    public String student(@PathVariable int id, Model model) {
        Student student = studentRepository.findById(id);
        model.addAttribute("student", student);

//        List<Student> students = gifRepository.findByStudentId(id);
//        model.addAttribute("students", students);

        return "category";
    }
}
