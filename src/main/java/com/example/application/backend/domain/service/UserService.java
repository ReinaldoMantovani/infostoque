package com.example.application.backend.domain.service;

import com.example.application.backend.domain.User;
import com.example.application.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDto save(UserDto userDto);
    List<UserDto> getAllUser();
    Optional<UserDto> getUserById(Long id);
    UserDto updateUser(UserDto userDto);
    void deleteUser(UserDto userDto, Long id);
}
