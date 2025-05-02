package com.code.elastic.sistema_locadora.service;

import com.code.elastic.sistema_locadora.model.Filme;
import com.code.elastic.sistema_locadora.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public Filme cadastrar(Filme filme) {
        return filmeRepository.save(filme);
    }

    public List<Filme> listar() {
        return filmeRepository.findAll();
    }
}
