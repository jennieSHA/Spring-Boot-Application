package com.kafka.producerService.Service;

import com.kafka.producerService.Entity.User;

import java.util.List;


public interface IUserService {

    List<User> getAllUser();
    User registerUser(User user);
}
