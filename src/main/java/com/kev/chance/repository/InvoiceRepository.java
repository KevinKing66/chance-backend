package com.kev.chance.repository;

import com.kev.chance.model.Invoice;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Kevin
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Override
    Invoice save(Invoice entity);

    @Override
    List<Invoice> findAll();

    @Query(value = "SELECT * FROM invoices WHERE invoices.creation_date_time > ?1 AND  invoices.creation_date_time < ?2", nativeQuery = true)
    List<Invoice> findByCreationDateTimeBetween(Timestamp startOfWeek, Timestamp endOfWeek);

}
