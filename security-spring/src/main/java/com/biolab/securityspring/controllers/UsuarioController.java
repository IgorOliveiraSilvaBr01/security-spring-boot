package com.biolab.securityspring.controllers;

import com.biolab.securityspring.dto.UsuarioDto;
import com.biolab.securityspring.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UsuarioDto dto){
        return ResponseEntity.ok(usuarioService.saveUser(dto));
    }
}
