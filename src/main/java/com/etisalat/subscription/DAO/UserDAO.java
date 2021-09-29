package com.etisalat.subscription.DAO;

import com.etisalat.subscription.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
