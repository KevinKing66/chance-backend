package com.kev.chance.controller;

import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.model.Lottery;
import com.kev.chance.model.LotteryWinner;
import com.kev.chance.service.LotteryService;
import com.kev.chance.service.LotteryWinnerService;
import com.kev.chance.service.OtherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kevin
 */
@RestController
@RequestMapping(value = "api/chance/v1", produces = "application/json")
public class ChanceController {

    @Autowired
    OtherService otherService;
    @Autowired
    LotteryService lotteryService;
    @Autowired
    LotteryWinnerService lotteryWinnerService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity hello() {
        return ResponseEntity.ok("hola");
    }

    @RequestMapping(value = "/lottery", method = RequestMethod.GET)
    public ResponseEntity allLotteries() {
        List<Lottery> lotteries = lotteryService.findAll();
        return ResponseEntity.ok(lotteries);
    }

    @RequestMapping(value = "/lottery", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Lottery entity) {
        lotteryService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Dato creado exitosamente");
    }

    @RequestMapping(value = "/winner", method = RequestMethod.GET)
    public ResponseEntity lastWinner() {
        List<LotteryWinner> lotteries = lotteryWinnerService.findLastesWinners();
        return ResponseEntity.ok(lotteries);
    }

    @RequestMapping(value = "/winner", method = RequestMethod.POST)
    public ResponseEntity saveLastWinner(@RequestBody LotteryWinner entity) {
        lotteryWinnerService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Dato creado exitosamente");
    }

    @RequestMapping(value = "/winner/{lotteryCode}", method = RequestMethod.GET)
    public ResponseEntity lastWinnerbyLotteryCode(@PathVariable("lotteryCode") String code) {
        List<LotteryWinner> lotteries = lotteryWinnerService.findLastestWinnersByLotteryCode(code);
        return ResponseEntity.ok(lotteries);
    }

    @RequestMapping(value = "/invoice", method = RequestMethod.POST)
    public ResponseEntity SaveInvoiceAndChances(@RequestBody InvoiceWithChancesDto dto) {
        otherService.saveInvoiceAndChance(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Dato creado exitosamente");
    }

    @RequestMapping(value = "/invoices", method = RequestMethod.POST)
    public ResponseEntity SaveInvoicesAndChances(@RequestBody List<InvoiceWithChancesDto> dtos) {
        otherService.saveInvoicesAndChances(dtos);
        return ResponseEntity.status(HttpStatus.CREATED).body("Datos creados exitosamente");
    }
}
