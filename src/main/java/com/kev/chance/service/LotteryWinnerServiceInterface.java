package com.kev.chance.service;

import com.kev.chance.model.LotteryWinner;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface LotteryWinnerServiceInterface {

    List<LotteryWinner> findLastWinnerByCode(String code);

}
