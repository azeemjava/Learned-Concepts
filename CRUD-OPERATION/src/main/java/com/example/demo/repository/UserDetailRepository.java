package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail, Integer> {

}
