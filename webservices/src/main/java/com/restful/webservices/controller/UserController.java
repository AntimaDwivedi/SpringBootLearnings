package com.restful.webservices.controller;

import com.restful.webservices.exception.UserNotFoundException;
import com.restful.webservices.user.User;
import com.restful.webservices.user.UserDaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    private UserDaoService service;

    public UserController(UserDaoService service) {
        this.service = service;
    }
     @GetMapping("/users")
     public List<User> retrievedAllUsers() {
        return service.findAll();
     }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
       // return service.findOne(id);

        //If you want to return the right exception
        User user = service.findOne(id);
        if(user == null)
            throw new UserNotFoundException("id:" +id);
        return user;
    }

    //Post/users
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = service.save(user);
        //return ResponseEntity.created(null).build(); --> will return 201.
        // If you want to return location
         URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                 .path("/{id}")
                 .buildAndExpand(savedUser.getId())
                 .toUri();

         return ResponseEntity.created(location).build();

    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

}
