package com.example.sprinh_boot_jwt_nguyentruongan.service;


import com.example.sprinh_boot_jwt_nguyentruongan.entity.User;
import com.example.sprinh_boot_jwt_nguyentruongan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//iml
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}