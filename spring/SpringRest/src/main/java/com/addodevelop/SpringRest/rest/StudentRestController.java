package com.addodevelop.SpringRest.rest;

import com.addodevelop.SpringRest.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Poornima","Patel"));
        students.add(new Student("Max","Verstappen"));
        students.add(new Student("Lewis","Hamilton"));
    }

    // define end point for /students - return list of all students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    // define /students/{studentId}  - return student
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {
        if(studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student with ID: " + studentId + " does not exist");
        }
        return students.get(studentId);
    }
}
