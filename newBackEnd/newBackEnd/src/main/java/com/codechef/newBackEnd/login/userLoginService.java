package com.codechef.newBackEnd.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userLoginService {
    @Autowired
    private final userLoginRepository userloginRepository;

    @Autowired
    public userLoginService(userLoginRepository userloginRepository) {
        this.userloginRepository = userloginRepository;
    }

    //List All users in the db
    public List<userLogin> getuserLogin(){
        return userloginRepository.findAll();
    }
    //List Only users with Id= user
    public Optional<userLogin> getuser(){
        return userloginRepository.findById("user");
    }

    public userLogin login(String username, String password) {
        userLogin user = userloginRepository.findByUSERNAMEAndPASSWORD(username, password);
        if (user == null) {
            throw new CustomLoginException("Invalid username or password.");
        }
        return user;
    }
}