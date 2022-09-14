package com.allstate.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allstate.rest.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
