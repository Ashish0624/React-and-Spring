package com.myworkspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myworkspace.models.User;
import com.myworkspace.repository.UserRepository;

@SpringBootApplication
public class ReactAndSpringApplication {

	@Autowired
    private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ReactAndSpringApplication.class, args);
	}

}
