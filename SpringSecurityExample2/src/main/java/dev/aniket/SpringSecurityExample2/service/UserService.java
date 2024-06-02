package dev.aniket.SpringSecurityExample2.service;

import dev.aniket.SpringSecurityExample2.dao.UserRepo;
import dev.aniket.SpringSecurityExample2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    public User saveUser(User user) {
        return repo.save(user);
    }
}
