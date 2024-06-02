package dev.aniket.SpringSecurityExample2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String home() {
        return "<body>\n" +
                "<h1 style=\"color: blue; font-size: 24px; text-align: center;\">Hello userz</h1>" +
                "<h2> Hit this urls </h2>" +
                "<a href=\"http://localhost:8080/web/hello\">http://localhost:8080/web/hello</a><br>" +
                "<a href=\"http://localhost:8080/web/about\">http://localhost:8080/web/about</a>" +
                "</body>";
    }
}
