package edu.pitt.flex.Service;

import org.springframework.http.ResponseEntity;

import edu.pitt.flex.DTO.LoginDTO;
import edu.pitt.flex.DTO.UserDTO;

public interface UserService {
    String addUser(UserDTO userDTO);
    public ResponseEntity<String> loginUser(LoginDTO loginDTO);
}
