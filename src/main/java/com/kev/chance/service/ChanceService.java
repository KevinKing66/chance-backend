package com.kev.chance.service;

import com.kev.chance.model.Chance;
import com.kev.chance.repository.ChanceRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Transactional
@Service
public class ChanceService implements ChanceServiceInterface {

    @Autowired
    ChanceRepository repository;

    @Override
    public Chance findOne(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Chance> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Chance> findAllByInvoiceId(long invoiceId) {
        return repository.findAllByInvoiceId(invoiceId);
    }

    @Override
    public Chance save(Chance E) {
        return repository.save(E);
    }

}
