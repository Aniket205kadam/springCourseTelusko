package dev.aniket.JwtProject.dao;

import dev.aniket.JwtProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
