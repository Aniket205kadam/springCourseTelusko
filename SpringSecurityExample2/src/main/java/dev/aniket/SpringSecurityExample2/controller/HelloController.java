package dev.aniket.SpringSecurityExample2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class HelloController {

    @GetMapping("/hello")
    public String greet(HttpServletRequest request) {
        return "<h1 style=\"color: blue; font-size: 24px; text-align: center;\">Hello users..!</h1><br><h2>Session ID ->  "+ request.getSession().getId() + "</h2>";
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request) {
        return "<h1 style=\"color: blue; font-size: 24px; text-align: center;\">Java Learner</h1><br><h2>Session ID ->  "+ request.getSession().getId() + " </h2>";
    }
}
