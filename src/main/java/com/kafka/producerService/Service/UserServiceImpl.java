package com.kafka.producerService.Service;

import com.kafka.producerService.Entity.User;
import com.kafka.producerService.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{
    private final UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User registerUser(User user) {
        return userRepo.save(user);

    }
}
