package com.example.trenAlSur.controller;

import com.example.trenAlSur.dto.UserDto;
import com.example.trenAlSur.model.User;
import com.example.trenAlSur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://127.0.0.1:5500"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return  userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers (){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        Optional<User> user = userService.findUserById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    private String deleteUserById(@PathVariable("id") Integer id)
    {
        userService.deleteUserById(id);
        return "Usuario borrado satisfactoriamente";
    }


}
