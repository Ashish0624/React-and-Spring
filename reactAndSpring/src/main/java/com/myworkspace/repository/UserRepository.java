package com.myworkspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myworkspace.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
