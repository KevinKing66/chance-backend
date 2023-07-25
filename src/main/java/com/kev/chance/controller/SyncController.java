package com.kev.chance.controller;

import com.kev.chance.dto.InvoiceAndChancesDto;
import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.model.Lottery;
import com.kev.chance.model.LotteryWinner;
import com.kev.chance.model.User;
import com.kev.chance.service.LotteryService;
import com.kev.chance.service.LotteryWinnerService;
import com.kev.chance.service.OtherService;
import com.kev.chance.service.UserService;
import com.kev.chance.util.helper.ObjectHelper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kevin
 */
@RestController
@RequestMapping(value = "api/sync/v1", produces = "application/json")
public class SyncController {

    @Autowired
    OtherService otherService;
    @Autowired
    UserService userService;
    @Autowired
    LotteryService lotteryService;
    @Autowired
    LotteryWinnerService lotteryWinnerService;

    @RequestMapping(value = "/lotteries", method = RequestMethod.POST)
    public ResponseEntity allLotteries() {
        List<Lottery> lotteries = lotteryService.findAll();
        return ResponseEntity.ok(lotteries);
    }

    @RequestMapping(value = "/winners", method = RequestMethod.GET)
    public ResponseEntity lastWinner() {
        List<LotteryWinner> lotteries = lotteryWinnerService.findLastesWinners();
        return ResponseEntity.ok(lotteries);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity users(@RequestBody List<User> usersIn) {
        List<User> userOut = userService.syncUp(usersIn);
        return ResponseEntity.ok(userOut);
    }

    @RequestMapping(value = "/invoices", method = RequestMethod.POST)
    public ResponseEntity SaveInvoicesAndChances(@RequestBody List<InvoiceWithChancesDto> dtos) {
        dtos.forEach((e) -> e.getInvoice().setSync(1));
        InvoiceAndChancesDto res = otherService.syncInvoicesAndChances(dtos);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @RequestMapping(value = "/generate", method = RequestMethod.GET)
    public ResponseEntity generate() {
        InvoiceWithChancesDto dto = ObjectHelper.fillInvoiceDto();
        /* try {
            SaveInvoiceAndChances(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.PAYLOAD_TOO_LARGE).body("El servidor ha falladp");
        }*/
        return ResponseEntity.status(HttpStatus.OK).body(ObjectHelper.objToString(dto));
    }
}
