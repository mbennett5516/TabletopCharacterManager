package com.bennett.TabletopCharacterManager.io.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @GetMapping
    public String getUser() {
        return "getUser was called";
    }
    @PostMapping
    public String createUser() {
        return "createUser was called";
    }
    @PutMapping
    public String updateUser() {
        return "updateUser was called";
    }
    @DeleteMapping
    public String deleteUser() {
        return "deleteUser was called";
    }
}
