package com.kev.chance.service;

import com.kev.chance.model.LotteryWinner;
import com.kev.chance.repository.LotteryRepository;
import com.kev.chance.repository.LotteryWinnerRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Transactional
@Service
public class LotteryWinnerService implements LotteryWinnerServiceInterface {

    @Autowired
    LotteryWinnerRepository repo;

    @Override
    public List<LotteryWinner> findLastesWinners() {
        Sort sort = Sort.by(
                Sort.Order.desc("date"),
                Sort.Order.asc("digits"));
        return repo.findAll(sort);
    }

    @Override
    public List<LotteryWinner> findLastestWinnersByLotteryCode(String code) {
        return repo.findAllByLotteryCode(code);
    }

    public void save(LotteryWinner entity) {
        repo.save(entity);
    }

}
