package com.mba.learning.controller;

import com.mba.learning.entity.po.User;
import com.mba.learning.entity.vo.LoginRequest;
import com.mba.learning.entity.vo.Result;
import com.mba.learning.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public Result<User> login(@RequestBody LoginRequest loginRequest) {
        User user = userService.login(loginRequest.getUsername(), loginRequest.getPassword());
        if (user != null) {
            return Result.success(user);
        }else {
            return Result.error("Invalid username or password");
        }
    }
}
