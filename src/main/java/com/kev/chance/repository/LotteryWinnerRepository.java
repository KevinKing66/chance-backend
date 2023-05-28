package com.kev.chance.repository;

import com.kev.chance.model.LotteryWinner;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kevin
 */
public interface LotteryWinnerRepository extends JpaRepository<LotteryWinner, String> {
    List<LotteryWinner> findAllByLotteryCode(String lotteryCode);
}
