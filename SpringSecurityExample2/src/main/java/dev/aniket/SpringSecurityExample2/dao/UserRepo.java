package dev.aniket.SpringSecurityExample2.dao;

import dev.aniket.SpringSecurityExample2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
