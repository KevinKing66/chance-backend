package com.kev.chance.service;

import com.kev.chance.dto.InvoiceAndChancesDto;
import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.model.Chance;
import com.kev.chance.model.Invoice;
import com.kev.chance.repository.ChanceRepository;
import com.kev.chance.repository.InvoiceRepository;
import com.kev.chance.util.helper.DateHelper;
import com.kev.chance.util.helper.ObjectHelper;
import jakarta.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;
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
        invoice =  mainRepository.save(invoice);
        long invoiceId = invoice.getId();
        System.out.println("ID DE INVOICE: " + invoiceId);
        chances.parallelStream().forEach((Chance e) -> e.setInvoiceId(invoiceId));
        System.out.println("Lista de invoice");
        chances.parallelStream().forEach((Chance e) -> System.out.println(e.getInvoiceId()));
        chanceRepository.saveAll(chances);
    }

    @Override
    public void saveInvoicesAndChances(List<InvoiceWithChancesDto> dtos) {
        dtos.stream().forEach(dto -> saveInvoiceAndChance(dto));
    }

    @Override
    public InvoiceAndChancesDto syncInvoicesAndChances(List<InvoiceWithChancesDto> dtos) {
        dtos.stream().forEach(dto -> saveInvoiceAndChance(dto));

        Timestamp startDateTime = new Timestamp(DateHelper.getStartOfCurrentWeekEpoch());
        Timestamp endDateTime = new Timestamp(DateHelper.getEndOfCurrentWeekEpoch());

        List<Invoice> invoices = mainRepository.findByCreationDateTimeBetween(startDateTime, endDateTime);
        List<Long> ids = invoices.stream().map(Invoice::getId).collect(Collectors.toList());
        List<Chance> chances = chanceRepository.findByInvoiceIdIn(ids);
        System.out.println("Chances encontrados: " + chances.size());
        return new InvoiceAndChancesDto(invoices, chances);
    }

    @Override
    public void saveInvoiceAndChance(InvoiceWithChancesDto invoiceWithChance) {
        saveInvoiceAndChance(invoiceWithChance.getInvoice(), invoiceWithChance.getChances());
        System.out.println("DTO: " + ObjectHelper.objToString(invoiceWithChance));
    }

}
