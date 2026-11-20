package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    public List<User> usersList = new ArrayList<>();

    @PostMapping("/createUser")
    public void createUser(@RequestParam Long id, String name) {
        User user = new User(id, name);
        usersList.add(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam int id) {
        return usersList.get(id);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam int id) {
        usersList.remove(id);
    }
}
