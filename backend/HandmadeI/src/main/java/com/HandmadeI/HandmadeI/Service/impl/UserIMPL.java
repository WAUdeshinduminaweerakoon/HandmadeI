package com.HandmadeI.HandmadeI.Service.impl;

import com.HandmadeI.HandmadeI.Dto.UserDTO;
import com.HandmadeI.HandmadeI.Entity.User;
import com.HandmadeI.HandmadeI.Repo.UserRepo;
import com.HandmadeI.HandmadeI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@SuppressWarnings("ALL")
@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {
        User user = new User(

                userDTO.getUserid(),
                userDTO.getFullname(),
                userDTO.getUsername(),
                userDTO.getEmail(),

                this.passwordEncoder.encode(userDTO.getPassword())
        );
        userRepo.save(user);
        return user.getUsername();


    }
}
