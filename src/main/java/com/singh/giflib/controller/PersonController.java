package com.singh.giflib.controller;

import com.singh.giflib.data.PersonRepository;
import com.singh.giflib.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    public String listPersons(Model model) {
        List<Person> allPersons = personRepository.getAllPersons();
        model.addAttribute("persons", allPersons);
        return "home";
    }

    @RequestMapping("/person/{id}")
    public String student(@PathVariable int id, Model model) {
//        Student student = studentRepository.findById(id);
//        model.addAttribute("student", student);
//
//        List<Student> students = studentRepository.findById(id);
//        model.addAttribute("students", students);

        return "person";
    }

//    @RequestMapping("/person/{id}")
//    public String personDetails(@PathVariable String name, Model model) {
//        Person person = personRepository.findByName(name);
//        model.addAttribute("person", person);
//        return "person";
//    }
}
