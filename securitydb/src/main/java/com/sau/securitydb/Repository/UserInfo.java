package com.sau.securitydb.Repository;

import com.sau.securitydb.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfo extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
