package dev.aniket.JwtProject.controller;

import dev.aniket.JwtProject.model.User;
import dev.aniket.JwtProject.service.JwtService;
import dev.aniket.JwtProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserService service;
    @PostMapping("register")
    public User register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
//        System.out.println(user.getPassword());
        return service.saveUser(user);
    }

    @PostMapping("login")
    public String login(@RequestBody User user) {
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
            if (authentication.isAuthenticated())
                return jwtService.generateToken(user.getUsername());
        } catch (AuthenticationException e) {
            return e.getMessage();
        }
        return "Failed";
    }
}
