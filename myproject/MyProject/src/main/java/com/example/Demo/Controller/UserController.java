package com.example.Demo.Controller;

import com.example.Demo.Exception.ResourceNotFoundException;
import com.example.Demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


    @RestController
    @RequestMapping("/api/v1/")
    public class UserController {

        @Autowired
        private UserService userService;

        public UserController(UserService userService){
            super();
            this.userService = userService;
        }

        // get users

        @GetMapping("users")
        public List<User> getAllUser(){
            return this.userService.findAll();
        }

        // get user by id
        @GetMapping("/users/{id}")
        public ResponseEntity<ResponseEntity<User>> getUserById(@PathVariable(value = "id") long userId)
                throws ResourceNotFoundException {
            ResponseEntity<User> user = userService.findById(userId);

            return ResponseEntity.ok().body(user);
        }
        // save user
        @PostMapping("users")
        public User createUser(@RequestBody User user){
            return this.userService.save(user);
        }

        // update user

        // delete user

        @DeleteMapping("users/{id}")
        public Map<String, Boolean> deleteUser(@PathVariable(value = "id") long userId) throws ResourceNotFoundException {
            ResponseEntity<User> user = userService.findById(userId);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);
            return response;

        }


}
