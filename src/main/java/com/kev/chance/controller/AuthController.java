package com.kev.chance.controller;

import com.kev.chance.dto.LoginDto;
import com.kev.chance.model.LotteryWinner;
import com.kev.chance.model.User;
import com.kev.chance.service.UserService;
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
@RequestMapping(value = "api/auth/v1", produces = "application/json")
public class AuthController {

    @Autowired
    UserService service;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity logIn(@RequestBody LoginDto entity) {
        Object response = service.findUserByEmail(entity.getEmail());
        if (response.equals(service.noExistUser)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no existe en la base de datos");
        }
        if (response.equals(service.noExistUser)) {
            return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body("Usuario no existe en la base de datos");
        }
        return ResponseEntity.status(HttpStatus.OK).body("USUARIO VALIDADO");
    }

    @RequestMapping(value = "/logUp", method = RequestMethod.POST)
    public ResponseEntity logUp(@RequestBody User entity) {
        service.createUser(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body("El usuario ha sido creado");
    }

}
