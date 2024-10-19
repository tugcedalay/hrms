package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
