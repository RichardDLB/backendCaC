package com.example.trenAlSur.service;

import com.example.trenAlSur.dto.UserDto;
import com.example.trenAlSur.model.User;
import com.example.trenAlSur.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public User createUser (User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers (){
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Integer id) {
        return userRepository.findById(id);
    }

    public void deleteUserById(Integer id){
        userRepository.deleteById(id);
    }



}
