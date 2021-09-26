package com.example.sprinh_boot_jwt_nguyentruongan.controller;


import com.example.sprinh_boot_jwt_nguyentruongan.entity.User;
import com.example.sprinh_boot_jwt_nguyentruongan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//auth
@RestController
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

        return userService.createUser(user);
    }

}