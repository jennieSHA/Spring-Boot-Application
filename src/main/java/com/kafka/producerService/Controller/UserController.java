package com.kafka.producerService.Controller;

import com.kafka.producerService.Entity.User;
import com.kafka.producerService.Service.IUserService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService iUserService;
    @PostMapping("register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(iUserService.registerUser(user));
    }
    @GetMapping("/getAllUsers")
    public List<User> getAllCustomers(){
        return iUserService.getAllUser();
    }

}
