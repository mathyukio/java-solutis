package com.code.elastic.sistema_locadora.repository;

import com.code.elastic.sistema_locadora.model.Filme;
import com.code.elastic.sistema_locadora.model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Long>{

    boolean existsByFilmeAndDevolvidoFalse(Filme filme);
}
