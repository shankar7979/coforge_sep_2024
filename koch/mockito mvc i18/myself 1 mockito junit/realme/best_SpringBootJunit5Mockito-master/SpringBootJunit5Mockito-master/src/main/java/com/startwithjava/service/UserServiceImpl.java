package com.startwithjava.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.startwithjava.dto.User;
import com.startwithjava.dao.UserDao;
import com.startwithjava.service.dto.UserDto;
import com.startwithjava.translator.BaseTranslator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImpl implements  UserService {
    private UserDao userDao;
    private BaseTranslator<User,UserDto> userDtoTranslator;
    public List<UserDto> findAll(){
       return userDao.findAll();
    }

    @Override
    public long create(UserDto user) {
        return userDao.create(user);
    }

    @Override
    public Optional<UserDto> findById(long userId) {
        return userDao.findById(userId);
    }
}
