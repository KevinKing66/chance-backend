package com.kev.chance.service;

import com.kev.chance.model.User;
import java.util.Optional;

/**
 *
 * @author Kevin
 */
public interface UserServiceInterface {

    User findUserByEmail(String entity);

    Object login(User entity);

    void createUser(User entity);
}
