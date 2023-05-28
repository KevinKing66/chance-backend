package com.kev.chance.service;

import com.kev.chance.model.Chance;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface ChanceServiceInterface {

    Chance findOne(long id);

    List<Chance> findAll();

    List<Chance> findAllByInvoiceId(long invoiceId);

    Chance save(Chance E);
}
