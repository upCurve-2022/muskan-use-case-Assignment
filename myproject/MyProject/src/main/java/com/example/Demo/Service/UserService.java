package com.example.Demo.Service;

import com.example.Demo.Controller.User;
import com.example.Demo.Exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> findAll();



    ResponseEntity<User> findById(@PathVariable(value = "id") long userId)
            throws ResourceNotFoundException;

    User save(User user);


    Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException;
}

