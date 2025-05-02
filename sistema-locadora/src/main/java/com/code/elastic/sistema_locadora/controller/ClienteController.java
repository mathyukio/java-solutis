package com.code.elastic.sistema_locadora.controller;

import com.code.elastic.sistema_locadora.dto.ClienteRequestDto;
import com.code.elastic.sistema_locadora.dto.ClienteResponseDto;
import com.code.elastic.sistema_locadora.dto.mapper.ClienteMapper;
import com.code.elastic.sistema_locadora.model.Cliente;
import com.code.elastic.sistema_locadora.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDto>> listar(){
        List<Cliente> clientes = clienteService.listar();

        List<ClienteResponseDto> resposta = clientes.stream()
                .map(ClienteMapper::toDto)
                .toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(resposta);
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDto> cadastrar(@Valid @RequestBody ClienteRequestDto dto) {
        Cliente cliente = ClienteMapper.toEntity(dto);
        Cliente clienteSalvo = clienteService.cadastrar(cliente);

        ClienteResponseDto resposta = ClienteMapper.toDto(clienteSalvo);

        return ResponseEntity.status(201).body(resposta);
    }


}
