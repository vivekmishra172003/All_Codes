package com.dealsapp.user.service;

import com.dealsapp.user.dto.*;
import com.dealsapp.user.entity.User;

public interface UserService {
    String registerUser(RegisterRequest request);
    LoginResponse loginUser(LoginRequest request);
    UserDto getUserById(Long id);
    User validateUser(Long userId);
}