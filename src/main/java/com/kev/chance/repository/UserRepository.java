package com.kev.chance.repository;

import com.kev.chance.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Kevin
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByNumDoc(String doc);
    @Query( "select u from users u where u.id in :ids" )
    List<User> findByIds(@Param("ids") List<Long> inventoryIdList);
    List<User> findByIdNotIn(List<Long> ids);
}
