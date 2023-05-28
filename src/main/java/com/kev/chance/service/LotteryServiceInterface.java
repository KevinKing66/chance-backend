package com.kev.chance.service;

import com.kev.chance.model.Lottery;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface LotteryServiceInterface {

    List<Lottery> findAll();
}
