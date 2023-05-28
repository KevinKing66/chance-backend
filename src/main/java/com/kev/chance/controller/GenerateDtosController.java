package com.kev.chance.controller;

import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.model.LotteryWinner;
import com.kev.chance.util.helper.ObjectHelper;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kevin
 */
@RestController
@RequestMapping(value = "api/generate/dto", produces = "application/json")
public class GenerateDtosController {
    
    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ResponseEntity generate() {
        InvoiceWithChancesDto dto = ObjectHelper.fillInvoiceDto();
        return ResponseEntity.status(HttpStatus.OK).body(ObjectHelper.objToString(dto));
    }
    
    @RequestMapping(value = "/winner", method = RequestMethod.GET)
    public ResponseEntity generatewinner() {
        LotteryWinner dto = new LotteryWinner();
        dto.setDate(new java.sql.Date(new Date().getTime()));
        dto.setDigits(4);
        dto.setLotteryCode("C4uc4");
        dto.setNumberWinner("0930");
        return ResponseEntity.status(HttpStatus.OK).body(ObjectHelper.objToString(dto));
    }
}
