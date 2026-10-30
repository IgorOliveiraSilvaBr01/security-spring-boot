package com.biolab.securityspring.entities;

import com.biolab.securityspring.entities.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    @Email
    private String email;
    @Size(min = 6)
    private String senha;
    @Size(min = 11, max = 11)
    private String cpf;
    @Enumerated(EnumType.STRING)
    private Role role;
}
