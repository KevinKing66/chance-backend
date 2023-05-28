package com.kev.chance.service;

import com.kev.chance.model.LotteryWinner;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface LotteryWinnerServiceInterface {

    List<LotteryWinner> findLastesWinners();

    List<LotteryWinner> findLastestWinnersByLotteryCode(String code);

    void save(LotteryWinner entity);
}
