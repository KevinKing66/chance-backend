package com.kev.chance.repository;

import com.kev.chance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kevin
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
