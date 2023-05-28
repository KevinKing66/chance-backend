package com.kev.chance.repository;

import com.kev.chance.model.Chance;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kevin
 */
public interface ChanceRepository extends JpaRepository<Chance, Long> {

    List<Chance> findAllByInvoiceId(long uuid);

    @Override
    Chance save(Chance entity);
}
