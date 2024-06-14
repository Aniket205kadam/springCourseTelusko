package dev.aniket.JwtProject.service;

import dev.aniket.JwtProject.dao.UserRepo;
import dev.aniket.JwtProject.model.User;
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
