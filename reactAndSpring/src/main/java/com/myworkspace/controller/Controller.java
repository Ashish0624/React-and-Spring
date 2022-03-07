package com.myworkspace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myworkspace.models.User;
import com.myworkspace.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List < User > getUsers() throws Exception {
    	delete();
    	add();
        return this.userRepository.findAll();
    }
    
    public void add() throws Exception {
        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
    }
    public void delete() throws Exception{
    	this.userRepository.deleteAll();
    }
}
