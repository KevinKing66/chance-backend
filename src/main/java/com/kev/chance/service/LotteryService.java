package com.kev.chance.service;

import com.kev.chance.model.Lottery;
import com.kev.chance.repository.LotteryRepository;
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
public class LotteryService implements LotteryServiceInterface {

    @Autowired
    LotteryRepository repo;

    @Override
    public List<Lottery> findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name");
        return repo.findAll(sort);
    }

    @Override
    public Lottery save(Lottery e) {
        return repo.save(e);
    }

}
