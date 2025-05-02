package com.code.elastic.sistema_locadora.controller;

import com.code.elastic.sistema_locadora.dto.LocacaoRequestDto;
import com.code.elastic.sistema_locadora.dto.LocacaoResponseDto;
import com.code.elastic.sistema_locadora.dto.mapper.LocacaoMapper;
import com.code.elastic.sistema_locadora.model.Locacao;
import com.code.elastic.sistema_locadora.service.LocacaoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/locacoes")
public class LocacaoController {

    private final LocacaoService locacaoService;

    @GetMapping
    public ResponseEntity<List<LocacaoResponseDto>> listar() {
        List<Locacao> locacoes = locacaoService.listar();

        List<LocacaoResponseDto> resposta = locacoes.stream()
                .map(LocacaoMapper::toDto)
                .toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(resposta);
    }

    @PostMapping
    public ResponseEntity<LocacaoResponseDto> cadastrar(@Valid @RequestBody LocacaoRequestDto dto) {
        Locacao locacao = LocacaoMapper.toEntity(dto);
        Locacao locacaoSalva = locacaoService.alugar(locacao, dto.idCliente(), dto.idFilme());

        LocacaoResponseDto resposta = LocacaoMapper.toDto(locacaoSalva);
        return ResponseEntity.status(201).body(resposta);
    }

    @PutMapping("/{id}/devolucao")
    public ResponseEntity<LocacaoResponseDto> atualizarPorId(@PathVariable Long id) {
        Locacao locacaoAtualizado = locacaoService.devolver(id);
        LocacaoResponseDto resposta = LocacaoMapper.toDto(locacaoAtualizado);

        return ResponseEntity.status(200).body(resposta);
    }
}
