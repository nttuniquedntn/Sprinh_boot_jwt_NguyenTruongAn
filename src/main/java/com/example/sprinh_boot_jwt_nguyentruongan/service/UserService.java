package com.example.sprinh_boot_jwt_nguyentruongan.service;



import com.example.sprinh_boot_jwt_nguyentruongan.entity.User;
import org.springframework.stereotype.Service;
//userservice
@Service
public interface UserService {
    User createUser(User user);
}