package com.blog.blogapp.services;

import com.blog.blogapp.dto.RegisterationDto;
import com.blog.blogapp.entities.User;

public interface UserService {
    void saveUser(RegisterationDto registerationDto);

    User findByEmail(String email);
}
