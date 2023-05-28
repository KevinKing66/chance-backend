package com.kev.chance.service;

import com.kev.chance.model.Invoice;
import com.kev.chance.repository.ChanceRepository;
import com.kev.chance.repository.InvoiceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Transactional
@Service
public class InvoiceService implements InvoiceServiceInterface {

    @Autowired
    InvoiceRepository mainRepository;

    @Override
    public Invoice findOne(long id) {
        return mainRepository.findById(id).orElseThrow();
    }

}
