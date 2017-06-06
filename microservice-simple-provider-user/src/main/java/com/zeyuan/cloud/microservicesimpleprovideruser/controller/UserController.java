package com.zeyuan.cloud.microservicesimpleprovideruser.controller;

import com.zeyuan.cloud.microservicesimpleprovideruser.entity.User;
import com.zeyuan.cloud.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by weiwei on 2017/6/5.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id)
    {
        System.out.println("enter findbyid");
         return userRepository.findOne(id);
    }
}
