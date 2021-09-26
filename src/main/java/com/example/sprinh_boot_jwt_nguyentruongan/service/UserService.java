package com.example.sprinh_boot_jwt_nguyentruongan.service;



import com.example.sprinh_boot_jwt_nguyentruongan.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);
}