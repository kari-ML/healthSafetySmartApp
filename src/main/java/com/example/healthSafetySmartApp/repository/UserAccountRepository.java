package com.example.healthSafetySmartApp.repository;

import com.example.healthSafetySmartApp.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    boolean existsByUsername(String username);
    UserAccount findByUsername(String username);
}
