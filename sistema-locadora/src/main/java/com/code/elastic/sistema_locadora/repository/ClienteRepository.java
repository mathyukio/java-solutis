package com.code.elastic.sistema_locadora.repository;

import com.code.elastic.sistema_locadora.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
