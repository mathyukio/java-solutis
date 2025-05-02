package com.code.elastic.sistema_locadora.controller;

import com.code.elastic.sistema_locadora.dto.FilmeRequestDto;
import com.code.elastic.sistema_locadora.dto.FilmeResponseDto;
import com.code.elastic.sistema_locadora.dto.mapper.FilmeMapper;
import com.code.elastic.sistema_locadora.model.Filme;
import com.code.elastic.sistema_locadora.service.FilmeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<FilmeResponseDto>> listar() {
        List<Filme> filmes = filmeService.listar();

        List<FilmeResponseDto> resposta = filmes.stream().
                map(FilmeMapper::toDto)
                .toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(resposta);
    }

    @PostMapping
    public ResponseEntity<FilmeResponseDto> cadastrar(@Valid @RequestBody FilmeRequestDto dto) {
        Filme filme = FilmeMapper.toEntity(dto);
        Filme filmeSalvo = filmeService.cadastrar(filme);

        FilmeResponseDto resposta = FilmeMapper.toDto(filmeSalvo);
        return ResponseEntity.status(201).body(resposta);
    }
}
