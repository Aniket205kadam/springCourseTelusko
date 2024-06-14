package dev.aniket.JwtProject.controller;



import dev.aniket.JwtProject.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/model/")
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Rohan", "Java"),
            new Student(2, "Rohit", "Php"),
            new Student(3, "Suresh", "C#")
    ));

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Added..!";
    }
}
