package com.bosch.example.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.bosch.example.model.User;
import com.bosch.example.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    @Autowired
    UserService repo;

    @GetMapping("/country/{country}")
    public List<User> getByCountry(@PathVariable String country) {
        return repo.findByCountry(country);
    }

    @GetMapping("/username/{username}")
    public List<User> getLikeUsername(@PathVariable String username) {
        return repo.findByUsername(username);
    }
    
    @PostMapping("/user")
    public String postMethodName(@RequestBody User user) {
        repo.save(user);
        return "Usuário salvo com sucesso";
    }
}
