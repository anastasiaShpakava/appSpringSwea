package com.example.webAp.repos;

import com.example.webAp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository <User, Long> {
    User findByUsername (String username);
}
