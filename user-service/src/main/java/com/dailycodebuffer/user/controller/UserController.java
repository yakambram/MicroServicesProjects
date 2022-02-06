package com.dailycodebuffer.user.controller;

import com.dailycodebuffer.user.UserService;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUser method.");
        return userService.saveUser(user);
    }

    @GetMapping(("/{id}"))
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }
}
