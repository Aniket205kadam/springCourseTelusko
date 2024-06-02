package dev.aniket.SpringSecurityExample2.whatCsrf;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class GetInfoController {

    @PostMapping("storedData")
    public String storedData(String name) {
        System.out.println(name);
        return "Send data successfully..!";
    }
}
