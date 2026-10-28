package com.biolab.securityspring.repositories;

import com.biolab.securityspring.entities.Usuario;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuairoRepository extends JpaRepository<Usuario, UUID> {

}
