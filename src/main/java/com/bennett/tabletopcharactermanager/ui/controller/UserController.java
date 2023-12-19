package com.bennett.tabletopcharactermanager.ui.controller;

import com.bennett.tabletopcharactermanager.shared.dto.UserDto;
import com.bennett.tabletopcharactermanager.ui.model.request.UserDetailsRequestModel;
import com.bennett.tabletopcharactermanager.ui.model.response.UserDetailsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @GetMapping
    public String getUser() {
        return "getUser was called";
    }
    @PostMapping
    public UserDetailsResponseModel createUser(@RequestBody UserDetailsRequestModel userDetailsRequestModel) {

        UserDetailsResponseModel returnValue = new UserDetailsResponseModel();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetailsRequestModel, userDto);

        BeanUtils.copyProperties(userDto, returnValue);


        return returnValue;
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
