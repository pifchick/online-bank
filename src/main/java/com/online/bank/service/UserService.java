package com.online.bank.service;

import com.online.bank.entity.UserEntity;
import com.online.bank.exception.UserAlreadyExistException;
import com.online.bank.exception.UserNotFoundException;
import com.online.bank.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
        if (userRepo.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExistException("Пользователь с таким именем уже сущетсвует");
        }
       return userRepo.save(user);
    }

    public UserEntity getOne(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if(user == null){
            throw new UserNotFoundException("Пользователь не был найден");
        }
        return user;
    }
}
