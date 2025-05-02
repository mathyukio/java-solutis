package com.code.elastic.sistema_locadora.repository;

import com.code.elastic.sistema_locadora.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long>{
}
