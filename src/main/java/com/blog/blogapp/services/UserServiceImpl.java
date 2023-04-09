package com.blog.blogapp.services;

import com.blog.blogapp.dto.RegisterationDto;
import com.blog.blogapp.entities.Role;
import com.blog.blogapp.entities.User;
import com.blog.blogapp.repository.RoleRepository;
import com.blog.blogapp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(RegisterationDto registerationDto) {
        User user = new User();
        user.setName(registerationDto.getFirstName() + " " + registerationDto.getLastName());
        user.setEmail(registerationDto.getEmail());
        // use spring security to encrypt the password
        user.setPassword(registerationDto.getPassword());
        Role role = roleRepository.findByName("ROLE_GUEST");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {

        return userRepository.findByEmail(email);
    }

}
