package com.singh.giflib.controller;

import com.singh.giflib.data.PersonRepository;
import com.singh.giflib.data.StudentRepository;
import com.singh.giflib.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PersonRepository gifRepository;

    @RequestMapping("/students")
    public String listCategories(Model model) {
        List<Student> students = studentRepository.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

}
