package com.HandmadeI.HandmadeI.Service;

import com.HandmadeI.HandmadeI.Dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String addUser(UserDTO userDTO);

}
