package com.zeyuan.cloud.microservicesimpleconsumermovie.controller;

import com.zeyuan.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by weiwei on 2017/6/6.
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id)
    {
        System.out.println("enter movie service");
        return this.restTemplate.getForEntity("http://localhost:7900/simple/" + id, User.class);
    }
}
