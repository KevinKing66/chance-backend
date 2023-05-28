package com.kev.chance.repository;

import com.kev.chance.model.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kevin
 */
public interface LotteryRepository extends JpaRepository<Lottery, String> {

}
