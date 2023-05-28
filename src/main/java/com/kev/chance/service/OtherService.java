package com.kev.chance.service;

import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.model.Chance;
import com.kev.chance.model.Invoice;
import com.kev.chance.repository.ChanceRepository;
import com.kev.chance.repository.InvoiceRepository;
import com.kev.chance.util.helper.ObjectHelper;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Service
@Transactional
public class OtherService implements OtherServiceInterface {

    @Autowired
    InvoiceRepository mainRepository;
    @Autowired
    ChanceRepository chanceRepository;

    @Override
    public void saveInvoiceAndChance(Invoice invoice, List<Chance> chances) {
        mainRepository.save(invoice);
        System.out.println(""+invoice);
        long invoiceId = invoice.getId();
        chances.parallelStream().forEach((Chance e) -> e.setInvoiceId(invoiceId));
        chances.parallelStream().forEach((Chance e) -> System.out.println(e.toString()));
        System.out.println("chances modificados");
        chanceRepository.saveAll(chances);
    }

    @Override
    public void saveInvoicesAndChances(List<InvoiceWithChancesDto> dtos) {
        dtos.stream().forEach(dto -> saveInvoiceAndChance(dto));
    }

    @Override
    public void saveInvoiceAndChance(InvoiceWithChancesDto invoiceWithChance) {
        saveInvoiceAndChance(invoiceWithChance.getInvoice(), invoiceWithChance.getChances());
        System.out.println("DTO: " + ObjectHelper.objToString(invoiceWithChance));
    }

}
