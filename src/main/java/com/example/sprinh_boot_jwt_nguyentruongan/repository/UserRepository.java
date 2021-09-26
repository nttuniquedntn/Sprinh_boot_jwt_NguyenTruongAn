package com.example.sprinh_boot_jwt_nguyentruongan.repository;


import com.example.sprinh_boot_jwt_nguyentruongan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}