package com.kev.chance.service;

import com.kev.chance.dto.LoginDto;
import com.kev.chance.model.User;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Kevin
 */
public interface UserServiceInterface {

    User findUserByEmail(String entity);

    List<User> findAll();

    User findUserByEmailOrDoc(LoginDto entity);

    List<User> syncUp(List<User> user);

    void createUser(User entity);
}
