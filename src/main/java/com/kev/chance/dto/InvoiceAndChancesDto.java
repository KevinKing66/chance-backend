package com.kev.chance.dto;

import com.kev.chance.model.Chance;
import com.kev.chance.model.Invoice;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceAndChancesDto {

    private List<Invoice> invoices;
    private List<Chance> chances;

}
