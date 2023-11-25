package com.kev.chance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kevin
 */
@RestController
public class Controller {
     
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity hello(){
        return ResponseEntity.ok("Hola");
    }
}
