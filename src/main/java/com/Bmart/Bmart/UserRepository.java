package com.Bmart.Bmart;

import com.Bmart.Bmart.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
