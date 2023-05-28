package com.kev.chance.repository;

import com.kev.chance.model.Invoice;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kevin
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Override
    Invoice save(Invoice entity);

    @Override
    List<Invoice> findAll();

}
