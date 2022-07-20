package com.example.healthSafetySmartApp.service;

import com.example.healthSafetySmartApp.entity.UserAccount;
import com.example.healthSafetySmartApp.repository.UserAccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserLoginService {

    private static Logger logger = LoggerFactory.getLogger(UserLoginService.class);

    @Autowired
    private UserAccountRepository userAccountRepository;

    public boolean loginUser(UserAccount user) {
        logger.info("Verifying login credentials");
        logger.info("USER: {}", user.getUsername());
        logger.info("PASSWORD: {}", user.getPassword());

        UserAccount getUser = userAccountRepository.findByUsername(user.getUsername());

        if(getUser != null) {
            return validateUserCredentials(user, getUser);
        }

        return false;
    }

    private boolean validateUserCredentials(UserAccount submittedAccount, UserAccount actualAccount) {
        if(actualAccount.getPassword().equalsIgnoreCase(submittedAccount.getPassword())) {
            return true;
        }
        return false;
    }
}
