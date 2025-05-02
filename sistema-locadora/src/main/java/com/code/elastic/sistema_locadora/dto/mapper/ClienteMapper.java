package com.code.elastic.sistema_locadora.dto.mapper;

import com.code.elastic.sistema_locadora.dto.ClienteRequestDto;
import com.code.elastic.sistema_locadora.dto.ClienteResponseDto;
import com.code.elastic.sistema_locadora.model.Cliente;

public class ClienteMapper {

    public static Cliente toEntity(ClienteRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }

        Cliente cliente = new Cliente();
        cliente.setEmail(requestDto.email());
        cliente.setNome(requestDto.nome());

        return cliente;
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        if (cliente == null) {
            return null;
        }

        ClienteResponseDto responseDto = new ClienteResponseDto(
                cliente.getId(),
                cliente.getNome()
        );

        return responseDto;
    }
}
