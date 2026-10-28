package com.biolab.securityspring.dto;

import com.biolab.securityspring.entities.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.stereotype.Service;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDto {

    private UUID id;
    private String nome;
    @Email
    private String email;
    @Size(min = 6, message = "A senha deve ter no mímino 6 caracteres")
    private String senha;
    @Enumerated(EnumType.STRING)
    private Role role;

    public UsuarioDto(String nome, String email, String senha, Role role) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
    }
}
