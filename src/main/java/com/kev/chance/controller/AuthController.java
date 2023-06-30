package com.kev.chance.controller;

import com.kev.chance.dto.LoginDto;
import com.kev.chance.model.LotteryWinner;
import com.kev.chance.model.User;
import com.kev.chance.service.UserService;
import jakarta.validation.Valid;
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
    public ResponseEntity logIn(@Valid @RequestBody LoginDto entity) {
        User user = service.findUserByEmailOrDoc(entity);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No está registrado el usuario");
        }
        if (!user.getPassword().equals(entity.getPassword())) {
            return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body("Contraseña invalida");
        }
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @RequestMapping(value = "/logUp", method = RequestMethod.POST)
    public ResponseEntity logUp(@RequestBody User entity) {
        
        User user = service.findUserByEmail(entity.getEmail());
        if(user != null){
            return ResponseEntity.status(400).body("Usuaurio ya existente");
        }
        service.createUser(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

}
