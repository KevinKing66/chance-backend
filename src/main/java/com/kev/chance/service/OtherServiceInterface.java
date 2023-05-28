package com.kev.chance.service;

import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.model.Chance;
import com.kev.chance.model.Invoice;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface OtherServiceInterface {

    void saveInvoiceAndChance(Invoice invoice, List<Chance> chances);

    void saveInvoiceAndChance(InvoiceWithChancesDto invoiceWithChance);

    void saveInvoicesAndChances(List<InvoiceWithChancesDto> dtos);
}
