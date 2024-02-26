package com.unitseven.springboot.Service;

import com.unitseven.springboot.Entity.user;
import com.unitseven.springboot.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class usersService {
    @Autowired
    private usersRepository userRepository;

    public user saveUser(user user) {
        return userRepository.save(user);
    }

    public Optional<user> getUserById(int userId) {
        return userRepository.findById(userId);
    }

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}

