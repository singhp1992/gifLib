package com.singh.giflib.data;

import com.singh.giflib.model.Person;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PersonRepository {
    private static final List<Person> ALL_PERSONS = Arrays.asList(
            new Person("android-explosion", 1, "Chris Ramacciotti"),
            new Person("ben-and-mike", 2, "Ben Jakuben"),
            new Person("book-dominos", 3,"Craig Dennis"),
            new Person("compiler-bot", 4, "Ada Lovelace"),
            new Person("cowboy-coder", 5, "Grace Hopper"),
            new Person("infinite-andrew", 6,"Marissa Mayer")
    );

    public Person findByName(String name) {
        for(Person person : ALL_PERSONS) {
            if(person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getAllPersons() {
        return ALL_PERSONS;
    }

    public List<Person> findByCategoryId(int id) {
        List<Person> persons = new ArrayList<>();
        for(Person person : ALL_PERSONS) {
            if(person.getStudentId() == id) {
                persons.add(person);
            }
        }
        return persons;
    }
}
