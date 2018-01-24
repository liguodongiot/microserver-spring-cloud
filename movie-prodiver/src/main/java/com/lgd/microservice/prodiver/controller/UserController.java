package com.lgd.microservice.prodiver.controller;

import com.lgd.microservice.prodiver.dao.UserRepository;
import com.lgd.microservice.prodiver.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 *
 * @author: liguodong
 * @datetime: 2018/1/23 23:57
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findOne(id);
    }

}
