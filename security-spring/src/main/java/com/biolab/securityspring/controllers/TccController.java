package com.biolab.securityspring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("tcc")
public class TccController {

    @GetMapping
    public ResponseEntity<?> view() {
        return ResponseEntity.ok("Terminem o TCC logo");
    }

}
