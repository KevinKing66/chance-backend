package com.kev.chance.util.helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.model.Chance;
import com.kev.chance.model.Invoice;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class ObjectHelper {

    public static String objToString(Object e) {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            // Convertir el objeto a JSON
            json = objectMapper.writeValueAsString(e);

            System.out.println("JSON result: " + json);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        } finally {
            return json;
        }
    }
/*
    public static InvoiceWithChancesDto fillInvoiceDto() {
        Invoice invoice = new Invoice();
        invoice.setCreatedByUserId("userPrueba");
        invoice.setValue(2000);
        invoice.setIva(380);
        invoice.setTotalValue(invoice.getValue() + invoice.getIva());
        invoice.setCreationDateTime(new Timestamp(System.currentTimeMillis()));
        invoice.setLocation("banco de pruebas");
        
        Chance chance1 = new Chance(1, invoice.getId(), 3, "123", 1000, "lottery_code", new Timestamp(System.currentTimeMillis()));
        Chance chance2 = new Chance(2, invoice.getId(), 3, "123", 1000, "lottery_code", new Timestamp(System.currentTimeMillis()));
        List<Chance> chances = new ArrayList();
        chances.add(chance1);
        chances.add(chance2);
        InvoiceWithChancesDto dto = new InvoiceWithChancesDto(invoice, chances);
        return dto;
    }*/
}
