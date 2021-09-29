package com.etisalat.subscription.controller;


import com.etisalat.subscription.DTO.UserDTO;
import com.etisalat.subscription.model.User;
import com.etisalat.subscription.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/user") // if all below services should be under specific ..
public class UserController {
    public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @PostMapping( "/createUser")
    public void create(@RequestBody UserDTO userDTO){
        userService.create(userDTO);
       // redirect page to Home
    }


    @PutMapping( "/updateUser")
    public void update(@RequestBody UserDTO userDTO){
        userService.update(userDTO);
        // redirect page Home
    }

    @DeleteMapping("/deleteUser/{user_id}")
    public void delete(@PathVariable("user_id") long user_id){
        userService.delete(user_id);
        // redirect page Home
    }


    @GetMapping("/user")
    public void get(@RequestParam(name = "user_id",required = true) long user_id){
        User user =  userService.read(user_id);
        // redirect to user page or build syllabus
        LOGGER.info(user.toString());
    }

}
